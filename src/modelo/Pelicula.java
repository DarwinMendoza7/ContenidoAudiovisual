package modelo;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) { 
    	actores.add(actor);
    }

    public ArrayList<Actor> getActores() { 
    	return actores;
    }

    public String getEstudio() { 
    	return estudio;
    }

    @Override
    public void mostrarDetalles() {
    	System.out.println("=======================================================================");
        System.out.println("Detalles de la película:");
        System.out.println("=======================================================================");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("=======================================================================");
        System.out.println("Actores:");
        System.out.println("=======================================================================");
		
        if (actores.isEmpty()) {
			System.out.println("- No hay actores disponibles.");
		} else {
			for (Actor actor : actores) {
				System.out.println("- Nombre: " + actor.getNombre());
				System.out.println("  Edad: " + actor.getEdad());
				System.out.println("  Nacionalidad: " + actor.getNacionalidad());
				System.out.println("  Otras películas en las que ha participado: " + actor.getOtrasPeliculas());
				System.out.println("=======================================================================");
				
			}
		}
	}
}