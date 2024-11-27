package controlador;

import vista.Vista;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import modelo.*;

public class Controlador {
    private List<ContenidoAudiovisual> contenidos;
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
        String filename = "contenidos.csv";
        crearArchivoSiNoExiste(filename);
        this.contenidos = CSVReader.cargarContenidos(filename);

        if (contenidos.isEmpty()) {
            inicializarContenidosEjemplo();
            CSVWriter.guardarContenidos(filename, contenidos);
        }
    }
    
    //Verifica si el archivo existe, si no lo crea
    private void crearArchivoSiNoExiste(String filename) {
        try {
            if (!Files.exists(Paths.get(filename))) {
                Files.createFile(Paths.get(filename));
                vista.mostrarMensaje("Archivo creado: " + filename);
            }
        } catch (IOException e) {
            vista.mostrarMensaje("Error al crear el archivo: " + e.getMessage());
        }
    }

    //Inicializa contenidos de ejemplo cuando el archivo está vacio 
    private void inicializarContenidosEjemplo() {
        // Crear y agregar película
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 48, "Australiano", "Furia de titanes"));
        pelicula.agregarActor(new Actor("Zoe Saldaña", 46, "Estadounidense", "Guardianes de la Galaxia"));
        pelicula.agregarActor(new Actor("Sigourney Weaver",75,"Estadounidense","Aliens: el regreso"));     
        pelicula.agregarActor(new Actor("Kate Winslet",49,"Británica","Titanic"));
        contenidos.add(pelicula);

        Pelicula pelicula1 = new Pelicula("Avengers: Endgame",182,"Accion-Ciencia Ficción","Marvel Studios");
        pelicula1.agregarActor(new Actor("Robert Downey Jr.",59,"Estadounidense","Sherlock Holmes" ));
        pelicula1.agregarActor(new Actor("Chris Evans",43,"Estadounidense","Los 4 fantásticos"));
        pelicula1.agregarActor(new Actor("Scarlett Johansson",40,"Estadounidense","Black Widow"));
        pelicula1.agregarActor(new Actor("Cris Hemsworth",41,"Australiano","Thor"));
        contenidos.add(pelicula1);
        
        // Crear y agregar serie de TV
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Temporada temporada = new Temporada(73, "Finalizada");
        serie.agregarTemporada(temporada);
        contenidos.add(serie);
        
        SerieDeTV serie1 = new SerieDeTV("Cobra Kai",30,"Acción-Comedia-Drama",6);
        Temporada temporada1 = new Temporada(60,"En emisión");
        serie1.agregarTemporada(temporada1);
        contenidos.add(serie1);

        // Crear y agregar documental
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Carl Sagan", 90, "Estadounidense", "Astronomía"));
        documental.agregarInvestigador(new Investigador("Ann Druyan",75,"Estadounidense","Cosmología"));
        documental.agregarInvestigador(new Investigador("Neil deGrasse Tyson",66,"Estadounidense","Astrofísica"));
        contenidos.add(documental);
        
        Documental documental1 = new Documental("Shoah",566,"Histórico","Holocausto");
        documental1.agregarInvestigador(new Investigador("Claude Lanzmann",92,"Francés","Historia"));
        contenidos.add(documental1);
    }

    //Muestra los detalles de todos los contenidos
    public void mostrarDetalles() {
        vista.mostrarDetallesContenidos(contenidos);
    }
}