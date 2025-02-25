import java.util.Scanner;

public class MetodoMedia {

    public static float calcularMedia(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3) / 3;

    }

    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Insira sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Insira sua terceira nota: ");
        float nota3 = scanner.nextFloat();

        float notaFinal = calcularMedia(nota1, nota2, nota3);

        System.out.print("Sua média final é: " + notaFinal);

       

        if (notaFinal >= 6) {

            System.out.print("\nParabéns! Você foi aprovado.");
            
        }

        else {
            System.out.print("Reprovado!");
        } 
        
        scanner.close();

    }


}