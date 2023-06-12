create database proyecto_obra;

use proyecto_obra;

SET SQL_SAFE_UPDATES = 0;

alter table general auto_increment = 1;

#---------------------------------------

#ENTIDAD Person  =>

Select * from persons;

Select * from persons where id = 1;

Delete from persons where id = 1;

Update persons set estado = "activo" where id = 1;

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