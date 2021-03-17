//Exercicio numero 9.
import java.io.*;

public class Tabuada {
  public static void main (String [] args) throws IOException{
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        int num, tabuada;

        System.out.println("Digite o valor de n: ");
        num = Integer.parseInt(x.readLine());
        System.out.println(num);

        for (int i=1; i<=12; i++){
            tabuada = i * num;
                System.out.println(i+" x "+num+" = "+tabuada);
               }
            }
        }