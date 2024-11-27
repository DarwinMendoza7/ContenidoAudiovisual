package modelo;

public class Investigador {

	private String nombre;
	private int edad;
	private String nacionalidad;
	private String areaEspecializacion;

	public Investigador(String nombre, int edad, String nacionalidad, String areaEspecializacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.areaEspecializacion = areaEspecializacion;
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

	public String getAreaEspecializacion() { 
		return areaEspecializacion;
	}
	
	public void setAreaEspecializacion(String areaEspecializacion) { 
		this.areaEspecializacion = areaEspecializacion;
	}	
}