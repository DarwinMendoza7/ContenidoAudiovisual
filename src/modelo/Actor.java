package modelo;

public class Actor {

	private String nombre;
	private int edad;
	private String nacionalidad;
	private String otrasPeliculas;

	public Actor(String nombre, int edad, String nacionalidad, String otrasPeliculas) {
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.otrasPeliculas = otrasPeliculas;
	}

	public String getNombre() { 
		return nombre; 
	}
	
	public void setNombre(String nombre) { 
		this.nombre = nombre; 
	}
	
	public int getEdad() { 
		return edad; 
	}
	
	public void setEdad(int edad) { 
		this.edad = edad;
	}
	
	public String getNacionalidad() {
		return nacionalidad; 
	}
	
	public void setNacionalidad(String nacionalidad) { 
		this.nacionalidad = nacionalidad;
	}
	
	public String getOtrasPeliculas() { 
		return otrasPeliculas; 
	}

	public void setOtrasPeliculas(String otrasPeliculas) { 
		this.otrasPeliculas = otrasPeliculas; 
	}	
}
