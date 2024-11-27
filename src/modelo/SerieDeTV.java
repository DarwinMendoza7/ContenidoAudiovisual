package modelo;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
   private int temporadas;
   private ArrayList<Temporada> listaTemporadas;

   public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
       super(titulo, duracionEnMinutos, genero);
       this.temporadas = temporadas;
       this.listaTemporadas = new ArrayList<>();
   }

   public void agregarTemporada(Temporada temporada) {
	   listaTemporadas.add(temporada);
   }

   public ArrayList<Temporada> getListaTemporadas(){ 
	   return listaTemporadas;
   }

   public int getTemporadas() { 
	   return temporadas; 
   }

   @Override
   public void mostrarDetalles() {
	   System.out.println("=======================================================================");
	   System.out.println("Detalles de la Serie de TV:");
	   System.out.println("=======================================================================");
       System.out.println("ID: " + getId());
       System.out.println("Título: " + getTitulo());
       System.out.println("Duración en minutos: " + getDuracionEnMinutos());
       System.out.println("Género: " + getGenero());
       System.out.println("Temporadas: " + temporadas);
       System.out.println("=======================================================================");
       System.out.println("Detalles de la Temporada: ");
       System.out.println("=======================================================================");

       for (Temporada temporada : listaTemporadas) {
           System.out.println("- Cantidad total de episodios: " + temporada.getCantidadEpisodios());
           System.out.println("- Estado de la temporada: " + temporada.getEstadoTemporada());
           System.out.println("=======================================================================");
       }
   }
}