package chain_of_responsibility.java.exemplo_numeros.modelo;

public abstract class ProcessadorBase implements Processador {
    
    private Processador proximoProcessador;

    protected ProcessadorBase(Processador proximoProcessador) {
        this.proximoProcessador = proximoProcessador;     
    }

    public void setProximoProcessador(Processador proximoProcessador) {
        this.proximoProcessador = proximoProcessador;
    }

    public void processar(Numero requisicao) {
        if (this.proximoProcessador != null) {
            this.proximoProcessador.processar(requisicao);
        }
    }
}
