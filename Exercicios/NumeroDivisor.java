//Exercicio numero 4.
import java.io.*;

public class NumeroDivisor {

    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        int num;

        System.out.print("Introduza um numero: ");
        num = Integer.parseInt(x.readLine());
        System.out.println(num);

        for (int i=1; i<=num; i++){
            if(num%i==0)
            System.out.println(i+" e um divisor de "+num);
        }
    }
}