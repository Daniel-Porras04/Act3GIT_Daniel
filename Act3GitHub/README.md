# Act3GIT_Daniel

## PROGAMA DE 20 NÚMEROS ALEATORIOS

Este programa utiliza la clase Random de java para generar 20 números aletorio entre los números 0 y 10.

Para usar **random** lo primero que se debe hacer es importar la clase random. Para ello pondremos al principio del todo **import java.util.Random;** 

Luego yo lo he usado creando un total de **3 int**:

primerIntervalo contiene el número 0.
segundoIntervalo contiene el número 10.
numero contiene el objeto random que hayamos creado (generadorNumerosAleatorios) y le metemos los 2 int anteriores.

Para generar los 20 números he creado un bucle con do while.

Fuera del *do while* he creado un int llamado **i** ye le he dado el valor de 0.

Luego dentro del **do while** es donde he crado el objeto random llamado **generadorNumerosAleatorios** y el int **numero**.
Muestro por pantalla el número que ha salido.
Pongo **i++** para que cada vez que se complete suma 1 a la variable i.

En el *while* he escrito que (i<=19); para que se repita el ciclo hasta que se generen 20 números.