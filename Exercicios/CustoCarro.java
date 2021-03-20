// Importacao da biblioteca;
import java.io.*;
import java.text.DecimalFormat;

// Declaracao da classe principal;
public class CustoCarro{

    // Declaracao do metodo principal;
    public static void main(String[] args) throws IOException {
        BufferedReader  x =
        new BufferedReader (new InputStreamReader (System.in)) ;
        DecimalFormat b = new DecimalFormat ("#,###.00 MZN");

        // Declaracao das variaveis;
        int custoFabrica;
        float custoTotal, pd, pi;

        // Leitura e impressao das variaveis;
        System.out.print("Introduza o custo de fabrica do automovel: ");
        custoFabrica = Integer.parseInt(x.readLine());
        System.out.println(b.format(custoFabrica));

        // Operacoes matematicas para obter o custo total do automovel;
        pd = (float)((0.23) * custoFabrica); // Custo da percentagem do distribuidor;
        pi = (float)((0.4) * custoFabrica); // Custo da percentagem de impostos;
        custoTotal = (custoFabrica + pd + pi); // Custo total do automovel;

        // Impressao dos resultados obtidos;
        System.out.println("O custo de fabrica do automovel e: "+b.format(custoFabrica)+"\nO custo da percentagem do distribuidor e: "+b.format(pd)+"\nO custo da percentagem de impostos e: "+b.format(pi));
        System.out.println("O custo total do automovel e igual a: "+b.format(custoTotal));
    }
}