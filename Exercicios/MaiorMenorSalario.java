// Exercicio 12.
import java.io.*;
import java.text.DecimalFormat;

public class MaiorMenorSalario{

    public static void main(String[] args) throws IOException {
        BufferedReader x =
        new BufferedReader(new InputStreamReader(System.in));
        int num; float sal, maiorSal = 0, menorSal = 0, somaSal, mediaSal;
        String nome, nome1 = "", nome2 = "";
        DecimalFormat b = new DecimalFormat("#,###.00 MZN");

        do {
            System.out.print("Digite o numero dos funcionarios: ");
            num = Integer.parseInt(x.readLine());
            System.out.println(num);

            if (num < 1) {
                System.out.println("Numero invalido. Tente novamente!");
            } else
              if (num == 1) {
                   System.out.println("Nao e permitido que seja apenas um funcionario.");
              }
        }    while (num <= 1);

            do {
               System.out.print("\nDigite o nome do 1.o funcionario: ");
               nome = x.readLine();
               System.out.println(nome);
               if (nome.length() <= 2 && nome.length() <= 50)
               System.out.println("Nome invalido");
            } while (nome.length() <= 2 && nome.length() <= 50);

            nome = nome.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();
            nome1 = nome;

            do {
                System.out.print("Digite o salario do/a "+nome+": ");
                sal = Float.parseFloat(x.readLine());
                System.out.println(b.format(sal));
                if (sal <= 3000)
                System.out.println("Salario invalido");
            } while (sal <= 3000);
            menorSal = sal;
            somaSal = sal;

        for (int i = 2; i <= num; i++) {
            do {
               System.out.print("\nDigite o nome do "+i+".o funcionario: ");
               nome = x.readLine();
               System.out.println(nome);
               if (nome.length() <= 2 && nome.length() <= 50)
               System.out.println("Nome invalido");
            } while (nome.length() <= 2 && nome.length() <= 50);

            nome = nome.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();

            do {
                System.out.print("Digite o salario do/a "+nome+": ");
                sal = Float.parseFloat(x.readLine());
                System.out.println(b.format(sal));
                if (sal <= 3000)
                System.out.println("Salario invalido");
            } while (sal <= 3000);

            somaSal += sal;

            if (maiorSal < sal) {
                maiorSal = sal;
                nome2 = nome;
            } else
              if (menorSal > sal) {
                 menorSal = sal;
                 nome1 = nome;
              }
        }
        mediaSal = (float) somaSal/num;
        System.out.println("\nNumero dos funcionarios e: "+num+"\nMedia dos salarios: "+b.format(mediaSal));
        System.out.println("O maior salario e "+b.format(maiorSal)+" e eh do/a: "+nome2+"\nO menor salario e "+b.format(menorSal)+" e e do/a: "+nome1);
    }
}