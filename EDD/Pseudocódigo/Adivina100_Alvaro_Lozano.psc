Proceso Adivina100_Alvaro_Lozano
	//Análisis: La aplicación debe generar un número del 1 al 100 mediante alguna función pseudoaleatoria y almacenarlo.
	// Luego de generar el número debemos inicializar el contador de intentos en cero y la variable en la que almacenaremos
	// la respuesta del usuario.
	// Con estas tres variables dispuestas, empezaremos el juego: generando un bucle que dure 10 iteraciones o
	// hasta que se acierte el número. Durante estas iteraciones se emitirá la pista de si es mayor o menor que
	// el número que el usuario introduzca.
	// En caso de no llegar a adivinarlo se le mostrará el número y un mensaje de consolación.
	//Diseño: Establecemos la variable numR para nuestro número aleatorio, la variable numIn para el número del usuario y
	// la variable intentos para el número de iteraciones que bien ha tomado al usuario para adivinarlo o para detener el
	// bucle una vez este numero sea 10. Con un bucle mientras se establece como condición que intentos sea menor que 10
	// o que numIn no sea igual a numR pediremos al usuario un número y lo compararemos con el número aleatorio para
	// ofrecerle una pista de si es mayor o menor con dos Si que contemplen ambos casos.
	// Dentro de la pista, para ahorrarnos una condición Si, le indicamos cuántos intentos le quedan al usuario.
	// Fuera del bucle se establece un Si con condicion que numR sea igual a numIn, lo que mostrará al usuario
	// su número de intentos con el valor de la variable intentos. Si el número de intentos llegó a 10, la condición del
	// SiNo que hemos colocado en el Si se activará y mostrará el número que se tenía que adivinar y un mensaje de consolación.
	Definir numR, numIn, intentos Como Entero;
	intentos<-0;
	numIn<-0;
	numR<-azar(100);
	Escribir numR;
	Mientras 10>intentos Y numR<>numIn Hacer
		intentos<-intentos+1;
		Escribir "";
		Escribir "Di un número: ";
		Leer numIn;
		Si numR<numIn Entonces
			Escribir "El número es menor.";
			Escribir "Te quedan ",(10-intentos)," intentos.";
		FinSi
		Si numR>numIn Entonces
			Escribir "El número es mayor.";
			Escribir "Te quedan ",(10-intentos)," intentos.";
		FinSi
	FinMientras
	Si numR=numIn Entonces
		Escribir "¡Adivinaste el número en ",intentos," intentos!";
	SiNo
		Escribir "El número era: ",numR,". ¡Vuelve a intentarlo!";
	FinSi
FinProceso