package test;

import modelo.Actor;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ActorTest {

	@Test
	public void testActorCreation() {
		Actor actor = new Actor("Sam Worthington", 48, "Australiano","Furia de titanes");
		assertEquals("Sam Worthington",actor.getNombre());
		assertEquals(48,actor.getEdad());
		assertEquals("Australiano",actor.getNacionalidad());
		assertEquals("Furia de titanes",actor.getOtrasPeliculas());
	}
	
	@Test
	public void testSettersAndGetters() {
		Actor actor = new Actor("Zoe Saldaña",46,"Estadounidense","Guardianes de la Galaxia");
		actor.setEdad(47);
		assertEquals(47,actor.getEdad());
		
		actor.setOtrasPeliculas("Avatar");
		assertEquals("Avatar",actor.getOtrasPeliculas());
	}

}
