// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class NumeroPar {

    // Declaracao do metodo main;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in)) ;

        // Declaracao da variavel;
        int num;

        // Leitura e impressao do valor da variavel;
        System.out.print("Insira o numero: ");
        num = Integer.parseInt(x.readLine());
        System.out.println(num);

        // Verificacao da paridade do valor usando uma estrutura simples;
        if (num%2==0)
            System.out.println("O numero introduzido e par");

    }
}