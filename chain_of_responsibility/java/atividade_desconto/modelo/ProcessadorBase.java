package chain_of_responsibility.java.atividade_desconto.modelo;

public abstract class ProcessadorBase implements Processador {
    
    private Processador proximoProcessador;

    public ProcessadorBase(Processador proximoProcessador) {
        this.proximoProcessador = proximoProcessador;     
    }

    public void setProximoProcessador(Processador proximoProcessador) {
        this.proximoProcessador = proximoProcessador;
    }

    public void processar(Venda requisicao) {
        if (this.proximoProcessador != null) {
            this.proximoProcessador.processar(requisicao);
        }
    }
}
