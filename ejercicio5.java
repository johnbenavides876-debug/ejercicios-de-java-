package vista;
import javax.swing.JOptionPane;
public class ejercicio5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String textoMayor = JOptionPane.showInputDialog(
                null, "Ingrese la diagonal mayor:");
        String textoMenor = JOptionPane.showInputDialog(
                null, "Ingrese la diagonal menor:");

        double diagMayor = Double.parseDouble(textoMayor);
        double diagMenor = Double.parseDouble(textoMenor);
        
        double mitadMayor = diagMayor / 2;
        double mitadMenor = diagMenor / 2;
        double lado = Math.sqrt(mitadMayor * mitadMayor + mitadMenor * mitadMenor);

        double perimetro = lado * 4;
        double area = diagMayor * diagMenor / 2;

        System.out.println("Lado del rombo: " + lado);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}