// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe;
public class FormarTriangulo {

    // Declaracao do metodo;
    public static void main (String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao das variaveis;
        int lado1, lado2, lado3;

        // Leitura e impressao dos valores das variaveis;
        System.out.print("Insira o valor do primeiro lado: ");
        lado1 = Integer.parseInt(x.readLine());
        System.out.println(lado1);
        System.out.print("Insira o valor do segundo lado: ");
        lado2 = Integer.parseInt(x.readLine());
        System.out.println(lado2);
        System.out.print("Insira o valor do terceiro lado: ");
        lado3 = Integer.parseInt(x.readLine());
        System.out.println(lado3);

        // Comparacao dos valores das variaveis para obtencao do triangulo;
        if ((lado1+lado2>lado3)&&(lado2+lado3>lado1)&&(lado1+lado3>lado2)) {
            System.out.println("Com essas medidas pode-se formar um triangulo.");
        }
        else {
            System.out.println("Com essas medidas nao pode-se formar um triangulo.");
        }
    }
}