
create trigger trg_update_teams
on Jugador
after update
as
    if update(puntaje)
    begin
		--actualizamos todos los puntajes de todos los equipos que tienen ese jugador
        update equipo
        set puntaje = (    
                        select nuevoPuntaje=
								case 
									when sum(j.puntaje) is not null then sum(j.puntaje)+equipo.puntaje --sumamos a lo que ya tenia
									when sum(j.puntaje) is null then equipo.puntaje
								end
                        from inserted j
                        inner join EquipoJugador ej
                            on ej.jugador_fk = j.id
                        where equipo.id = ej.equipo_fk and ej.titular=1
                        )
        --restringimos a solo los que tienen el jugador con puntaje nuevo en su equipo
        where equipo.id IN (select e.id
                                from inserted j
                                inner join EquipoJugador ej
                                    on ej.jugador_fk = j.id
                                inner join Equipo e
                                    on e.id = ej.equipo_fk
                                group by e.id)

		--actualizamos los puntajes de ese equipo en los torneos de amigos que participa
		update posiciones
		set puntaje = (select nuevoPuntaje = 
								case
									when sum(j.puntaje) is not null then sum(j.puntaje)+posiciones.puntaje--sumamos lo que ya tenia en el torneo de amigos
									when sum(j.puntaje) is null then posiciones.puntaje
								end
						from inserted j
						inner join EquipoJugador ej
							on ej.jugador_fk = j.id
						where posiciones.equipo_fk = ej.equipo_fk and ej.titular=1)
		where posiciones.participa = 1 and posiciones.equipo_fk IN (select e.id
                                from inserted j
                                inner join EquipoJugador ej
                                    on ej.jugador_fk = j.id
                                inner join Equipo e
                                    on e.id = ej.equipo_fk
                                group by e.id)
    end
go