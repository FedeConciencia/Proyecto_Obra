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