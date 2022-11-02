package facade.java.atividade_computador;

import facade.java.atividade_computador.facade.ComputadorFacade;

public class Cliente {

    public static void main(String[] args) {
        
        System.out.println("Atividade muito simples do padrão Facade");
        ComputadorFacade computerFacade = new ComputadorFacade();
        computerFacade.incializarComputador();
    }
    
}
