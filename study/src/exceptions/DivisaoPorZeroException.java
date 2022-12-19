package exceptions;

public class DivisaoPorZeroException extends Exception {
    private int numerador;

    public DivisaoPorZeroException(String message, int numerador) {
        super(message);
        this.numerador = numerador;
    }
    
}
