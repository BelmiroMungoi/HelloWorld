import java.io.*;

public class NPalavras{
    public static void main (String []args)throws IOException{

        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n: ");
        int n = Integer.parseInt (x.readLine());
        System.out.println(n);

        String palavras []= new String [n], invertidas [] = new String [n];

        for (int i = 0; i<palavras.length;i++){

            System.out.print("Palavra "+(i+1)+": ");

            palavras[i]= x.readLine();
            System.out.println(palavras[i]);

        }

        for (int i = 0; i<invertidas.length;i++){
            invertidas[i]= "";
            int y =palavras[i].length();
            for (int j = 1; j <= palavras[i].length(); j++){

                invertidas[i] = invertidas[i] +  palavras[i].charAt(y-j);
            }
        }
        for (int i = 0; i<invertidas.length;i++){
            System.out.println("Palavra Invertida "+(i+1)+": "+invertidas[i]);
        }

    }
}