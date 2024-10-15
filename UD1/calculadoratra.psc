Algoritmo calculadora
	//caalculator
	definir a, b Como Real
	Definir resultado Como Real
	definir opciones como cadena
	//Falta por ponerle *, exponente, logaritmo,
	Mientras  opciones <> "s"
		escribir "que quieres (+,-,/,raiz,*)"
		leer opciones
		si opciones = "s"
			escribir "fin"
			
		sino 
			si opciones <> "raiz"  entonces
				Escribir "introduce un número"
				leer a
				Escribir "introduce otro número"
				leer b	
			sino 
				Escribir "introduce un número"
				leer a
			FinSi
		FinSi
		
		segun opciones hacer
			caso "+":
				resultado = suma(a,b)
			caso "-":
				resultado = resta(a,b)
			caso "/":
				resultado = division(a,b)
			caso "raiz":
				resultado = RAIZ(a)
			De Otro Modo:
				resultado = 0
		FinSegun
		
		si resultado <> 0
			Escribir "resultado :", resultado
		FinSi
	FinMientras
	
	
FinAlgoritmo

Funcion resultado=suma(a,b)
	resultado = a +b
FinFuncion

Funcion resultado=resta(a,b)
	resultado = a - b
FinFuncion

Funcion resultado=division(a,b)
	si a<>0 Y b<>0 Entonces
		resultado = a/b
	FinSi
FinFuncion
Funcion resultado = valorabsoluto(a,b)
	resultado <- abs(a + b)
FinFuncion
Funcion resultado = logaritmonatural(a,b)
	resultado <- ln(a+b)
FinFuncion
Funcion resultado = funcionexponencial(a,b)
	resultado <- exp(a+b)
FinFuncion
Funcion resultado = seno(a,b)
	resultado <- sen(a+b)
FinFuncion
Funcion resultado = coseno(a,b)
	resultado <-  cos(a+b)
FinFuncion
