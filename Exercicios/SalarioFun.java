// Importacao da biblioteca;
import java.io.*;
import java.text.DecimalFormat;
// Declaracao da classe principal;
public class SalarioFun {

     // Declaracao do metodo principal;
     public static void main(String[] args) throws IOException {
         BufferedReader x =
         new BufferedReader (new InputStreamReader (System.in));
         DecimalFormat b = new DecimalFormat("#,###.00 MZN");

         // Declaracao das variaveis;
         float salario1, salario2, salario3, totalGasto;
         float media;

         // Leitura e impressao dos valores das variaveis;
         System.out.print("Insira o valor do primeiro salario: ");
         salario1 = Float.parseFloat(x.readLine());
         System.out.println(b.format(salario1));
         System.out.print("Insira o valor do segundo salario: ");
         salario2 = Float.parseFloat(x.readLine());
         System.out.println(b.format(salario2));
         System.out.print("Insira o valor do terceiro salario: ");
         salario3 = Float.parseFloat(x.readLine());
         System.out.println(b.format(salario3));

         // Operacoes matematicas para obter a media e o total gasto pela empresa nos salarios dos funcionarios;
         media = (salario1 + salario2 + salario3)/3;
         totalGasto = (salario1 + salario2 + salario3)*12;

         // Impressao dos resultados obtidos;
         System.out.println("A media dos salarios dos funcionarios e igual a: "+b.format(media)+
         "\nO total gasto pela empresa no pagamento dos funcionarios anualmente e igual a: "+b.format(totalGasto));
     }

}