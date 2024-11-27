package vista;

import java.util.List;
import modelo.ContenidoAudiovisual;

public class Vista {
	//Muestra los detalles de cada contenido audiovisual
    public void mostrarDetallesContenidos(List<ContenidoAudiovisual> contenidos) {
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
            System.out.println(); // Espacio entre detalles de diferentes contenidos
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}