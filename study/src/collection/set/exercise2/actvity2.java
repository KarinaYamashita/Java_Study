package collection.set.exercise2;

// import collection.set.exercise2.LinguagemFavorita;
// import collection.set.exercise2.ComparatorIde;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class actvity2 {
    public static void main(String[] args) {
        final Set<LinguagemFavorita> listaLinguagemFavoritas = new HashSet<>(){{
            add(new LinguagemFavorita("C#", 2000 , "Visual Studio"));
            add(new LinguagemFavorita("Java", 1991 , "VSC"));
            add(new LinguagemFavorita("JavaScript", 1995 , "Eclipse"));           
        }};
        Set<LinguagemFavorita> listaLinguagemFavoritas2 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("JavaScript", 1995 , "Eclipse"));           
            add(new LinguagemFavorita("Java", 1991 , "VSC"));
            add(new LinguagemFavorita("C#", 2000 , "Visual Studio"));
        }};
        for(LinguagemFavorita linguagem : listaLinguagemFavoritas2)System.out.println(linguagem);
        
        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> listaLinguagemFavoritas3 = new TreeSet<>(listaLinguagemFavoritas);
        for(LinguagemFavorita linguagem : listaLinguagemFavoritas3)System.out.println(linguagem);
        
        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> listaLinguagemFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        listaLinguagemFavoritas4.addAll(listaLinguagemFavoritas);
        for(LinguagemFavorita linguagem : listaLinguagemFavoritas4)System.out.println(linguagem);
        
        System.out.println("--------\tOrdem Ano de criacao e nome\t--------");
        Set<LinguagemFavorita> listaLinguagemFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        listaLinguagemFavoritas5.addAll(listaLinguagemFavoritas);
        for(LinguagemFavorita linguagem : listaLinguagemFavoritas5)System.out.println(linguagem);
        
        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> listaLinguagemFavoritas6 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoENome());
        listaLinguagemFavoritas6.addAll(listaLinguagemFavoritas);
        for(LinguagemFavorita linguagem : listaLinguagemFavoritas6)System.out.println(linguagem);

    }
}
