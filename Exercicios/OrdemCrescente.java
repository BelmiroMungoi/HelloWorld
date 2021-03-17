// Importacao da biblioteca;
import java.io.*;

// Declaracao da classe principal;
public class OrdemCrescente {

    // Declaracao do metodo;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in));

        // Declaracao das variaveis;
        int num1, num2, num3;

        // Leitura e impressao dos valores das variaveis;
        System.out.print("Insira o primeiro numero: ");
        num1 = Integer.parseInt(x.readLine());
        System.out.println(num1);
        System.out.print("Insira o segundo numero: ");
        num2 = Integer.parseInt(x.readLine());
        System.out.println(num2);
        System.out.print("Insira o terceiro numero: ");
        num3 = Integer.parseInt(x.readLine());
        System.out.println(num3);

        // Comparacao dos valores;
        if ((num1>num2)&&(num2>num3)) {
            System.out.println("Os numeros em ordem crescente sao: "+num3+", "+num2+" e "+num1);
        }
        else
        if ((num2>num1)&&(num1>num3)) {
            System.out.println("Os numeros em ordem crescente sao: "+num3+", "+num1+" e "+num2);
        }
        else
        if ((num3>num1)&&(num1>num2)) {
            System.out.println("Os numeros em ordem crescente sao: "+num2+", "+num1+" e "+num3);
        }
        else
        if ((num3>num2)&&(num2>num1)) {
            System.out.println("Os numeros em ordem crescente sao: "+num1+", "+num2+" e "+num3);
        }
        else
        if ((num2>num3)&&(num3>num1)){
            System.out.println("Os numeros em ordem crescente sao: "+num1+", "+num3+" e "+num2);
        }
        else
        if ((num1>num3)&&(num3>num2)) {
            System.out.println("Os numeros em ordem crescente sao: "+num2+", "+num3+" e "+num1);
        }
        else
        if ((num1==num2)&& (num2>num3)) {
            System.out.println("Os numeros em ordem crescente sao: "+num3+", "+num1+" e "+num2);
        }
        else
        if ((num1==num2)&&(num2<num3))  {
             System.out.println("Os numeros em ordem crescente sao: "+num1+", "+num2+" e "+num3);
        }
        else
        if ((num1==num3)&&(num3>num2)) {
             System.out.println("Os numeros em ordem crescente sao: "+num2+", "+num1+" e "+num3);
        }
        else
        if ((num1==num3)&&(num3<num2)) {
             System.out.println("Os numeros em ordem crescente sao: "+num3+", "+num1+" e "+num2);
        }
        else
        if ((num2==num3)&&(num3>num1)) {
             System.out.println("Os numeros em ordem crescente sao: "+num1+", "+num3+" e "+num2);
        }
        else
        if ((num2==num3)&&(num3<num1)) {
             System.out.println("Os numeros em ordem crescente sao: "+num3+", "+num2+" e "+num1);
        }
        if ((num1==num2)&&(num2==num3)){
            System.out.println("Os numeros introduzidos sao iguais");
        }
    }
}