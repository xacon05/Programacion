Algoritmo Triangulo
    Definir a Como Entero
    Definir b Como Entero
    Definir c Como Entero
    Escribir "Escribe la longitud de los lados del tri�ngulo:"
    Escribir "Lado a:"
    Leer a
    Escribir "Lado b:"
    Leer b
    Escribir "Lado c:"
    Leer c
	
    Si a + b > c y a + c > b y c + b > a Entonces
        Si a = b Y b = c Entonces
            Escribir "El tri�ngulo es equil�tero."
        Sino
            Si a = b O b = c O a = c Entonces
                Escribir "El tri�ngulo es is�sceles."
            Sino
                Escribir "El tri�ngulo es escaleno."
            FinSi
        FinSi
    Sino
        Escribir "Las longitudes no forman un tri�ngulo."
    FinSi
FinAlgoritmo
