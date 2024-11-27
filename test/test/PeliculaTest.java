package test;

import modelo.Actor;
import modelo.Pelicula;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class PeliculaTest {

	@Test
	public void testPeliculaCreation() {
		Pelicula pelicula = new Pelicula("Avatar",125,"Accion","20th Century Studios");
		assertEquals("Avatar",pelicula.getTitulo());
		assertEquals(125,pelicula.getDuracionEnMinutos());
		assertEquals("Accion",pelicula.getGenero());
		assertEquals("20th Century Studios",pelicula.getEstudio());
	}
	
	@Test
	public void testAgregarActor() {
		Pelicula pelicula = new Pelicula("Avatar",125,"Accion","20th Century Studios");
		Actor actor = new Actor("Sam Worthington",48,"Australiano","");
		
		pelicula.agregarActor(actor);
		
		ArrayList<Actor> actores = pelicula.getActores();
		assertEquals(1, actores.size());
		assertEquals(actor.getNombre(),actores.get(0).getNombre());
	}
}
