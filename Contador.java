import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um número sem vírgula ou pontos: ");
            int number = scanner.nextInt();

            System.out.println("Digite um segundo número: ");
            int number2 = scanner.nextInt();

            System.out.println("Você digitou o primeiro número: " + number);
            System.out.println("Você digitou o segundo número: " +number2);

            if (number > number2){
                throw new ParametrosInvalidosException("O segundo número tem que ser maior que o primeiro");
            }
        
            contar(number, number2);

        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        } finally{
            scanner.close();
        }
        
    }
    static void contar(int number, int number2){
        int quantidade = number2 - number;

        for (int i = 1; i <= quantidade; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
