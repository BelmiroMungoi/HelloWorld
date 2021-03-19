// Importacao da biblioteca;
import java.util.Date;

// Declaracao da classe principal;
public class DataActual {

    // Declaracao do metodo principal;
    public static void main(String[] args) {

        // Impressao da data actual usando um objecto
        Date data = new Date();
        System.out.print("A data actual e: ");
        System.out.println(data.toString()) ;
    }
}