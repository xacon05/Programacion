Algoritmo calculadora
    Definir num1, num2, num3, suma, resta, multi Como Entero
    Definir dividir Como Real
    Escribir "Calculadora"
    Escribir "1. Suma"
    Escribir "2. Resta"
    Escribir "3. Multiplicaci�n"
    Escribir "4. Dividir"
    Escribir "5. Ra�z cuadrada"

    Leer num1
    
    Si num1 = 1 Entonces
        Escribir "Suma"
        Escribir "Primer n�mero: "
        Leer num2
        Escribir "Segundo n�mero: "
        Leer num3
        suma = num2 + num3
        Escribir "El resultado es: ", suma
    FinSi
    
    Si num1 = 2 Entonces
        Escribir "Resta"
        Escribir "Primer n�mero: "
        Leer num2
        Escribir "Segundo n�mero: "
        Leer num3
        resta = num2 - num3
        Escribir "El resultado es: ", resta
    FinSi
    
    Si num1 = 3 Entonces
        Escribir "Multiplicaci�n"
        Escribir "Primer n�mero: "
        Leer num2
        Escribir "Segundo n�mero: "
        Leer num3
        multi = num2 * num3
        Escribir "El resultado es: ", multi
    FinSi
    
    Si num1 = 4 Entonces
        Escribir "Dividir"
        Escribir "Primer n�mero: "
        Leer num2
        Escribir "Segundo n�mero: "
        Leer num3
        Si num3 <> 0 Entonces
            dividir = num2 / num3
            Escribir "El resultado es: ", dividir
        Sino
            Escribir "Error: No se puede dividir entre 0"
        FinSi
    FinSi
    
    Si num1 = 5 Entonces
        Escribir "Ra�z cuadrada"
        Escribir "Introduce el n�mero:"
        Leer num2
        Si num2 >= 0 Entonces
            raiz = Ra�zCuadrada(num3)
            Escribir "El resultado es: ", raizcuadrada
        Sino
            Escribir "Error: El n�mero debe ser positivo o cero"
        FinSi
    FinSi

FinAlgoritmo
