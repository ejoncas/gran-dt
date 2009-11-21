
-- GranDT BD Update 1

use grandt;
alter table Torneo add tipo_doc char(3) not null;
alter table Torneo add nro_doc bigint not null;

alter table Usuario add primary key (tipo_doc, nro_doc);
alter table Contacto add primary key (tipo_doc, nro_doc);
alter table Torneo add foreign key (tipo_doc, nro_doc) references Usuario(tipo_doc,nro_doc);
