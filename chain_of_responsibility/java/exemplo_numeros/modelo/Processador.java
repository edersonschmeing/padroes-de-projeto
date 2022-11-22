package chain_of_responsibility.java.exemplo_numeros.modelo;

public interface Processador {
    
    public void setProximoProcessador(Processador proximoProcessador);
    
    public void processar(Numero requisicao);

}
