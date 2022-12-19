package calculadoraDeValorDePCBA.dominio;

public class ComponenteThroughHole extends Componentes{
    public ComponenteThroughHole() {
    }

    public Double calcularValor() {
        return (valorPadrao + 0.20)*getQuantidadeComponente();
    }

    @Override
    public String toString() {
        return "ComponenteThroughHole [tipoComponente=" + getTipoComponente() +
               ", quantidadeComponente=" + getQuantidadeComponente()
                + "]";
    }
}
