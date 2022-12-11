package collection.set.exercise1;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
            coresArcoIris.add("vermelho");
            coresArcoIris.add("laranja");
            coresArcoIris.add("amarela");
            coresArcoIris.add("verde");
            coresArcoIris.add("azul");
            coresArcoIris.add("azul-escuro");
            coresArcoIris.add("violeta");

            System.out.println("Imprime todas as cores do arco-iris:");
            for(String cor : coresArcoIris){
                System.out.println(cor);
            }

            System.out.println("A quantidade de cores do arco-iris é: " + coresArcoIris.size());

            System.out.println("Ordena em ordem alfabetica as cores: ");
            Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
            System.out.println(coresArcoIris1);

            Set<String> coresArcoIris2 = new LinkedHashSet<>(
                Arrays.asList("vermelho","laranja","amarelo","verde","azul","azul-escuro","violeta"));
            System.out.println(coresArcoIris2);
        }
}
