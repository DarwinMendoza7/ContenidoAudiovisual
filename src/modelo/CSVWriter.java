package modelo;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class CSVWriter {

    // Método para guardar los contenidos en un archivo CSV
    public static void guardarContenidos(String filename, List<ContenidoAudiovisual> contenidos) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                writer.write(ContenidoCSVConverter.convertToCSV(contenido));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}