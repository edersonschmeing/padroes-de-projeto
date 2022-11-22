package chain_of_responsibility.java.exemplo_numeros.modelo;

public class ProcessadorPositivo extends ProcessadorBase {

    public ProcessadorPositivo(Processador proximoProcessador) {
    
        super(proximoProcessador); 
        
     }
     
     public void processar(Numero requisicao) {
       
         if (requisicao.getValor() > 0)     {
             System.out.println("Processador de números positivos : " + requisicao.getValor());
         } else {
             super.processar(requisicao);
         }
     }
    
}
