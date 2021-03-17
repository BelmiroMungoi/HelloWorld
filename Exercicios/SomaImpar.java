// Declaracao da classe principal;
public class SomaImpar {

    // Declaracao do metodo;
    public static void main(String[] args) {

    // Declaracao da variavel;
    int i=1, soma = 0, cont = i;

        // Ciclo for;
        while (i <= 100) {
              if (i%2 != 0)
              soma = i + cont;
              i++;
    }
    System.out.println(soma);
}
}