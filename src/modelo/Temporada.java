package modelo;

public class Temporada {

	private int cantidadEpisodios;
	private String estadoTemporada;

	public Temporada(int cantidadEpisodios, String estadoTemporada) {
		this.cantidadEpisodios = cantidadEpisodios;
		this.estadoTemporada = estadoTemporada;
	}

	public int getCantidadEpisodios() { 
		return cantidadEpisodios;
	}
	
	public void setCantidadEpisodios(int cantidadEpisodios) { 
		this.cantidadEpisodios = cantidadEpisodios; 
	}

	public String getEstadoTemporada() { 
		return estadoTemporada;
	}
	
	public void setEstadoTemporada(String estadoTemporada) { 
		this.estadoTemporada = estadoTemporada;
	}	
}