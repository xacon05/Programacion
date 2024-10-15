Algoritmo sin_titulo
	definir resultado, numero1 Como Entero
    Leer numero1
	x= parInpar(numero1)
    Escribir x
	FinAlgoritmo

Funcion x = parInpar(numero1)
    Si numero1 % 2 = 0 Entonces
        x= " es par"
    Sino
        x= " es impar"
    FinSi
FinFuncion
