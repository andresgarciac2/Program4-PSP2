csof5101 - conceptos avanzados en ingenieria de software

Tarea 4 - Program4 PSP2

Nombre: Andrés Felipe García Cifuentes

Fecha de entrega: 20/03/2017

Instrucciones para ejecutar el programa ----->> 
 1. Para descargar el proyecto ejecute la siguiente linea en la terminal ---> git clone https://github.com/andresgarciac2/Program4-PSP2.git
 
 2. HEROKU   --> Para acceder a la aplicacion desplegada en heroku ingrese la siguente URL en un explorador WEB.

			https://tarea4psp2.herokuapp.com/
	
  - En esta URL encontrara dos enlaces que hacen referencia a los test propuestos en el enunciado de la tarea
	Test1 --> https://tarea4psp2.herokuapp.com/resultsTest1
	Test2 --> https://tarea4psp2.herokuapp.com/resultsTest2
  - En la otra url --> https://tarea4psp2.herokuapp.com/results/{:input} podra calcular los rangos con los datos ingresados en el path {:input},
    la estructura de {:input} es el nombre de la clase junto a sus LOC y su numero de metodos separados por coma, los n datos a agregar se separan por espacio
    Ejemplo de {:input} --> DataClass,5,1 MainClass,20,2
    Ejemplo de la URL --> https://tarea4psp2.herokuapp.com/results/DataClass,5,1 MainClass,20,2

 3. Para compilarlo y generar el jar ejecute el siguiente comando (dentro de la carpeta que acabo de bajar del repo git)---> mvn install
 4. Para ejecutar el jar use el siguiente comando -----> heroku local
 5. para ver los resultados en su maquina local ingrese la siguente URL en un explorador WEB

		http://localhost:5000
 


COBERTURA DE TEST ---> La aplicación tiene un total de 15 metodos de los cuales 12 metodos son getters, setters y el metodo main, 
                       de los otros 3 test se hacen pruebas unitarias.
