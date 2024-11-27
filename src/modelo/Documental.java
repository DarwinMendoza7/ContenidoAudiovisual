package modelo;

import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

   public void agregarInvestigador(Investigador investigador) { investigadores.add(investigador); }

   public ArrayList<Investigador> getInvestigadores() { return investigadores; }

   public String getTema() { return tema; }

   @Override
   public void mostrarDetalles() {
	   System.out.println("=======================================================================");
	   System.out.println("Detalles del Documental:");
	   System.out.println("=======================================================================");
       System.out.println("ID: " + getId());
       System.out.println("Título: " + getTitulo());
       System.out.println("Duración: " + getDuracionEnMinutos());
       System.out.println("Género: " + getGenero());
       System.out.println("Tema: " + tema);
       System.out.println("======================================================================="); 
       System.out.println("Investigadores:");
       System.out.println("=======================================================================");
       
       if (investigadores.isEmpty()) {
           System.out.println("- No hay investigadores disponibles.");
       } else {
           for (Investigador investigador : investigadores) {
               System.out.println("- Nombre: " + investigador.getNombre());
               System.out.println("  Edad: " + investigador.getEdad());
               System.out.println("  Nacionalidad: " + investigador.getNacionalidad());
               System.out.println("  Área de especialización: " + investigador.getAreaEspecializacion());
               System.out.println("=======================================================================");
           }
       }
   }
}