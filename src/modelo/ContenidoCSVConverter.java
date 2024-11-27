package modelo;

public class ContenidoCSVConverter {

     // Convertir un objeto ContenidoAudiovisual a una línea CSV.
     public static String convertToCSV(ContenidoAudiovisual contenido){
    	 if (contenido instanceof Pelicula) {
             Pelicula pelicula = (Pelicula) contenido;
             StringBuilder sb = new StringBuilder();
             sb.append("Pelicula,").append(pelicula.getTitulo()).append(",")
               .append(pelicula.getDuracionEnMinutos()).append(",")
               .append(pelicula.getGenero()).append(",")
               .append(pelicula.getEstudio());

             for (Actor actor : pelicula.getActores()) {
                 sb.append(",").append(actor.getNombre()).append(",")
                   .append(actor.getEdad()).append(",")
                   .append(actor.getNacionalidad()).append(",")
                   .append(actor.getOtrasPeliculas());
             }
             return sb.toString();
             
         } else if (contenido instanceof Documental) {
             Documental documental = (Documental) contenido;
             StringBuilder sb = new StringBuilder();

             sb.append("Documental,").append(documental.getTitulo()).append(",")
               .append(documental.getDuracionEnMinutos()).append(",")
               .append(documental.getGenero()).append(",")
               .append(documental.getTema());

             for (Investigador investigador : documental.getInvestigadores()) {
                 sb.append(",").append(investigador.getNombre()).append(",")
                   .append(investigador.getEdad()).append(",")
                   .append(investigador.getNacionalidad()).append(",")
                   .append(investigador.getAreaEspecializacion());
             }
             return sb.toString();
             
         } else if (contenido instanceof SerieDeTV) {
             SerieDeTV serie = (SerieDeTV) contenido;
             StringBuilder sb = new StringBuilder();

             sb.append("SerieDeTV,").append(serie.getTitulo()).append(",")
               .append(serie.getDuracionEnMinutos()).append(",")
               .append(serie.getGenero()).append(",")
               .append(serie.getTemporadas());

            for (Temporada temporada : serie.getListaTemporadas()) {
                sb.append(",").append(temporada.getCantidadEpisodios())
                  .append(",").append(temporada.getEstadoTemporada());
            }
            return sb.toString();
        }
        return "";
    }

     // Convertir una línea CSV a un objeto ContenidoAudiovisual.
     public static ContenidoAudiovisual convertToContenido(String line){
    	 String[] parts = line.split(",");
         switch(parts[0]) {
             case "Pelicula":
                 Pelicula pelicula = new Pelicula(parts[1], parseInt(parts[2]), parts[3], parts[4]);
                 // Leer actores
                 for(int i = 5; i < parts.length; i += 4) {
                     if (i + 3 < parts.length) {
                         String nombre = parts[i];
                         int edad = parseInt(parts[i + 1]); // Convertir a entero solo si es un número
                         String nacionalidad = parts[i + 2];
                         String otrasPeliculas = parts[i + 3];
                         pelicula.agregarActor(new Actor(nombre, edad, nacionalidad, otrasPeliculas));
                     }
                 }
                 return pelicula;

             case "Documental":
                 Documental documental = new Documental(parts[1], parseInt(parts[2]), parts[3], parts[4]);
                 // Leer investigadores
                 for(int i = 5; i < parts.length; i += 4) {
                     if (i + 3 < parts.length) {
                         String nombre = parts[i];
                         int edad = parseInt(parts[i + 1]); // Convertir a entero solo si es un número
                         String nacionalidad = parts[i + 2];
                         String areaEspecializacion = parts[i + 3];
                         documental.agregarInvestigador(new Investigador(nombre, edad, nacionalidad, areaEspecializacion));
                     }
                 }
                 return documental;

             case "SerieDeTV":
                 SerieDeTV serie = new SerieDeTV(parts[1], parseInt(parts[2]), parts[3], parseInt(parts[4]));
                 // Leer temporadas
                 for(int i = 5; i < parts.length; i += 2) {
                     if (i + 1 < parts.length) {
                         Temporada temporada = new Temporada(parseInt(parts[i]), parts[i+1]);
                         serie.agregarTemporada(temporada);
                     }
                 }
                 return serie;

             default:
                 return null;
         }
     }

     private static int parseInt(String value) {
         try {
             return Integer.parseInt(value);
         } catch (NumberFormatException e) {
             return 0; // Retornar 0 si no es un número válido
         }
     }
}