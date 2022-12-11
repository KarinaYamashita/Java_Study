package collection.set.exercise2;

import java.util.Comparator;


public class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita aux1, LinguagemFavorita aux2){
        return aux1.ide.compareToIgnoreCase(aux2.ide);

    }

}
