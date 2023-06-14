create database proyecto_obra;

use proyecto_obra;

SET SQL_SAFE_UPDATES = 0;

alter table general auto_increment = 1;

#---------------------------------------

#ENTIDAD Person  =>

Select * from persons;

Select * from persons where id = 1;

Delete from persons where id = 2;

Update persons set first_name = "Federico", last_name = "Sabatini", dni = "31029020", company = "Friolatina", position = "adm", record = "8652", state = "activo", date_create = "2023-06-01", date_update = "2023-06-06", date_delete = "1900-01-01" where id = 1;

Update persons set state = "inactivo", date_delete = curdate() where id = 1;

Delete from persons;

alter table persons auto_increment = 1;

#---------------------------------------

#Entidad Users =>


Select * from users;

Select * from users where id = 1;

Delete from users where id = 1;

Update users set estado = "inactivo" where id = 1;

Delete from users;

alter table users auto_increment = 1;

#---------------------------------------

#Entidad Roles =>


Select * from roles;

Select * from roles where id = 1;

Delete from roles where id = 1;

Update roles set estado = "inactivo" where id = 1;

Delete from roles;

alter table roles auto_increment = 1;

#---------------------------------------

#Entidad Generals =>


Select * from generals;

Select * from generals where id = 1;

Delete from generals where id = 1;

Update generals set estado = "inactivo" where id = 1;

Delete from generals;

alter table generals auto_increment = 1;

#---------------------------------------


#Entidad Visits =>


Select * from visits;

Select * from visits where id = 1;

Delete from visits where id = 1;

Update visits set estado = "inactivo" where id = 1;

Delete from visits;

alter table visits auto_increment = 1;

#---------------------------------------

#Entidad Material =>


Select * from materials;

Select * from materials where id = 1;

Delete from materials where id = 1;

Update materials set estado = "inactivo" where id = 1;

Delete from materials;

alter table materials auto_increment = 1;

#---------------------------------------

#Entidad Structures =>


Select * from structures;

Select * from structures where id = 1;

Delete from structures where id = 1;

Update structures set estado = "inactivo" where id = 1;

Delete from structures;

alter table structures auto_increment = 1;

#---------------------------------------

#Entidad Mountings =>


Select * from mountings;

Select * from mountings where id = 1;

Delete from mountings where id = 1;

Update mountings set estado = "inactivo" where id = 1;

Delete from mountings;

alter table structures auto_increment = 1;

#---------------------------------------

#Entidad Conclusions =>


Select * from conclusions;

Select * from conclusions where id = 1;

Delete from conclusions where id = 1;

Update conclusions set estado = "inactivo" where id = 1;

Delete from conclusions;

alter table conclusions auto_increment = 1;

#---------------------------------------

#Entidad Profilings =>


Select * from profilings;

Select * from profilings where id = 1;

Delete from profilings where id = 1;

Update profilings set estado = "inactivo" where id = 1;

Delete from profilings;

alter table profilings auto_increment = 1;

#---------------------------------------

#Entidad Subjects =>


Select * from subjects;

Select * from subjects where id = 1;

Delete from subjects where id = 1;

Update subjects set estado = "inactivo" where id = 1;

Delete from subjects;

alter table subjects auto_increment = 1;

#---------------------------------------


#Entidad Walls =>


Select * from walls;

Select * from walls where id = 1;

Delete from walls where id = 1;

Update walls set estado = "inactivo" where id = 1;

Delete from walls;

alter table walls auto_increment = 1;

#---------------------------------------

#Entidad Roofs =>


Select * from roofs;

Select * from roofs where id = 1;

Delete from roofs where id = 1;

Update roofs set estado = "inactivo" where id = 1;

Delete from roofs;

alter table roofs auto_increment = 1;

#---------------------------------------

#Entidad Cameras =>


Select * from cameras;

Select * from cameras where id = 1;

Delete from cameras where id = 1;

Update cameras set estado = "inactivo" where id = 1;

Delete from cameras;

alter table cameras auto_increment = 1;

#---------------------------------------

