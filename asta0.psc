Algoritmo sin_titulo
    definir num1, num, resultado Como entero
    num1 = 1
	
    Escribir "Ingrese el número con el que quiere ver la tabla de multiplicar (0 para salir):"
    leer num
	
    Mientras num <> 0 Hacer
        Repetir
            resultado = num1 * num
            Escribir num1, " x ", num, " = ", resultado
            num1 = num1 + 1
        Hasta Que num1 = 11
		
        Escribir "Ingrese el número con el que quiere ver la tabla de multiplicar (0 para salir):"
        leer num
    FinMientras
	
    Escribir "Fin del programa."
FinAlgoritmo
