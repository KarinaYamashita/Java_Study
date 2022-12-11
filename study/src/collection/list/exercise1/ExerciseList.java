package collection.list.exercise1;

import java.util.*;

class ExerciseList {
    /**
     * @param args
     */
    public static void main(String[] args) {
    List<Double> notas = new ArrayList<Double>();
    notas.add(7.0);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5.0);
    notas.add(7.0);
    notas.add(0.0);
    notas.add(3.6);
    System.out.println("Notas:");
    print(notas);
    System.out.println("Exibe a posicao da nota 5.0: " + notas.indexOf(5.0));
    System.out.println("-----------------------------------");
    System.out.println("Substituir a nota da posicaoo 4 por 8.0:");
    notas.add(4, 8.0);
    print(notas);
    System.out.println("Substituir a nota 5.0 por 6.0:");
    notas.set(notas.indexOf(5.0), 6.0);
    print(notas);

    System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
    
    System.out.println("Exibe a 3ª nota: " +notas.get(2));
    
    System.out.println("Exibe a menor nota: " + Collections.min(notas));
    
    System.out.println("Exibe a mior nota: " + Collections.max(notas));
    
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;        
    }
    System.out.println("Exibe a soma das notas: " +soma);
    System.out.println("Exibe a media das notas: " + (soma/notas.size()));
    
    System.out.println("Remove a menor nota:");
    notas.remove(notas.indexOf(Collections.min(notas)));
    print(notas);

    System.out.println("Remove as notas inferiores a 7:");
    Iterator<Double> iterator2 = notas.iterator();
    while (iterator2.hasNext()) {
        Double next = iterator2.next();
        if (next < 7) iterator2.remove();      
    }
    print(notas);
    
    // notas.clear();
    // System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    
    LinkedList<Double> notas2 = new LinkedList();
    Iterator<Double> iterator3 = notas.iterator();
    while (iterator3.hasNext()) {
        notas2.add(iterator3.next());
    }
    System.out.println("Notas 2:");
    print(notas2);
    System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
    notas2.remove(0);
    print(notas2);
    }
    
    private static void print(List<Double> notas) {
        System.out.println(notas.toString());
        System.out.println("-----------------------------------");
    }
}