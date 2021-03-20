// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe;
public class MesDoAno {

    // Declaracao do metodo;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao da variavel;
        int mes;

        // Leitura e impressao da variaveis;
        System.out.print("Insira um numero num intervalo de 1 a 12: ");
        mes = Integer.parseInt(x.readLine());
        System.out.println(mes);

        //  Switch case
        switch (mes) {
            case 1 :
            System.out.println("O numero introduzido corresponde ao mes de Janeiro.");
            break;
            case 2:
            System.out.println("O numero introduzido corresponde ao mes de Fevereiro.");
            break;
            case 3:
            System.out.println("O numero introduzido corresponde ao mes de Marco.");
            break;
            case 4:
            System.out.println("O numero introduzido corresponde ao mes de Abril.");
            break;
            case 5:
            System.out.println("O numero introduzido corresponde ao mes de Maio.");
            break;
            case 6:
            System.out.println("O numero introduzido corresponde ao mes de junho.");
            break;
            case 7:
            System.out.println("O numero introduzido corresponde ao mes de julho.");
            break;
            case 8:
            System.out.println("O numero introduzido corresponde ao mes de Agosto.");
            break;
            case 9:
            System.out.println("O numero introduzido corresponde ao mes de Setembro.");
            break;
            case 10:
            System.out.println("O numero introduzido corresponde ao mes de Outubro.");
            break;
            case 11:
            System.out.println("O numero introduzido corresponde ao mes de Novembro.");
            break;
            case 12:
            System.out.println("O numero introduzido corresponde ao mes de Dezembro.");
            break;
            default:
            System.out.println("O numero introduzido nao corresponde a nenhum mes do ano!!!");
            break;
        }
    }
}