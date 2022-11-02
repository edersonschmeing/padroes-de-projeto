package facade.java.exemplo_subsistema;

import facade.java.exemplo_subsistema.facade.SubSistemaFacade;

public class Cliente {

    public static void main(String[] args) {
      
        SubSistemaFacade subSistemaFacade = new SubSistemaFacade();
        
        subSistemaFacade.operacaoAB();
        System.out.println(""); 
        
        subSistemaFacade.operacaoAC();
        System.out.println(""); 
    
        subSistemaFacade.operacaoBC();
        System.out.println(""); 
        
        subSistemaFacade.operacaoABC();
        System.out.println(""); 
    
    }    
    
}
