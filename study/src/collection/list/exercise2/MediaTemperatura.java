package collection.list.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * MediaTemp Este programa irá funcionar corretamente quando os valores de média inserida forem diferentes
 */

public class MediaTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperature = new ArrayList<Double>();    
        
        // Realiza a entrada das temperaturas
        for (int index = 0; index < 6; index++) {
            System.out.print("Digite a temperatura " + (index+1) + ": ");
            double temp = scan.nextDouble();
            temperature.add(temp);
        }
        System.out.println("***********************");
        
        //Mostra as temperaturas armazenadas
        temperature.forEach(t -> System.out.print(t + " "));
        // Calcula a temperatura média
        final Double average = temperature.stream().mapToDouble((val) -> val).average().orElse(0.0);
        System.out.printf("\n A temperatura média é: %.2f \n", average);

        // Busca as temperaturas acima da Media
        System.out.print("As temperaturas acima da média são: ");
        temperature.stream().filter(t -> t > average).forEach(t -> System.out.print(t + " "));
        System.out.print("\n Os meses em que a temperatura foi acima da média são: ");
        temperature.stream().filter(t -> t > average).forEach(t -> MediaTemperatura.mes(temperature.indexOf(t)));       
    }
    public static void mes(int x) {
        switch (x){
            case (0):
            System.out.print("Janeiro ");
            break;
            case (1):
            System.out.print("Fevereiro ");
            break;
            case (2):
            System.out.print("Março ");
            break;
            case (3):
            System.out.print("Abril ");
            break;
            case (4):
            System.out.print("Maio ");
            break;
            case (5):
            System.out.println("Junho");
            break;
            
     
        }
        
    }
}

