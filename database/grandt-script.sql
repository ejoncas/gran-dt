use master;

--Create database for Grand DT
CREATE DATABASE grandt;

use grandt;


--Create tables for Grand DT

-- Jugador
create table Jugador (
	--identity it's like auto_increment in mysql. Syntaxis: IDENTITY [ (seed , increment) ]
	id int not null identity(1,1),
	nombre varchar(20) not null,
	apellido varchar(20) not null,
	equipo varchar(30) not null,
	nacimiento datetime not null,
	puntaje int,
	precio money not null,
	posicion char(3) not null
	);

-- Constraints


-- drop table Jugador;
	
--Usuario	
create table Usuario(
	tipo_doc char(3) not null,
	nro_doc bigint not null,
--	username varchar(20) not null,
	password varchar(20) not null,
	nacimiento datetime not null,
	nombre varchar(20) not null,
	apellido varchar(20) not null,
	sexo char(1) not null,
	equipo_hincha varchar(30) not null,
	monto money not null,
	monto_gastado money not null,
	equipo_fk int not null
	);

-- Constraints


--drop table Usuario;


create table Contacto (
	tipo_doc char(3) not null,
	nro_doc bigint not null,
	email varchar(50) not null,
	provincia varchar(20) not null,
	partido varchar(20) not null,
	localidad varchar(20) not null,
	calle varchar(20) not null,
	numero int not null,
	piso int,
	depto char(1),
	codigo_postal int not null,
	telefono_particular bigint not null,
	celular bigint,
	proveedor_celular varchar(30)
	);
	
-- Constraints	



--drop table Contacto;


--Equipo

create table Equipo(
	id int not null identity(1,1),
	nombre varchar(30) not null,
	puntaje int
--	puntaje_acumulado int
);

-- Constraints


--drop table Equipo;


--EquipoJugador

create table EquipoJugador(
	equipo_fk int not null,
	jugador_fk int not null,
	--we save 1 if the player is 'titular'. Otherwise, we save 0. Boolean datatype it's not supported on MSSQLServer
	titular bit not null
	);
	
--Constraints

--drop table EquipoJugador

-- Torneo

create table Torneo(
	id int not null identity(1,1),
	nombre varchar(40) not null
	);
	
--Constraints

--drop table Torneo;


--EquipoTorneo
create table EquipoTorneo(
	equipo_fk int not null,
	torneo_fk int not null,
	participa bit not null
	);
	
--Constraint
alter table EquipoTorneo add primary key (equipo_fk, torneo_fk);

alter table EquipoTorneo add foreign key (equipo_fk) references Equipo(id);
alter table EquipoTorneo add foreign key (torneo_fk) references Torneo(id);
--drop table EquipoTorneo;

--Posiciones
create table Posiciones(
	torneo_fk int not null,
	equipo_fk int not null,
	puntaje int
	);	
	
--Constraints
alter table Posiciones add primary key (torneo_fk, equipo_fk);

alter table Posiciones add foreign key (torneo_fk) references Torneo (id);
alter table Posiciones add foreign key (equipo_fk) references Equipo(id);

--drop table Posiciones;

	
	
	