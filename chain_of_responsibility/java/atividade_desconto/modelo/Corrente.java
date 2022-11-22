package chain_of_responsibility.java.atividade_desconto.modelo;

public class Corrente {

    Processador processador;

    public Corrente() {

       //implemente    
    }

    public void processar(Venda requisicao) {
       processador.processar(requisicao);
    }

    
}
