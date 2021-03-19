//Exercicio numero 9.
public class Fibonacci {

    public static void main(String[] args){

        int num = 1, aux, cont = 0;
        System.out.println(cont);

        for (int i=1; i<100; i++){
            System.out.println(num);
            aux = num;
            num = num + cont;
            cont = aux;
        }


    }
}