Proceso MyHSector
	DEFINIR CH,CM,CT Como Entero;
	DEFINIR PH,PM Como Real;
	Escribir "Ingrese numero de hombres";
	leer CH;
	Escribir "Ingrese numero de mujeres";
	leer CM;
	Escribir "Hay",CM," mujeres y ",CH," hombres.";
	CT<-CM+CH;
	PH<-(CH/CT)*100;
	PM<-(CM/CT)*100;
	Escribir "Porcentaje Hombres: ",TRUNC(PH),",5 %";
	Escribir "Porcentaje Mujeres: ",TRUNC(PM),",5 %";
FinProceso
