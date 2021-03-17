//Exercicio numero 11.
public class SomaValoresSucessao {

    public static void main(String[] args){

        float s, soma=0;

        for(int n = 1; n <= 50; n++){
            s = 2*n-1/n;
            System.out.print((2*n)-1+"/"+n+", ");
            soma = soma + s;
        }
        System.out.println("\nA sua soma e igual a "+soma);
    }
}