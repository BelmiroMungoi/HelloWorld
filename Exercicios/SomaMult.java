// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class SomaMult {
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao das variaveis;
        int a, b;

        // Leitura e impressao do valor das variaveis;
        System.out.print("Insira o primeiro numero: ");
        a = Integer.parseInt(x.readLine());
        System.out.println(a);
        System.out.print("Insira o segundo numero: ");
        b = Integer.parseInt(x.readLine());
        System.out.println(b);

        // Verificacao da igualdade dos valores;
        if (a==b){
            System.out.println("Os numeros introduzidos sao iguais entao a sua soma e igual a "+(a+b));
        }
        else {
            System.out.println("Os numeros introduzidos sao diferentes entao o seu produto e "+(a*b));
        }
    }
}