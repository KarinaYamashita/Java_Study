package exceptions;

import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try{
                if(numerador[i]%2 !=0) 
                throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
                if(denominador[i]==0)
                throw new DivisaoPorZeroException("Não é possível realizar divisão por zero!", denominador[i]);
                int resultado = numerador[i]/denominador[i];
                System.out.println(resultado); 
                if(denominador.length != numerador.length)
                throw new TamanhoDoVetorException("Vetores de tamanhos diferentes", numerador.length, denominador.length); 
            }catch (DivisaoNaoExataException | DivisaoPorZeroException | TamanhoDoVetorException e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

        }
        System.out.println("As divisoes foram finalizadas!");
    }
}
