// Declaracao da classe principal;
 public class TrocaValores {

    // Metodo principal;
     public static void main(String[] args){

     //Declaracao das variaveis;
     byte a = 30 ; byte b = 50;

     // Operacao de troca usando uma variavel auxiliar;
     byte aux = a; a = b; b = aux;

     // Impressao do resultado obtido;
     System.out.println("O valor de a que era 30 passou a ser "+a+"\nO valor de b que era 50 passou a ser "+b)  ;
     }

 }