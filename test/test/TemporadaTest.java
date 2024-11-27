package test;

import modelo.Temporada;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TemporadaTest {

	@Test
	public void testTemporadaCreation() {
		Temporada temporada = new Temporada(10,"En curso");
		assertEquals(10,temporada.getCantidadEpisodios());
		assertEquals("En curso",temporada.getEstadoTemporada());
	}
	
	@Test
	public void testSettersAndGetters() {
		Temporada temporada = new Temporada(8,"Finalizada");
		temporada.setCantidadEpisodios(9);
		assertEquals(9,temporada.getCantidadEpisodios());
		
		temporada.setEstadoTemporada("En curso");
		assertEquals("En curso", temporada.getEstadoTemporada());
	}

}
