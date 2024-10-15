Algoritmo Triangulo
    Definir a Como Entero
    Definir b Como Entero
    Definir c Como Entero
    Escribir "Escribe la longitud de los lados del triángulo:"
    Escribir "Lado a:"
    Leer a
    Escribir "Lado b:"
    Leer b
    Escribir "Lado c:"
    Leer c
	
    Si a + b > c y a + c > b y c + b > a Entonces
        Si a = b Y b = c Entonces
            Escribir "El triángulo es equilátero."
        Sino
            Si a = b O b = c O a = c Entonces
                Escribir "El triángulo es isósceles."
            Sino
                Escribir "El triángulo es escaleno."
            FinSi
        FinSi
    Sino
        Escribir "Las longitudes no forman un triángulo."
    FinSi
FinAlgoritmo
