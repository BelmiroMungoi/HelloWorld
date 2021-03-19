//Importacao da biblioteca;
import java.io.*;
import java.text.DecimalFormat;

// Declaracao da classe principal;
public class MediaTeste2{

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException{
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));
        DecimalFormat b = new DecimalFormat ("0.0");

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

        // Comparacao das medias;
        if (media < 10) {
            System.out.println("O aluno foi excluido ao exame com a media: "+b.format(media));
        }
        else
        if ((media >= 10) || (media < 14)) {
            System.out.println("O aluno foi admitido ao exame com a media: "+b.format(media));
        }
        else
        if (media >= 14) {
            System.out.println("O aluno foi dispensado ao exame com a media: "+ media);
        }
     }
}