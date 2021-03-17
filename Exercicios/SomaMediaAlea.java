// Declaracao da classe principal;
public class SomaMediaAlea {

     // Declaracao do metodo principal;
     public static void main(String[] args)  {

         // Declaracao da variaveis;
         float media;
         int soma;

         // Declaracao das variveis que recebem os numeros aleatorios;
         double alea1 = Math.random();
         byte n1 = (byte)(0 + alea1 * (29-0));
         double alea2 = Math.random();
         byte n2 = (byte)(0 + alea2 * (29-0));
         double alea3 =  Math.random();
         byte n3 = (byte)(0 + alea3 * (29-0));

         // Operacoes matematicas para calculo da media e soma;
         media = (n1 + n2 + n3)/3;
         soma = (n1 + n2 + n3);

         // Impressao dos resultdos
         System.out.println("Os tres numeros aleatorios escolhidos sao: "+n1+", "+n2+" e "+n3);
         System.out.println("A media dos tres numeros e igual a: "+media+"\nO somatorio dos tres numeros e igual a: "+soma);
     }
}