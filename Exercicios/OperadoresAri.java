// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class OperadoresAri {

    // Metodo principal
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader(new InputStreamReader (System.in));

         // Declaracao das variavei;
        int num1, num2, mul;
        float raiz1, raiz2;

        // Leitura e impressao das variaveis;
        System.out.print("Insira o primeiro valor: ");
        num1 = Integer.parseInt(x.readLine());
        System.out.println(num1)                  ;
        System.out.print("Insira o segundo valor: ");
        num2 = Integer.parseInt(x.readLine());
        System.out.println(num2) ;

        // Operacoes matematicas;
        mul = num1 * num2         ;
        raiz1 = (float) Math.sqrt(num1)   ;
        raiz2 = (float) Math.sqrt(num2)  ;

        // Impressao dos valores obtidos
        System.out.println("A multiplicacao dos dois valores e: "+mul);
        System.out.println("A raiz quadrada do primeiro valor e: "+raiz1+ " \nA raiz quadrada do segundo valor e: "+raiz2) ;



    }
}