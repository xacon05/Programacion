Algoritmo CalculadoraBasica
    Definir num1, num2 como entero
    Definir operacion como entero
    Definir resultado como real
	
    Escribir "Bienvenido a la calculadora b�sica"
    Escribir "Seleccione una operaci�n:"
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicaci�n"
    Escribir "4. Divisi�n"
    
    Leer operacion
	
    Escribir "Ingrese el primer n�mero:"
    Leer num1
	
    Escribir "Ingrese el segundo n�mero:"
    Leer num2
	
    Si operacion = 1 Entonces
        resultado = num1 + num2
		finsi
        Escribir "El resultado de la suma es: ", resultado
      Si operacion = 2 Entonces
		  resultado = num1 - num2
		  finsi
			Escribir "El resultado de la resta es: ", resultado
		 Si operacion = 3 Entonces
			 resultado = num1 * num2
			 finsi
				Escribir "El resultado de la multiplicaci�n es: ", resultado
			 Si operacion = 4 Entonces
					Si num2 <> 0 Entonces
						resultado = num1 / num2
						Escribir "El resultado de la divisi�n es: ", resultado
					Sino
						Escribir "Error: Divisi�n por cero no permitida."
					Fin Si
				Sino
					Escribir "Operaci�n no v�lida."
				Fin Si
				
FinAlgoritmo

