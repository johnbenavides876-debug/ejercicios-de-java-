package vista;

import javax.swing.JOptionPane;
public class ejercicio1 {


    public static void main(String[] args) {
        double calif1 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la primera calificación (1 al 10):"));
        while (calif1 < 1 || calif1 > 10) {
            calif1 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null, "Nota no válida. Ingrese la primera calificación (1 al 10):"));
        }

        double calif2 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la segunda calificación (1 al 10):"));
        while (calif2 < 1 || calif2 > 10) {
            calif2 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null, "Nota no válida. Ingrese la segunda calificación (1 al 10):"));
        }

        double calif3 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Ingrese la tercera calificación (1 al 10):"));
        while (calif3 < 1 || calif3 > 10) {
            calif3 = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null, "Nota no válida. Ingrese la tercera calificación (1 al 10):"));
        }

        double resultado = 0;
        resultado = (calif1 + calif2 + calif3) / 3;
        System.out.println("El promedio final es: " + resultado);
    }
}
