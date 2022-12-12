package collection.map.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class desafio {
    public static void main(String[] args) {
        Integer numLancamentos = 100;
        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();
        for (int i = 0; i < numLancamentos; i++) {
            Integer valor = geradorDeLancamento.nextInt(11);
            valores.add(valor);
        }
        System.out.println(valores.toString());
        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if(lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado)+1));
            else lancamentos.put(resultado,1);
        }
        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
