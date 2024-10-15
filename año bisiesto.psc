Algoritmo año_bisiesto
Definir año como entero

Escribir "Escribe un año:"
Leer año

Si (año mod 4 = 0) Entonces
	Si (año mod 100 = 0) Entonces
		Si (año mod 400 = 0) Entonces
			Escribir "El año ", año, " es bisiesto."
		Sino
			Escribir "El año ", año, " no es bisiesto."
		FinSi
	Sino
		Escribir "El año ", año, " es bisiesto."
	FinSi
Sino
	Escribir "El año ", año, " no es bisiesto."
FinSi
FinAlgoritmo
