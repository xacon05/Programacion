Algoritmo a�o_bisiesto
Definir a�o como entero

Escribir "Escribe un a�o:"
Leer a�o

Si (a�o mod 4 = 0) Entonces
	Si (a�o mod 100 = 0) Entonces
		Si (a�o mod 400 = 0) Entonces
			Escribir "El a�o ", a�o, " es bisiesto."
		Sino
			Escribir "El a�o ", a�o, " no es bisiesto."
		FinSi
	Sino
		Escribir "El a�o ", a�o, " es bisiesto."
	FinSi
Sino
	Escribir "El a�o ", a�o, " no es bisiesto."
FinSi
FinAlgoritmo
