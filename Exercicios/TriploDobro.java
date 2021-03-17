// Importacao da biblioteca;
import java.io.*;

// Exercicio numero 4;
// Declaracao da classe principal;
public class TriploDobro {

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException {
    BufferedReader x =
    new BufferedReader (new InputStreamReader (System.in));

    // Declaracao da variavel;
    int a;

    // Leitura e impressao do valor da variavel;
    System.out.print("Insira um numero: ");
    a = Integer.parseInt(x.readLine());
    System.out.println(a);

    // Comparacao do numero;
    if (a > 0){
        System.out.println("O numero e positivo entao o seu triplo e:"+(3*a));
    }
    else {
        System.out.println("O numero e negativo entao o seu dobro e: "+(2*a));
    }

    }
}