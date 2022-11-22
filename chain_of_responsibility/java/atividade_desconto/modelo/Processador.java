package chain_of_responsibility.java.atividade_desconto.modelo;

public interface Processador {
    
    public void setProximoProcessador(Processador proximoProcessador);
    
    public void processar(Venda requisicao);


}
