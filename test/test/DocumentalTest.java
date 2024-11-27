package test;

import modelo.Documental;
import modelo.Investigador;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import  java.util.ArrayList;

public class DocumentalTest {

	@Test
	public void testDocumentalCreation() {
		Documental documental = new Documental("Cosmos",45,"Science","Astronomy");
		assertEquals("Cosmos",documental.getTitulo());
		assertEquals(45,documental.getDuracionEnMinutos());
		assertEquals("Science",documental.getGenero());
		assertEquals("Astronomy",documental.getTema());
	}
	
	@Test
	public void testAgregarInvestigador() {
		Documental documental = new Documental("Cosmos",45,"Science","Astronomy");
		Investigador investigador = new Investigador("Carl Sagan",90,"Estadounidense","Astrofísica");
		
		documental.agregarInvestigador(investigador);
		
		ArrayList<Investigador> investigadores = documental.getInvestigadores();
		assertEquals(1,investigadores.size());
		assertEquals(investigador.getNombre(),investigadores.get(0).getNombre());
	}

}
