import java.util.Scanner;

public class PraticandoMetodoDobro {

    public static int calcularDobro(int numero) {
        return numero * 2;
    }
    
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        int dobro = calcularDobro(numero);

        System.out.print(dobro);

        scanner.close();
    }
    
}
