package collection.set.exercise2;

import java.util.Comparator;

public class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita aux1, LinguagemFavorita aux2){
        int anoDeCriacao = Integer.compare(aux1.anoDeCriacao, aux2.anoDeCriacao);
        if(anoDeCriacao != 0)return anoDeCriacao;
        return aux1.nome.compareToIgnoreCase(aux2.nome);

    }
}
