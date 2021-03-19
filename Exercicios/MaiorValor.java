// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class MaiorValor {

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao das variaveis;
        int num1, num2, num3;

        // Leitura e impressao das variaveis;
        System.out.print("Introduza o primeiro numero: ");
        num1 = Integer.parseInt(x.readLine());
        System.out.println(num1);
        System.out.print("Introduza o segundo numero: ");
        num2 = Integer.parseInt(x.readLine());
        System.out.println(num2);
        System.out.print("Introduza o terceiro numero: ");
        num3 = Integer.parseInt(x.readLine());
        System.out.println(num3);

        // Comparacao dos valores;
        if (num1+num2>num3) {
            System.out.println("A soma de A e B que eh igual a "+(num1+num2)+" eh maior que o valor de C que e "+num3);
        }
        if (num1+num2<num3) {
            System.out.println("A soma de A e B que eh igual a "+(num1+num2)+" eh menor que o valor de C que e "+num3);
        }
        if (num1+num2==num3) {
            System.out.println("A soma de A e B que eh igual a "+(num1+num2)+" eh igual ao valor de C que e "+num3);
        }
    }
}