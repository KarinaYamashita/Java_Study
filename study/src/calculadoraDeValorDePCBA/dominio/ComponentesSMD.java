package calculadoraDeValorDePCBA.dominio;

public class ComponentesSMD extends Componentes{
    public ComponentesSMD() {
    }

    public Double calcularValor() {
        return valorPadrao*getQuantidadeComponente();
    }

    @Override
    public String toString() {
        return "ComponentesSMD [tipoComponente=" + getTipoComponente() +
               ", quantidadeComponente=" + getQuantidadeComponente()
                + "]";
    }
}
