package collection.streamAPI.exercise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class exercise2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = 
            Arrays.asList("1", "0" , "4", "1" , "2" , "3" , "9", "9","6","5");
        System.out.println("Imprime os elementos da lista de String: ");
        numerosAleatorios.forEach(System.out::println);
        
        System.out.println("Insira os 5 primeiros numeros em um Set: ");
        Set<String> collectSet = numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet());
        System.out.println(collectSet);
        
        System.out.println("Converte a lista de String para inteiros: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);
            // for (Integer integer : collecList) {
        //     System.out.println(integer);
        // }

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> collecList2 = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(numero -> numero % 2 == 0 && numero > 2)
            .collect(Collectors.toList());
        System.out.println(collecList2);

        System.out.println( "Mostre a media dos numeros: ");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);
        // System.out.println("Remova os valores impares: ");
        // numerosAleatoriosInteger.removeIf(numero -> numero % 2 != 0);
        // System.out.println(numerosAleatoriosInteger);

        System.out.println("Ingore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatoriosInteger.stream()
            .skip(3)
            .forEach(System.out::println);

        System.out.println("Removendo os numeros repetidos da lista, quantos restam?");
        long contadorNumerosUnicos = numerosAleatoriosInteger.stream()
            .distinct()
            .count();
        System.out.println(contadorNumerosUnicos);
        System.out.println("Imprime o menor valor da lista");
        numerosAleatoriosInteger.stream()
            .mapToInt(Integer::intValue)    
            .min()
            .ifPresent(System.out::println);
        System.out.println("Imprime o maior valor da lista");
        numerosAleatoriosInteger.stream()
            .mapToInt(Integer::intValue)    
            .max()
            .ifPresent(System.out::println);    
        System.out.println("Some apenas os numeros pares: ");
        Integer somaDePares = numerosAleatoriosInteger.stream()
            .filter(numero -> numero % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(somaDePares);
        System.out.println("Some apenas os numeros impares: ");
        Integer somaDeImpares = numerosAleatoriosInteger.stream()
            .filter(numero -> numero % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println(somaDeImpares);

        System.out.println("Mostra a lista em ordem numerica: ");
        List<Integer> numerosOrdemCrescente = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemCrescente);
        System.out.println("Mostra a lista em ordem decrescente: ");
        List<Integer> numerosOrdemDecrescente = numerosAleatoriosInteger.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemDecrescente);
        System.out.println("Agrupe os valores impares multiplos de 3 ou de 5: ");
        Map<Boolean, List<Integer>> numerosMultiplosDe3e5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(numero -> (numero % 3 == 0 ||numero % 5 == 0)));
        System.out.println(numerosMultiplosDe3e5);
    }
}
