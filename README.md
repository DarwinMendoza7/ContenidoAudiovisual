# Proyecto de ContenidoAudiovisual
Este proyecto permite gestionar contenidos audiovisuales como películas, series de televisión y documentales. Incluye funcionalidades para leer y escribir datos desde/hacia archivos CSV, así como una estructura basada en el patrón MVC (Modelo-Vista-Controlador). Se ha utilizado código limpio y se han aplicado principios SOLID para garantizar que el diseño del sistema sea fácil de entender, mantener y escalar. Además se realizaron pruebas unitarias utilizando JUnit para asegurar la calidad del código y verificar que cada componente funcione correctamente.

## Cambios Realizados ##    
- **Manejo de Archivos:** Se implementaron métodos para guardar y cargar contenidos desde archivos CSV. Además, en el archivo CSV que se incluyó en este proyecto, se han agregado nuevas películas, documentales, series de TV, actores, temporadas e investigadores, lo que permite demostrar una eficiente lectura del archivo CSV por parte del programa al procesar una mayor cantidad de datos.
- **Refactorización:** Se dividieron métodos largos en métodos más pequeños,  lo que mejora la legibilidad y facilita la reutilización de código.  
- **Código Limpio:** Se mejoraron los nombres de métodos y variables para reflejar claramente su propósito. Se eliminaron duplicaciones de código y se añadieron comentarios explicativos.  
- **Principios SOLID:** Se aplicaron los principios SOLID para mejorar el diseño del sistema:  
**1. Single Responsibility Principle (SRP):** Cada clase tiene una única responsabilidad. Por ejemplo, CSVWriter se encarga exclusivamente del manejo de la escritura de contenidos en archivos CSV, CSVReader se encarga exclusivamente de lectura de contenidos desde archivos CSV.  
**2. Open/Closed Principle (OCP):** Las clases están abiertas para extensión pero cerradas para modificación.  
**3. Liskov Substitution Principle:**  Las subclases pueden sustituir a sus clases base sin alterar el funcionamiento del sistema. Las clases Pelicula, Documental y SerieDeTV implementan correctamente llos métodos definidos en ContenidoAudiovisual.      
**4. Interface Segregation Principle (ISP):** Se creó una interfaz Contenido que define un comportamiento común sin forzar a las clases a implemtentar métodos innecesarios.  
**5. Dependency Inversion Principle (DIP):** Las clases dependen de abstracciones en lugar de implementaciones concretas.  
- **Pruebas Unitarias:** Se realizaron pruebas unitarias con JUnit para las principales clases del proyecto. Estas pruebas se han organizado y añadido a la carpeta test, lo que asegura que cada componente funcione correctamente y facilita la detección errores.
## Estructura del Código ##  
La estructura del código es la siguiente:  
          
          /src
            >main  
               -main.java
            >controlador
               -controlador.java
            >modelo
               -Actor.java
               -Contenido.java
               -ContenidoAudiovisual.java
               -ContenidoCSVConverter.java
               -CSVReader.java
               -CSVWriter.java
               -Documental.java
               -Investigador.java
               -Pelicula.java
               -SerieDeTV.java
               -Temporada.java
            >vista
               -Vista.java
          /test
            >test
               -ActorTest.java
               -DocumentalTest.java
               -InvestigadorTest.java
               -PeliculaTest.java
               -SerieDeTVTest.java
               -TemporadaTest.java
## Instrucciones para Clonar y Ejecutar el Proyecto ##
**1.** Asegurate de tener Git instalado en tu sistema. Puedes verificarlo abriendo una terminal y ejecutando el siguiente comando:
     
	 git -- version
Si git está instalado, verás la versión correspondiente. Si no está instalado, descárgalo e instálalo desde https://git-scm.com/.  
**2.** Navega a la carpeta donde deseas clonar el proyecto.  
**3.** Haz clic derecho en la carpeta y selecciona "Open Git Bash Here". Esto abrirá una terminal de Git Bash en la ubicación seleccionada.  
**4.** Ejecuta el siguiente comando:
    
	git clone https://github.com/DarwinMendoza7/ContenidoAudiovisual.git
**5.** Para importar el proyecto a Eclipse haz lo siguiente:
- Abre Eclipse.
- Selecciona File luego Import y luego Existing Projects Into Workspace y pulsa en Next.
- Navega hasta la carpeta donde clonaste el proyecto y haz clic en Finish.  

**6.** En la vista de Proyecto, encuentra la clase Main, haz clic derecho sobre la clase y selecciona Run As y luego Java Application.

**Para clonar directamente desde Eclipse sigue estos pasos:**

**1.** Inicia Eclipse.  
**2.** Ve al menú File y selecciona la opción Import. Luego expande la carpeta Git y selecciona Projects from Git. A continuación, elige Clone URI y haz clic en Next.  
**3.** En el campo URI pega el enlace del repositorio que vas a clonar: https://github.com/DarwinMendoza7/ContenidoAudiovisual.git y completa el campo de Authentication con tus datos y haz clic en Next.  
**4.** En la selección de ramas (Branch Selection), marca la rama main o master según corresponda y haz click en Next.  
**5.** En local Destination, selecciona la carpeta donde deseas clonar el proyecto y asigna un nombre al proyecto en el campo correspondiente. Luego haz clic en Next.  
**6.** En la ventana Select a wizard to use for importing projects, selecciona Import using the New Project wizard y haz clic en Finish.  
**7.** Se abrirá una ventana donde debes seleccionar el tipo de proyecto, elige Java Project en la carpeta de Java.  
**8.** Aparecerá una ventana para crear el nuevo proyecto. Ingresa el nombre del proyecto que desees, desmarca la opción que dice Use default location, y escoge la carpeta donde se clonó el proyecto. Luego haz clic en Finish.  
**9.** Por último, navega a la clase Main, haz clic derecho sobre ella, selecciona Run As, y luego elige Java Application.  
## Instrucciones para ejecutar las Pruebas Unitarias ##
**1.** Inicia Eclipse.  
**2.** Asegurate de que JUnit esté configurado, si no está configurada, puedes agregarla siguiendo estos pasos:  
- Haz clic derecho en tu proyecto en el Package Ecplorer.
- Seleccione Build Path luego Add Libraries.  
- Elige JUnit y haz clic en Next.  
- Selecciona la versión de JUnit que deseas utilizar (por ejemplo, JUnit 5) y haz clic en Finish.
    
**3.** Para ejecutar las pruebas desde Eclipse puedes hacerlo de las siguientes maneras:    
  - Abre la clase que deseas realizar la prueba en la carpeta test. Haz clic derecho en el archivo y selecciona Run As y luego JUnit Test.    
  - También puedes ejecutar todas las pruebas existentes desde el proyecto completo. Haz clic derecho en el nombre del proyecto y selecciona Run As y luego JUnit Test.
  
**4.** Después de ejecutar las pruebas, Eclipse abrirá una vista llamada JUnit que mostrará los resultados de las pruebas. Las pruebas exitosas aparecerán en verde, mientras que las fallidas aparecerán en rojo. Si falla alguna prueba puedes hacer clic en ella para ver detalles sobre el error. 


