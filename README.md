# Desafio Dio

Desafio da Dio sobre contador no qual o usuário irá colocar dois números que serão pedidos pelo terminal e já estão configurados no sistema:

Quando o primeiro número digitado é maior do que o segundo, ocorre um erro. Para tratar isso, utilizei a exceção `try-catch`. Além disso, criei uma nova classe para exibir uma mensagem personalizada de erro e, por fim, usei o bloco `finally` para garantir a finalização do processo.

## Exemplo de código:

```java
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


```
Classe para exceção

```java

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String msg) {
        super("O segundo número tem que ser maior que o primeiro");
    }

}
```

## Explicação:

- Try-Catch: Utilizado para capturar e tratar a exceção quando o primeiro número é maior que o segundo.
Classe NumeroInvalidoException: Criei uma classe personalizada para exibir uma mensagem específica de erro quando o problema ocorre.
- Finally: Utilizado para garantir que a mensagem "Processo finalizado" seja exibida ao final, independentemente de ocorrer um erro ou não.
Esse é o desafio de implementação do contador, seguindo as boas práticas de tratamento de exceções.

# Como executar:
## Clone o repositório:

1. Copiar código
git clone https://github.com/seuusuario/desafioDio.git

2. Compile o código:
javac Contador.java

3. Execute o programa:
java Contador
