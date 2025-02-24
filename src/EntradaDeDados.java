
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main (String args []) {

         Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

         System.out.print("Insira seu nome: ");
         String nome = scanner.nextLine();

         System.out.print("Insira sua idade: ");
         int idade = scanner.nextInt();

        System.out.print("Insira seu peso:  ");
        double peso = scanner.nextDouble();

        System.out.print("Insira sua altura: ");
        float altura = scanner.nextFloat();

        scanner.close();

        System.out.println ("\n--DADOS CADASTRADOS--");
        System.out.println ("Nome:" + nome);
        System.out.println ("Idade: " + idade);
        System.out.println ("Peso: " + peso);
        System.out.print ("Altura: " + altura);
    
    }



}