package collection.calculadoraDeValorDePCBA.dominio;

import java.util.*;

public class Projeto {
    private String nome;
    private Set<Componentes> listaComponentes = new LinkedHashSet<>();

    public Double calcularValorTotal() {
        return this.listaComponentes
                .stream()
                .mapToDouble(Componentes::calcularValor)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Componentes> getListaComponentes() {
        return listaComponentes;
    }

    public void setListaComponentes(Set<Componentes> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listaComponentes == null) ? 0 : listaComponentes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Projeto other = (Projeto) obj;
        if (listaComponentes == null) {
            if (other.listaComponentes != null)
                return false;
        } else if (!listaComponentes.equals(other.listaComponentes))
            return false;
        return true;
    }
    
}
