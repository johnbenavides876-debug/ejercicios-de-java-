package vista;
import javax.swing.JOptionPane;
public class ejercicio4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoRadio = JOptionPane.showInputDialog(
                null, "Ingrese el radio del círculo:");

        double radio = Double.parseDouble(textoRadio);

        double diametro = radio * 2;
        double perimetro = Math.PI * diametro;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Radio: " + radio);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
