//Exercicio numero 3.
import java.io.*;

public class PotenciaDoisNumeros {

     public static void main(String[] args) throws IOException {
         BufferedReader b =
         new BufferedReader (new InputStreamReader (System.in));

         int x, y, p=1;

         System.out.print("Introduza o valor da base: ");
         x = Integer.parseInt(b.readLine());
         System.out.println(x);
         System.out.print("Introduza o valor da potencia: ");
         y = Integer.parseInt(b.readLine());
         System.out.println(y);

         for(int i=1; i <=y; i++) {
             p = p*x;

         }
         System.out.println(p);

     }
}