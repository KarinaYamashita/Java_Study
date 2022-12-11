package collection.set.exercise2;

import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita aux1, LinguagemFavorita aux2){
        int nome = aux1.nome.compareToIgnoreCase(aux2.nome);
        int anoDeCriacao = Integer.compare(aux1.anoDeCriacao, aux2.anoDeCriacao);
        if (nome != 0)return nome;
        if(anoDeCriacao != 0)return anoDeCriacao;
        return  aux1.ide.compareToIgnoreCase(aux2.ide);

    }

}
