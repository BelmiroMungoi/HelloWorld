// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class AreaRec {

    // Declaracao do metodo principal;
    public static void main (String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader(new InputStreamReader (System.in));

        // Declaracao das variaveis;
        int c, l;
        int area;

        // Leitura e impressao das variaveis;
        System.out.print("Introduza o comprimento: ");
        c = Integer.parseInt(x.readLine());
        System.out.println(c);
        System.out.print("Introduza a largura: ");
        l = Integer.parseInt(x.readLine());
        System.out.println(l);

        // Operacao matematica;
        area = c * l;

        // Impressao do resultado;
        System.out.println("A area do rectangulo e: "+area);
    }
}