import java.io.*;

public class Bilhete {

    public static void main(String[] args) throws IOException {
    BufferedReader x =
    new BufferedReader (new InputStreamReader(System.in));
    double bilhete=0; int numBilhete=0; char tipoBilhete;

   do {
        System.out.println("Que tipo de bilhete deseja?\nDigite A para economico, B para normal, C para executivo, D para estudante e E para grupo");
        tipoBilhete = x.readLine().charAt(0);

        switch (tipoBilhete) {
            case 'A': case 'a':
            do {
                System.out.println("Escolheu a categoria economica.\nQuantos bilhetes deseja comprar?");
                numBilhete = Integer.parseInt(x.readLine());
                if (numBilhete>=0)
                bilhete = numBilhete * 10000;
                break;
            }while(numBilhete>=0);
            System.out.println("Comprou "+numBilhete+" bilhetes o valor a pagar e: "+bilhete);


        }
    }while(tipoBilhete!='A');

    }
}