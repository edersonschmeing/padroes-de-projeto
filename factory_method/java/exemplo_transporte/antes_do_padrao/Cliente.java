
package factory_method.java.exemplo_transporte.antes_do_padrao;

import factory_method.java.exemplo_transporte.antes_do_padrao.modelo.Aereo;
import factory_method.java.exemplo_transporte.antes_do_padrao.modelo.Ferroviario;
import factory_method.java.exemplo_transporte.antes_do_padrao.modelo.Hidroviario;
import factory_method.java.exemplo_transporte.antes_do_padrao.modelo.Rodoviario;
import factory_method.java.exemplo_transporte.antes_do_padrao.modelo.Transporte;

public class Cliente {

    private static Transporte ordemDeTransporte(int tipo) { 

        Transporte transporte = null;
     
        switch (tipo) {
            case Transporte.AEREO:
                transporte = new Aereo();
                break;
            case Transporte.FERROVIARIO:
                transporte = new Ferroviario();
                break;         
            case Transporte.HIDROVIARIO:
                transporte = new Hidroviario();
                break;
            case Transporte.RODOVIARIO:
                transporte = new Rodoviario();
                break;

        }        

        transporte.entregar();

        return transporte;
    }

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte - antes do padrão ###");
        
        System.out.println("");
        Transporte aereo = ordemDeTransporte(Transporte.AEREO);
        System.out.println(aereo.toString());

        System.out.println("");
        Transporte ferroviario = ordemDeTransporte(Transporte.FERROVIARIO);
        System.out.println(ferroviario.toString());

        System.out.println("");
        Transporte hidroviario = ordemDeTransporte(Transporte.HIDROVIARIO);
        System.out.println(hidroviario.toString());

        System.out.println("");
        Transporte transporteRodoviario = ordemDeTransporte(Transporte.RODOVIARIO);
        System.out.println(transporteRodoviario.toString());

    }

}