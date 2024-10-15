Algoritmo CalculadoraBasica
    Definir num1, num2 como entero
    Definir operacion como entero
    Definir resultado como real
	
    Escribir "Bienvenido a la calculadora básica"
    Escribir "Seleccione una operación:"
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicación"
    Escribir "4. División"
    
    Leer operacion
	
    Escribir "Ingrese el primer número:"
    Leer num1
	
    Escribir "Ingrese el segundo número:"
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
				Escribir "El resultado de la multiplicación es: ", resultado
			 Si operacion = 4 Entonces
					Si num2 <> 0 Entonces
						resultado = num1 / num2
						Escribir "El resultado de la división es: ", resultado
					Sino
						Escribir "Error: División por cero no permitida."
					Fin Si
				Sino
					Escribir "Operación no válida."
				Fin Si
				
FinAlgoritmo

