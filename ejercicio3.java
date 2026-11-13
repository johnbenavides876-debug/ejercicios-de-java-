package vista;
import javax.swing.JOptionPane;
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoValor = JOptionPane.showInputDialog(
                null, "Ingrese cuántos pesos colombianos vale 1 dólar:");
        String textoPesos = JOptionPane.showInputDialog(
                null, "Ingrese la cantidad de pesos colombianos a convertir:");

        double valorDolar = Double.parseDouble(textoValor);
        double pesos = Double.parseDouble(textoPesos);

        double dolares = pesos / valorDolar;

        System.out.println("Valor de 1 dólar: " + valorDolar + " pesos");
        System.out.println("Pesos a convertir: " + pesos);
        System.out.println("Equivalen a: " + dolares + " dólares");
    }
}
