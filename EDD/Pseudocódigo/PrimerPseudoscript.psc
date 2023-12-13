// Análisis
// Entradas: Radio del circulo (Variable RADIO).
// Salidas: Perímetro y área del círculo
// Variables:  RADIO, AREA, PERIMETRO de tipo REAL
Proceso sin_titulo
	Definir radio, area, perimetro Como Real;
	Escribir 'Introduce el radio de la circunfenrecia:';
	Leer radio;
	area <- PI*radio^2;
	perimetro <- 2*PI*radio;
	Escribir 'El área es ', area;
	Escribir 'El perímetro es ', perimetro;
FinProceso
