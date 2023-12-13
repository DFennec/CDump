create database nba;
create database world;
USE NBA;
select * from equipos;
select * from jugadores;
select conferencia,count(*) from equipos group by conferencia;

select conferencia,count(*) from equipos inner join jugadores on equipos.nombre = jugadores.Nombre_equipo group by conferencia;