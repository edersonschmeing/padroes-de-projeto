package chain_of_responsibility.java.exemplo_numeros.modelo;

public class Corrente {

    Processador processador;

    public Corrente() {

        //processador = new ProcessadorNegativo(new ProcessadorZero(new ProcessadorPositivo(null)));

        processador = new ProcessadorNegativo(null);
        Processador p2 = new ProcessadorZero(null);
        Processador p3 = new ProcessadorPositivo(null);
        
        processador.setProximoProcessador(p2);
        p2.setProximoProcessador(p3);
    
    }

    public void processar(Numero requisicao) {
       processador.processar(requisicao);
    }

    
}
