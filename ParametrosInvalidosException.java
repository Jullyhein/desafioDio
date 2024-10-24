
public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String msg) {
        super("O segundo número tem que ser maior que o primeiro");
    }

}
