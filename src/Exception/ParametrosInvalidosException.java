package Exception;

public class ParametrosInvalidosException extends RuntimeException {

  public ParametrosInvalidosException(final String message) {

          super("O segundo número deve ser maior que o primeiro");
  }


}
