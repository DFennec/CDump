/*DELIMITER //
	CREATE TRIGGER EVALUA
    BEFORE UPDATE ON ALUMNOS
    FOR EACH ROW
    BEGIN
    
    SET NEW CALIFICACION = (SELECT NOTALETA(NEW NOTA))
    IF NEW.CALIFICACION <> "SUSPENSO" THEN
		INSERT INTO ACTAS VALUES(null, new.nombre,new.nota,sysdate());
    END IF;
    END;
DELIMITER ;*/
CREATE DATABASE GRAN_HERMANO;
USE GRAN_HERMANO;

CREATE TABLE contactos (
COD INT PRIMARY KEY auto_increment,
NOMBRE VARCHAR(30),
FNACI DATE);

CREATE TABLE registros(
ID INT NOT NULL,
FECHA DATE,
USUARIO VARCHAR(30));

CREATE TABLE TABLABACKUP(
COD INT PRIMARY KEY auto_increment,
NOMBRE VARCHAR(30),
FNACI DATE);

show triggers;
insert into contactos(Nombre,fnaci) values("Pepote","1923-11-27");

drop table TABLABACKUP;
drop table contactos;
drop table registros;

select * from registros;
select * from contactos;
select * from TABLABACKUP;

set sql_safe_updates=0;
delete from contactos where cod=3;