Algoritmo VINACUR_LEOPOLDO
	///EJERCICIO INTEGRADOR
	///El apocalipsis Zombie se ha desatado, pero aún hay esperanza. El Dr. Galard ha conseguido aislar el gen Z analizando
	///muestras genéticas codificadas. Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro
///posibles bases (A,B,C,D), por ejemplo: "ACDDCADBCDABDBBA". Para poder detectar el gen Z, se representa la
		///muestra como una matriz cuadrada (MxM) y se busca en las dos diagonales principales que todas las bases sean
	///iguales
	////Galard aclara que para que la muestra sea válida el orden de la matriz (el valor de M) debe ser 3, 4 o 37. Por desgracia,
		////de antemano no es posible saber el orden de la matriz y el mismo debe ser inferido de la muestra ingresada.
	////Tu misión: hacer un programa que permita ingresar una muestra completa, detectar si es válida, y de ser así, que
	////imprima la matriz y muestre un mensaje que indique si se ha detectado o no el gen Z.
	
	definir muestra, matriz , diagonal1, diagonal2  Como caracter
	definir i, j, n , largo como entero
	
	escribir "ingrese la muestra genética codificada"
	leer muestra
	largo = Longitud(muestra)
	n=trunc(rc(largo))   
	dimension matriz(n,n)
	Dimension diagonal1(n)
	dimension diagonal2(n)
	llenado(matriz,muestra,n)
	dibujar(matriz,muestra,n)
	comprobacion(matriz,diagonal1,n)
	comprobacion2(matriz,diagonal2,n)
	
	
FinAlgoritmo

SubProceso llenado(matriz,muestra,n)
	definir i, j , h Como Entero
	i=0
	j=0
	h=0
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			matriz(i,j) = subcadena(muestra,h,h)
			h=h+1
		FinPara
	FinPara

FinSubProceso

SubProceso dibujar(matriz,muestra,n)
	definir i, j , h Como Entero
	i=0
	j=0
	h=0
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			escribir matriz(i,j) Sin Saltar
		FinPara
		escribir ""
	FinPara
Escribir ""
FinSubProceso
////////////////////////////////////////////////////////////////////////////////
subproceso comprobacion(matriz,diagonal1,n)

	definir i, j , h  Como Entero
	definir comp como logico
comp=falso
i=0
j=0
h=0
para i=0 hasta n-1 Hacer
	para j=0 hasta n-1 Hacer
		si i=j Entonces
			diagonal1(h) = matriz(i,j)
			h=h+1
		FinSi
	FinPara
FinPara
para h=0 hasta n-1 hacer
	escribir diagonal1(h) Sin Saltar	
	 
FinPara
escribir " =CODIGO GENETICO DIAGONAL 1"
escribir ""
escribir ""

para i=0 hasta n-1 Hacer
	si diagonal1(0) <> diagonal1(i) Entonces
		comp=Falso
	SiNo
		comp=Verdadero
	FinSi
		
FinPara

si comp = verdadero entonces
	escribir "La diagonal 1 tiene todas las letras iguales. Puede estar el GEN Z en esta cadena"
SiNo
	escribir "La diagonal 2 NO tiene las letras iguales"
FinSi
escribir ""
escribir ""

FinSubProceso

/////////////////////////////////////////////////////////////////////////


subproceso comprobacion2(matriz,diagonal2,n)
	
	definir i, j , h  Como Entero
	definir comp como logico
	comp=falso
	i=0
	j=0
	h=0
	para i=0 hasta n-1 Hacer
		para j=0 hasta n-1 Hacer
			si i+j = n-1 Entonces
				diagonal2(h) = matriz(i,j)
				h=h+1
			FinSi
		FinPara
	FinPara
	para h=0 hasta n-1 hacer
		escribir diagonal2(h) Sin Saltar	
		
	FinPara
	escribir " =CODIGO GENETICO DIAGONAL 2"
	escribir ""
	escribir ""
	
	para i=0 hasta n-1 Hacer
		si diagonal2(0) <> diagonal2(i) Entonces
			comp=Falso
		SiNo
			comp=Verdadero
		FinSi
		
	FinPara
	
	si comp = verdadero entonces
		escribir "La diagonal 2 tiene todas las letras iguales. Puede estar el GEN Z en esta cadena "
	SiNo
		escribir "La diagonal 2 NO tiene las letras iguales"
	FinSi
	
FinSubProceso

	