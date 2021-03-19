// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe;
public class Imc {

     // Declaracao do metodo;
     public static void main(String[] args) throws IOException {
         BufferedReader x =
         new BufferedReader (new InputStreamReader(System.in));

         // Declaracao da variaveis
         float imc, peso, h;

         // Leitura e impressao das variaveis;
         System.out.print("Insira a sua altura metros: ");
         h = Float.parseFloat(x.readLine());
         System.out.println(h);
         System.out.print("Insira o seu peso em Quilogramas: ");
         peso = Float.parseFloat(x.readLine());
         System.out.println(peso);

         // Operacao matematica;
         imc = (peso / (h *h));

         // Comparacao do IMC;
         if (imc < 18.5) {
             System.out.println("O seu Indice de Massa Corporal e: "+ imc);
             System.out.println("Voce esta abaixo do peso.");
         }
         else
         if ((imc == 18.5) || (imc <= 25)) {
             System.out.println("O seu Indice de Massa Corporal e: "+ imc);
             System.out.println("Voce tem o peso normal.");
         }
         else
         if ((imc == 25) || (imc <= 30)) {
             System.out.println("O seu Indice de Massa Corporal e: "+ imc);
             System.out.println("Voce esta acima do peso.");
         }
         else
         if ((imc >= 30)) {
             System.out.println("O seu Indice de Massa Corporal e: "+ imc);
             System.out.println("Voce esta obeso.");
         }


     }
}