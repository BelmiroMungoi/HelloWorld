//Exercicio numero 2.
import java.io.*;

public class MediaNumero {
    public static void main(String[]args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));
        int num; float j=0, media;

        System.out.print("Introduza a quantidade de numeros: ");
        num = Integer.parseInt(x.readLine());
        System.out.println(num);

        for(int i=1; i<=num; i++) {
            j = j + i;
        }
        media = j/num;
        System.out.println(media);
    }
}