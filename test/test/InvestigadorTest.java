package test;

import modelo.Investigador;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InvestigadorTest {

	@Test
	public void testInvestigadorCreation() {
		Investigador investigador = new Investigador("Carl Sagan",90,"Estadounidense","Astronomía");
		
		assertEquals("Carl Sagan",investigador.getNombre());
		assertEquals(90,investigador.getEdad());
		assertEquals("Estadounidense", investigador.getNacionalidad());
		assertEquals("Astronomía",investigador.getAreaEspecializacion());
	}
	
	@Test
	public void testSettersAndGetters() {
		Investigador investigador = new Investigador("Ann Druyan",75,"Estadounidense","Cosmología");
		
		//Probar los métodos setters y getters
		investigador.setEdad(76);
		assertEquals(76,investigador.getEdad());
		
		investigador.setAreaEspecializacion("Ciencia popular");
		assertEquals("Ciencia popular", investigador.getAreaEspecializacion());
		
		investigador.setNombre("Neil deGrasse Tyson");
		assertEquals("Neil deGrasse Tyson", investigador.getNombre());
		
		investigador.setNacionalidad("Americano");
		assertEquals("Americano", investigador.getNacionalidad());
	}

}
