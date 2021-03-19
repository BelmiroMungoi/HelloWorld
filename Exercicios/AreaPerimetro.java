// Importacao das bibliotecas;
import java.io.*;
import java.text.DecimalFormat;

// Declaracao da classe principal;
public class AreaPerimetro {

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader (new InputStreamReader (System.in))  ;
        DecimalFormat b = (new DecimalFormat("0.000")) ;

        // Declaracao das variaveis;
        float base1, base2, lado1, lado2, h;
        float area, perimetro;

        // Leitura e impressao dos valores das variaveis;
        System.out.print("Insira o valor da base maior do trapezio em metros: ");
        base1 = Float.parseFloat(x.readLine());
        System.out.println(base1) ;
        System.out.print("Insira o valor da base menor do trapezio em metros: ");
        base2 = Float.parseFloat(x.readLine());
        System.out.println(base2);
        System.out.print("Insira o valor do primeiro lado do trapezio em metros: ");
        lado1 = Float.parseFloat(x.readLine());
        System.out.println(lado1);
        System.out.print("Insira o valor do segundo lado do trapezio em metros: ");
        lado2 = Float.parseFloat(x.readLine());
        System.out.println(lado2);
        System.out.print("Insira o valor da altura do trapezio em metros: ");
        h = Float.parseFloat(x.readLine());
        System.out.println(h);

        // Operacoes matematicas para obter a area e o perimetro;
        area = (float) ((base1 + base2)* h)/2;
        perimetro = (base1 + base2 + lado1 + lado2);

        //Impressao dos resultados obtidos;
        System.out.println("A area do trapezio e igual a: "+b.format(area)+" metros");
        System.out.println("O perimetro do trapezio e igual a: "+b.format(perimetro)+ " metros");
    }
}