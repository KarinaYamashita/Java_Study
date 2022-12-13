package collection.streamAPI.exercise1;

import collection.streamAPI.exercise1.Contato;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.Function;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class exercise1 {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>(){{
           put(1, new Contato("Julia", 3337777)); 
           put(4, new Contato("Marina", 3335555)); 
           put(3, new Contato("Pedro", 3334444)); 
        }};
        System.out.println(agenda);
        System.out.println("Ordena de acordo com o nº de telefone");
        // Usando classe anômima
        // Set<Map.Entry<Integer,Contato>> set =  new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>() {
        //     @Override
        //     public int compare(Map.Entry<Integer,Contato> contato1, Map.Entry<Integer,Contato> contato2){
        //         return Integer.compare(contato1.getValue().getNumero(), contato2.getValue().getNumero());
        //     }
        // });
        // Usando o comparing permite realizar comparação utilizando uma interface funcional
        // Set<Map.Entry<Integer,Contato>> set =  new TreeSet<>(Comparator.comparing(
        //     new Function<Map.Entry<Integer,Contato>, Integer>() {

        //         @Override
        //         public Integer apply(Entry<Integer, Contato> contato) {
        //             return contato.getValue().getNumero();
        //         }
            
        // }));
        // Usando lambda
        Set<Map.Entry<Integer,Contato>> set =  new TreeSet<>(Comparator.comparing(contato -> contato.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Entry<Integer,Contato> entry : set) {
            System.out.println(entry.getKey()+ " - "+ entry.getValue().getNumero()+ " - "+ entry.getValue().getNome());
        }

        System.out.println("Ordena de acordo com o nome do usuario");
        // Usando classe anômima
        // Set<Map.Entry<Integer,Contato>> set1 =  new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>() {
        //     @Override
        //     public int compare(Map.Entry<Integer,Contato> contato1, Map.Entry<Integer,Contato> contato2){
        //         return contato1.getValue().getNome().compareToIgnoreCase(contato2.getValue().getNome());
        //     }
        // });
        // Usando o comparing permite realizar comparação utilizando uma interface funcional
        // Set<Map.Entry<Integer,Contato>> set1 =  new TreeSet<>(Comparator.comparing(
        //     new Function<Map.Entry<Integer,Contato>, String>() {
        //         @Override
        //         public String apply(Entry<Integer, Contato> contato) {
        //             return contato.getValue().getNome();
        //         }
            
        // }));
        // Usando lambda
        Set<Map.Entry<Integer,Contato>> set1 =  new TreeSet<>(Comparator.comparing(contato -> contato.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        for (Entry<Integer,Contato> entry : set1) {
            System.out.println(entry.getKey()+ " - "+ entry.getValue().getNumero()+ " - "+ entry.getValue().getNome());
        }
    }
}
