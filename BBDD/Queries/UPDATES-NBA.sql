SELECT * FROM JUGADORES;
SELECT * FROM JUGADORES2;
SELECT * INTO  JUGADORESPESO FROM JUGADORES;
CREATE TABLE JUGADORES2(
CODIGO INT,
NOMBRE VARCHAR (50),
PROCEDENCIA VARCHAR (50),
ALTURA VARCHAR (50),
PESO VARCHAR (50),
POSICION VARCHAR (50),
NOMBRE_EQUIPO VARCHAR (50)
);
DROP TABLE JUGADORESPESO;
SET SQL_SAFE_UPDATES=0;
update jugadores SET peso=peso*0.453592;
select codigo, Nombre, Procedencia, round((SUBSTRING(altura, 1, 1)*30.48)+(SUBSTRING(altura, 3, 2)*2.54),2) as AlturaCM, Peso, Posicion, Nombre_equipo from jugadores order by alturacm desc;
update jugadores SET altura=round((SUBSTRING(altura, 1, 1)*30.48)+(SUBSTRING(altura, 3, 2)*2.54),1);