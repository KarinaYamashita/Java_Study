package calculadoraDeValorDePCBA.dominio;

public abstract class Componentes {
    protected static final Double valorPadrao = 0.60d;

    private String tipoComponente;
    private Integer quantidadeComponente;

    public abstract Double calcularValor();

    public static Double getValorpadrao() {
        return valorPadrao;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public Integer getQuantidadeComponente() {
        return quantidadeComponente;
    }

    public void setQuantidadeComponente(Integer quantidadeComponente) {
        this.quantidadeComponente = quantidadeComponente;
    }

 
}
