// An�lisis
// Entradas: Radio del circulo (Variable RADIO).
// Salidas: Per�metro y �rea del c�rculo
// Variables:  RADIO, AREA, PERIMETRO de tipo REAL
Proceso sin_titulo
	Definir radio, area, perimetro Como Real;
	Escribir 'Introduce el radio de la circunfenrecia:';
	Leer radio;
	area <- PI*radio^2;
	perimetro <- 2*PI*radio;
	Escribir 'El �rea es ', area;
	Escribir 'El per�metro es ', perimetro;
FinProceso
