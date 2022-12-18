package collection.calculadoraDeValorDePCBA;

//import collection.calculadoraDeValorDePCBA.dominio.Componentes;
import collection.calculadoraDeValorDePCBA.dominio.ComponenteThroughHole;
import collection.calculadoraDeValorDePCBA.dominio.ComponentesSMD;
import collection.calculadoraDeValorDePCBA.dominio.Projeto;

public class Main {
    public static void main(String[] args) {
        //LeituraDados();
        ComponenteThroughHole componente1 = new ComponenteThroughHole();
        componente1.setTipoComponente("Resistor 20 k");
        componente1.setQuantidadeComponente(10);

        ComponenteThroughHole componente2 = new ComponenteThroughHole();
        componente2.setTipoComponente("Capacitor 400 nF");
        componente2.setQuantidadeComponente(15);

        ComponentesSMD componente3 = new ComponentesSMD();
        componente3.setTipoComponente("capacitor 20 uF");
        componente3.setQuantidadeComponente(20);
        
        ComponentesSMD componente4 = new ComponentesSMD();
        componente4.setTipoComponente("Resistor 100");
        componente4.setQuantidadeComponente(3);

        
        Projeto projeto = new Projeto();
        projeto.setNome("Celsius");
        projeto.getListaComponentes().add(componente1);
        projeto.getListaComponentes().add(componente2);
        projeto.getListaComponentes().add(componente3);
        projeto.getListaComponentes().add(componente4);

        System.out.println(projeto.getListaComponentes());
        System.out.printf("Valor do projeto: R$ %.2f \n", projeto.calcularValorTotal());

    }


}
