Integrantes:

Santiago Diaz
David Velasquez

Respuestas a preguntas:

- ¿Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn?

- Rta: El objetivo del comando es compilar el codigo fuente y empaquetarlo en un formato JAR, este compila, luego ejecuta las pruebas unitarias  luego empaqueta en un Jar. Otros comandos que sirven son clean que elmina los arhchivos generados en el directorio para una compilacion nueva, compile que lo que hace es compilar sin pruebas ni empaquetar, test para solo ejecutar las pruebas, install que empaqueta el proyecto  lo instala en el repo local de maven y otros como deploy, validate, verify, site dependency:tree que muestra un arbol de la organizacio y demas.

- Buscar cómo enviar parámetros al plugin "exec".
- Rta: Se envian luego del comando de ejecucion mvn exec: java y luego se l e añade -Dnombre="Santiago" por ejemplo, esto funciona ya que configuramos correctamente el pom con el plugin de exec.
![img.png](img.png)
- Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
- Rta: Lo que sucedio es que da error dado que solo esta configurado para recibir un paramero, debemos poner el otro tambien en la carpeta de pom, ejecutandol asi ya funciono correctamente.