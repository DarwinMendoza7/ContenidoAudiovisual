package test;

import modelo.SerieDeTV;
import modelo.Temporada;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SerieDeTVTest {

	@Test
	public void testSerieDeTVCreation() {
		SerieDeTV serie = new SerieDeTV("Game of Thrones",60,"Fantasy",8);
		assertEquals("Game of Thrones",serie.getTitulo());
		assertEquals(60,serie.getDuracionEnMinutos());
		assertEquals("Fantasy",serie.getGenero());
		assertEquals(8,serie.getTemporadas());
	}
	
	@Test
	public void testAgregarTemporada() {
		SerieDeTV serie = new SerieDeTV("Game of Thrones",60,"Fantasy",8);
		
		Temporada temporada = new Temporada(73,"Finalizada");
		serie.agregarTemporada(temporada);
		
		assertEquals(1, serie.getListaTemporadas().size());
		assertEquals(73,serie.getListaTemporadas().get(0).getCantidadEpisodios());
	}

}
