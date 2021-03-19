//Exercicio numero 6.
import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));

        int fac = 1, cont = num;

        while (cont >= 1) {
            fac = (fac * cont);
            cont--;
        }

        JOptionPane.showMessageDialog(null,"O factorial do numero "+num+" eh igual a: "+ fac);
    }
}