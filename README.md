Integrantes:

Santiago Diaz
David Velasquez

Respuestas a preguntas:

- ¿Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn?

- Rta: El objetivo del comando es compilar el codigo fuente y empaquetarlo en un formato JAR, este compila, luego ejecuta las pruebas unitarias luego empaqueta en un Jar. Otros comandos que sirven son clean que elmina los arhchivos generados en el directorio para una compilacion nueva, compile que lo que hace es compilar sin pruebas ni empaquetar, test para solo ejecutar las pruebas, install que empaqueta el proyecto lo instala en el repo local de maven y otros como deploy, validate, verify, site dependency:tree que muestra un arbol de la organizacio y demas.

- Buscar cómo enviar parámetros al plugin "exec".
- Rta: Se envian luego del comando de ejecucion mvn exec: java y luego se l e añade -Dnombre="Santiago" por ejemplo, esto funciona ya que configuramos correctamente el pom con el plugin de exec.
  ![img.png](img.png)
- Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
- Rta: Lo que sucedio es que solo lee un parametro dada su configuracion que es unicamente para recibir un paramero, debemos poner el otro tambien en la carpeta de pom, ejecutandol asi ya funciono correctamente.

Ahora aqui vamos a ir documentando el procedimiento realizado, se perdieron las imagenes de la instalacion y el inicio pero ya que esa aqui podemos mostrar que ya una vez montado el proyecto editamos la clase main para realizar esto:

![alt text](image.png)

Luego compilamos con mvn clean package que limpia y empaqueta por decirlo asi, con esto podemos luego ejecutar como se ve aqui:

![alt text](image-1.png)

![alt text](image-2.png)

Funciona en todos los casos de prueba con 0, 1 o 2 atributos, ahora designamos los archivos que vamos a utilizar:
