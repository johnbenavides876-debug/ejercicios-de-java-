package vista;
import javax.swing.JOptionPane;
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Edad de la madre cuando nació el hijo
        int edadActualMadre = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null, "Ingrese la edad actual de la madre:"));
        int edadActualHijo = Integer.parseInt(
                JOptionPane.showInputDialog(
                        null, "Ingrese la edad actual del hijo:"));
        int edadAlNacer = 0;
        edadAlNacer = edadActualMadre - edadActualHijo;
        System.out.println("La madre tenía " + edadAlNacer
                + " años cuando nació su hijo.");
    }
}