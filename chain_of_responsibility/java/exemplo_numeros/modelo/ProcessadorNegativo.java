package chain_of_responsibility.java.exemplo_numeros.modelo;

public class ProcessadorNegativo extends ProcessadorBase {

    public ProcessadorNegativo(Processador proximoProcessador) {
    
       super(proximoProcessador); 
       
    }
    
    public void processar(Numero requisicao) {
      
        if (requisicao.getValor() < 0)     {
            System.out.println("Processadro de números negativos : " + requisicao.getValor());
        } else {
            super.processar(requisicao);
        }
    }
   
}
