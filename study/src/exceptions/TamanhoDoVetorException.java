package exceptions;

public class TamanhoDoVetorException extends Exception{
    private int tamanhoNumerador;
    private int tamanhoDenominador;
    public TamanhoDoVetorException(String message, int tamanhoNumerador, int tamanhoDenominador) {
        super(message);
        this.tamanhoNumerador = tamanhoNumerador;
        this.tamanhoDenominador = tamanhoDenominador;
    }
}
