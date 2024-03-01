/* PROCEDIMIENTOS Y FUNCIONES */ 
/* @Autor: AlvaroLozano - 12/02/2024 */
/*
###################################################### FUNCIONES
########################### CALCULAR_IVA() ###########################

CREATE DEFINER=`root`@`localhost` FUNCTION `CALCULAR_IVA`(TOTAL DOUBLE) RETURNS int(11)
BEGIN
DECLARE IVA DOUBLE;
SET IVA=ROUND((TOTAL*0.21),2);
RETURN IVA;
END

########################### CALCULAR_SUBTOTAL() ######################

CREATE DEFINER=`root`@`localhost` FUNCTION `CALCULAR_SUBTOTAL`(TOTAL DOUBLE) RETURNS double
BEGIN
DECLARE SUBTOTAL DOUBLE;
SET SUBTOTAL=ROUND((TOTAL-CALCULAR_IVA(TOTAL)),2);
RETURN SUBTOTAL;
END

###################################################### PROCEDIMIENTOS
########################### INSERTAR_USUARIOS() ######################

CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERTAR_USUARIOS`(NOMBRE_USUARIO VARCHAR(150),CONTRASEÑA VARCHAR(255),NOMBRE_CLIENTE VARCHAR(100),APEL1 VARCHAR(100),APEL2 VARCHAR(100),TLF VARCHAR(20),EMAIL VARCHAR(150),DIRECCION VARCHAR(200),CIUDAD VARCHAR(50),CP VARCHAR(10))
BEGIN
INSERT INTO USUARIOS(NOMBRE_USUARIO,CONTRASEÑA,NOMBRE_CLIENTE,APEL1,APEL2,TLF,EMAIL,DIRECCION,CIUDAD,CP)VALUES(NOMBRE_USUARIO,CONTRASEÑA,NOMBRE_CLIENTE,APEL1,APEL2,TLF,EMAIL,DIRECCION,CIUDAD,CP);
END

########################### MODIFICAR_DATOS() ########################

CREATE DEFINER=`root`@`localhost` PROCEDURE `MODIFICAR_DATOS`(CODUSU INT,NOMBRE_USUARIO VARCHAR(150),CONTRASEÑA VARCHAR(255),NOMBRE_CLIENTE VARCHAR(100),APEL1 VARCHAR(100),APEL2 VARCHAR(100),TLF VARCHAR(20),EMAIL VARCHAR(150),DIRECCION VARCHAR(200),CIUDAD VARCHAR(50),CP VARCHAR(10))
BEGIN
UPDATE USUARIOS SET NOMBRE_USUARIO=NOMBRE_USUARIO WHERE COD=CODUSU;
UPDATE USUARIOS SET CONTRASEÑA=CONTRASEÑA WHERE COD=CODUSU;
UPDATE USUARIOS SET NOMBRE_CLIENTE=NOMBRE_CLIENTE WHERE COD=CODUSU;
UPDATE USUARIOS SET APEL1=APEL1 WHERE COD=CODUSU;
UPDATE USUARIOS SET APEL2=APEL2 WHERE COD=CODUSU;
UPDATE USUARIOS SET TLF=TLF WHERE COD=CODUSU;
UPDATE USUARIOS SET EMAIL=EMAIL WHERE COD=CODUSU;
UPDATE USUARIOS SET DIRECCION=DIRECCION WHERE COD=CODUSU;
UPDATE USUARIOS SET CIUDAD=CIUDAD WHERE COD=CODUSU;
UPDATE USUARIOS SET CP=CP WHERE COD=CODUSU;
END

########################### GENERAR_FACTURA() ########################

CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERAR_FACTURA`(REF_VENTA INT)
BEGIN
DECLARE CODIGOUSUARIO INT;
SET CODIGOUSUARIO=(SELECT CODUSU FROM VENTAS WHERE REF=REF_VENTA);
INSERT INTO FACTURAS(CODUSU,REF_VENTA,FECHA_VENTA,SUBTOTAL,IVA,TOTAL,METODOPAGO)VALUES(CODIGOUSUARIO,REF_VENTA,(SELECT FECHA FROM VENTAS WHERE REF=REF_VENTA),CALCULAR_SUBTOTAL(TOTAL_CARRITO(CODIGOUSUARIO),CALCULAR_IVA(TOTAL_CARRITO(CODIGOUSUARIO)),TOTAL_CARRITO(CODIGOUSUARIO),(SELECT METODOPAGO FROM VENTAS WHERE REF=REF_VENTA));
END
----------------------NOTA: PONER DATETIME EN EL CAMPO FECHA_VENTA DE LA TABLA FACTURAS, SI NO EL TIMESTAMP DE VENTAS SE CORTA Y SOLO DEJA LA FECHA-----------------------------------------
*/