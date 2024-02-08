import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Instanciamos la clase que implementa la interfaz
        Fortuna miFortuna = new Fortuna();
        miFortuna.obtenerFortuna();

        //Creamos una variable String que guarda el mensaje de la fortuna obtenido
        String mensajeFortuna = miFortuna.obtenerFortuna();

        //Mensajes que se le mostraran al usuario para obtener la fortuna presionando un boton
        JOptionPane.showMessageDialog(null, "¿Desea obtener su fortuna? ", "GALLETAS DE LA FORTUNA", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Su fortuna es: "+ mensajeFortuna, "GALLETAS DE LA FORTUNA", JOptionPane.INFORMATION_MESSAGE);

    }
}