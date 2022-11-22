package chain_of_responsibility.java.exemplo_numeros.modelo;

public class ProcessadorZero extends ProcessadorBase{

    public ProcessadorZero(Processador proximoProcessador) {
    
        super(proximoProcessador); 
        
     }
     
     public void processar(Numero requisicao) {
       
         if (requisicao.getValor() == 0)     {
             System.out.println("Processador do número zero : " + requisicao.getValor());
         } else {
             super.processar(requisicao);
         }
     }
    
}
