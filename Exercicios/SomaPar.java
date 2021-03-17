//Exercicio numero 10.
public class SomaPar {

    public static void main(String[] args){

         int soma=0;

         for(int i = 1; i<1000; i++) {
             if(i%2==0)
             System.out.print(i+", ");
             soma = soma + i;

         }
         System.out.println("\nA soma dos numeros pares e: "+soma);
    }
}