//Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class MediaTeste{

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException{
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao das variaveis;
        float n1, n2, n3;
        float media;

        //Leitura e impressao dos valores das variaveis;
        System.out.print("Insira a primeira nota: ");
        n1 = Float.parseFloat(x.readLine());
        System.out.println(n1);
        System.out.print("Insira a segunda nota: ");
        n2 = Float.parseFloat(x.readLine());
        System.out.println(n2);
        System.out.print("Insira a terceira nota: ");
        n3 = Float.parseFloat(x.readLine());
        System.out.println(n3);

        //Operacao matematica para obter a media   ;
        media = (float) (n1 + n2 + n3)/3;

        //Impressao do resultado;
        System.out.println("A media das tres notas introduzidas e: "+media);
    }
}