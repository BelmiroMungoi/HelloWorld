//Exercicio numero 5.
import java.io.*;

public class Seta {

    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader(System.in));

        int num;

        System.out.print("Introduza o numero: ");
        num = Integer.parseInt(x.readLine());
        System.out.println(num);

        for (int i=0; i<=num; i++) {
            System.out.print("*" );
            for(int j=0; j<=num; j++) {
                System.out.print("*");
                for (int k=0; k<=num; k++){
                    System.out.print("*");
                    for (int l=1; l<=num; l++){
                        System.out.println("*");
                    }
                }
            }
        }
    }
}