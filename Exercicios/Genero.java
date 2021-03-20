// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class Genero {

    // Declaracao do metodo;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao da variavel;
        char genero;

        // Leitura da variavel;
        System.out.println("Introduza uma letra F, M ou O.");
        genero = x.readLine().charAt(0);
        System.out.println(genero);

        // Switch case;
        switch (genero) {
             case 'f' : case 'F' :
             System.out.println("Introduziu a letra F entao o sexo eh Feminino.");
             break;
             case 'm' : case 'M':
             System.out.println("Introduziu a letra M entao o sexo eh Masculino.");
             break;
             case 'o': case 'O':
             System.out.println("Outro.");
             break;
             default :
             System.out.println("Letra invalida.");
             break;
        }

    }
}