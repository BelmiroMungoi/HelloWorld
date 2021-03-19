// Importacao da biblioteca;
import java.io.*;
import java.text.DecimalFormat;

// Declaracao da classe principal;
public class AumentoSalario {

    // Declaracao do metodo;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));
        DecimalFormat b = new DecimalFormat("#,###.00 MZN");

        // Declaracao da variavel
        char categoria; float salario, novoSalario;

        // Leitura das variaveis e switch case;
        System.out.println("Insira a categoria do funcionario");
        categoria = x.readLine().charAt(0);

        switch (categoria) {
            case ('a' | 'A'):  // Alinha a)
            System.out.print("Insira o salario do funcionario para a categoria A: ");
            salario = Float.parseFloat(x.readLine());
            System.out.println(b.format(salario));
            novoSalario = (float)(salario + (salario * 0.1));
            System.out.println("O salario do funcionario com um aumento de 10% eh: "+ b.format(novoSalario));
            break;

            case ('b' | 'B'): case ('d' | 'D'): case ('j' | 'J'): case ('t' | 'T'): // Alinha b)
            System.out.print("Insira o salario do funcionario para a categoria B, D, J e T: ");
            salario = Float.parseFloat(x.readLine());
            System.out.println(b.format(salario));
            novoSalario = (float)(salario + (salario * 0.15));
            System.out.println("O salario do funcionario com um aumento de 15% eh: "+ b.format(novoSalario));
            break;

            case ('k' | 'K'): case ('r' | 'R'): // Alinha c)
            System.out.print("Insira o salario do funcionario para a categoria K e R: ");
            salario = Float.parseFloat(x.readLine());
            System.out.println(b.format(salario));
            novoSalario = (float)(salario + (salario * 0.25));
            System.out.println("O salario do funcionario com um aumento de 25% eh: "+ b.format(novoSalario));
            break;

            case ('l' | 'L'): case ('m' | 'M'): case ('p' | 'P'): case ('q' | 'Q'): case ('s' | 'S'): // Alinha d)
            System.out.print("Insira o salario do funcionario para a categoria L, M, P, Q, e S: ");
            salario = Float.parseFloat(x.readLine());
            System.out.println(b.format(salario));
            novoSalario = (float)(salario + (salario * 0.35));
            System.out.println("O salario do funcionario com um aumento de 35% eh: "+ b.format(novoSalario));
            break;

            case ('u' | 'U'): case ('z' | 'Z'): // Alinha e)
            System.out.print("Insira o salario do funcionario para a categoria U e Z: ");
            salario = Float.parseFloat(x.readLine());
            System.out.println(b.format(salario));
            novoSalario = (float)(salario + (salario * 0.5));
            System.out.println("O salario do funcionario com um aumento de 50% eh: "+ b.format(novoSalario));
            break;

            default :
            System.out.println("Essa categoria nao existe nessa empresa.");

        }
    }
}