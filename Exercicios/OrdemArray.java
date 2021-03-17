import java.io.*;

public class OrdemArray {

    public static void main(String [] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in)) ;

        //int k = 20;
         int i;
        System.out.print("Introduza 20 valores");
        int n[] = new int [20] ;
        for (i=0 ; i<=20; i++){
            System.out.print(" ");
            n[i] = Integer.parseInt(x.readLine ());
            System.out.print(" "+n[i]);
        }
        for(int j=0; j<=20; j++){
                System.out.print(n[i]);
        }


    }

}