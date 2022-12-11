package collection.list.exercise3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Detetive {
    public static void main(String[] args) {
        List<String> answers = new ArrayList<String>();    
        String answer = "";

        System.out.println("Responda as perguntas com 's' para sim e 'n' para não");
        System.out.println("Telefonou para a vitima?");
        answer = respostaValida();
        answers.add(answer.toUpperCase());
        System.out.println("Esteve no local do crime?");
        answer = respostaValida();
        answers.add(answer.toUpperCase());
        System.out.println("Morava proximo a vitima?");
        answer = respostaValida();
        answers.add(answer.toUpperCase());
        System.out.println("Tinha dividas com a vitima?");
        answer = respostaValida();
        answers.add(answer.toUpperCase());
        System.out.println("Ja trabalhou com a vitima?");
        answer = respostaValida();
        answers.add(answer.toUpperCase());

        System.out.println("-----------------------------------");
        System.out.println("As respostas foram: " + answers);
        System.out.println("-----------------------------------");
        
        int count = 0;
        Iterator<String> iterator = answers.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().contains("S")) count++;
        }
        switch (count) {
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }

    }
    private static String respostaValida() {
        Scanner scan = new Scanner(System.in);
        String answer = "";

        do {
            answer = scan.next();
            if (answer.compareToIgnoreCase("S") != 0 && answer.compareToIgnoreCase("N")!=0) {
                System.out.println("Resposta invalida, responda novamente: ");
            } 
        } while (answer.compareToIgnoreCase("S") != 0 && answer.compareToIgnoreCase("N")!=0);

        scan.close();
    
        return answer;
    }
}
