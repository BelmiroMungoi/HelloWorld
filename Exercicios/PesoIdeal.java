// Importacao a biblioteca;
import java.io.*;
import java.text.DecimalFormat;

// Exercicio numero 5;
// Declaracao da classe principal;
public class PesoIdeal {

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));
        DecimalFormat b = new DecimalFormat("0.00 kg");

        // Declaracao das variaveis;
        float h, ph, pm;
        char genero;

        // Leitura e impressao das variaveis;
        System.out.println("===============Seja Bem Vindo===============\n=====Descubra o peso ideal para a sua altura=====");
        System.out.println("Digite a sua altura: ");
        h = Float.parseFloat(x.readLine());
        System.out.println(h);
        System.out.println("Digite F se for do sexo Feminino ou M se for do sexo Masculino");
        genero = x.readLine().charAt(0);

        // Verificacao do genero;
        if ((genero=='f')||(genero=='F')){
            pm = ((62 * h) - 44);
            System.out.println("O seu peso ideal e: "+b.format(pm));
        }
        else
        if ((genero=='m')||(genero=='M')) {
            ph = ((72 * h) - 58);
            System.out.println("O seu peso ideal e: "+b.format(ph));
        }
        else
        System.out.println("Introduza a letra M ou F porfavor!\n========== Reinicie o programa!!! ==========");
    }
}