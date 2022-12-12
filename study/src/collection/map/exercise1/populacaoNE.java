package collection.map.exercise1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class populacaoNE {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os estados do NE e suas respectivas populacoes:");
        Map<String, Integer> populacaoEstadoNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);            
        }};
        System.out.println(populacaoEstadoNE.toString());
        System.out.println("-------------------------");
        populacaoEstadoNE.put("RN", 3534165);
        System.out.println(populacaoEstadoNE);
        System.out.println("-------------------------");
        System.out.println("O estado PB esta no dicionario: "+ populacaoEstadoNE.containsKey("PB"));
        if (populacaoEstadoNE.containsKey("PB")== false) {
            populacaoEstadoNE.put("PB", 4039277);
        }
        System.out.println(populacaoEstadoNE);
        System.out.println("-------------------------");
        System.out.println("O estado PE tem uma populacao de: "+ populacaoEstadoNE.get("PE"));
        System.out.println("-------------------------");
        
        System.out.println("Exibe as informacoes dos estados na ordem informada");
        Map<String,Integer> populacaoEstadoNE2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265); 
        }};
        System.out.println(populacaoEstadoNE2);
        System.out.println("-------------------------");
        
        System.out.println("Exibe as informacoes dos estados na ordem alfabetica");
        Map<String, Integer> populacaoEstadoNE3 = new TreeMap<>(populacaoEstadoNE);
        System.out.println(populacaoEstadoNE3);
        System.out.println("-------------------------");

        System.out.println("Exibe o estado com a menor  e a maior populacao e a quantidade, respectivamente: ");
        Integer menorPopulacao = Collections.min(populacaoEstadoNE.values());
        Set<Map.Entry<String, Integer>> entries = populacaoEstadoNE.entrySet();
        String estadoMenosPopuloso ="";
        Integer maiorPopulacao = Collections.max(populacaoEstadoNE.values());
        String estadoMaisPopuloso ="";
        for (Map.Entry<String,Integer> entry : entries) {
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado menos populoso "+ estadoMenosPopuloso+ "-"+ menorPopulacao);
            }
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaisPopuloso = entry.getKey();\
                System.out.println("Estado mais populoso "+ estadoMaisPopuloso+ "-"+ maiorPopulacao);
            }
        }
        Integer somaPopulacao = 0;
        Iterator<Integer> iterator = populacaoEstadoNE.values().iterator();
        while (iterator.hasNext()) {
            somaPopulacao += iterator.next();
        }
        System.out.println("Soma da populacao dos estados encontrados acima"+ somaPopulacao);
        System.out.println("Populacao medias dos estados e: "+ (somaPopulacao/populacaoEstadoNE.size()));
        Iterator<Integer> iterator2 = populacaoEstadoNE.values().iterator();
        while (iterator2.hasNext()) {
            if(iterator2.next()<=4000000){
                iterator2.remove();
            }
        }
        System.out.println(populacaoEstadoNE);
        populacaoEstadoNE.clear();
        System.out.println("Confira se está vazia: " + populacaoEstadoNE.isEmpty());
    }
}
