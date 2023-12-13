Proceso Adivina100_Alvaro_Lozano
	//An�lisis: La aplicaci�n debe generar un n�mero del 1 al 100 mediante alguna funci�n pseudoaleatoria y almacenarlo.
	// Luego de generar el n�mero debemos inicializar el contador de intentos en cero y la variable en la que almacenaremos
	// la respuesta del usuario.
	// Con estas tres variables dispuestas, empezaremos el juego: generando un bucle que dure 10 iteraciones o
	// hasta que se acierte el n�mero. Durante estas iteraciones se emitir� la pista de si es mayor o menor que
	// el n�mero que el usuario introduzca.
	// En caso de no llegar a adivinarlo se le mostrar� el n�mero y un mensaje de consolaci�n.
	//Dise�o: Establecemos la variable numR para nuestro n�mero aleatorio, la variable numIn para el n�mero del usuario y
	// la variable intentos para el n�mero de iteraciones que bien ha tomado al usuario para adivinarlo o para detener el
	// bucle una vez este numero sea 10. Con un bucle mientras se establece como condici�n que intentos sea menor que 10
	// o que numIn no sea igual a numR pediremos al usuario un n�mero y lo compararemos con el n�mero aleatorio para
	// ofrecerle una pista de si es mayor o menor con dos Si que contemplen ambos casos.
	// Dentro de la pista, para ahorrarnos una condici�n Si, le indicamos cu�ntos intentos le quedan al usuario.
	// Fuera del bucle se establece un Si con condicion que numR sea igual a numIn, lo que mostrar� al usuario
	// su n�mero de intentos con el valor de la variable intentos. Si el n�mero de intentos lleg� a 10, la condici�n del
	// SiNo que hemos colocado en el Si se activar� y mostrar� el n�mero que se ten�a que adivinar y un mensaje de consolaci�n.
	Definir numR, numIn, intentos Como Entero;
	intentos<-0;
	numIn<-0;
	numR<-azar(100);
	Escribir numR;
	Mientras 10>intentos Y numR<>numIn Hacer
		intentos<-intentos+1;
		Escribir "";
		Escribir "Di un n�mero: ";
		Leer numIn;
		Si numR<numIn Entonces
			Escribir "El n�mero es menor.";
			Escribir "Te quedan ",(10-intentos)," intentos.";
		FinSi
		Si numR>numIn Entonces
			Escribir "El n�mero es mayor.";
			Escribir "Te quedan ",(10-intentos)," intentos.";
		FinSi
	FinMientras
	Si numR=numIn Entonces
		Escribir "�Adivinaste el n�mero en ",intentos," intentos!";
	SiNo
		Escribir "El n�mero era: ",numR,". �Vuelve a intentarlo!";
	FinSi
FinProceso