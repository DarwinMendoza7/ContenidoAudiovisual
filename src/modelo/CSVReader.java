package modelo;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    // Método para cargar contenidos desde un archivo CSV
    public static List<ContenidoAudiovisual> cargarContenidos(String filename) {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        
         try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ContenidoAudiovisual contenido = ContenidoCSVConverter.convertToContenido(line);
                if (contenido != null) {
                    contenidos.add(contenido);
                }
            }
         } catch (IOException e) {
             e.printStackTrace();
         }
         return contenidos;
     } 
}