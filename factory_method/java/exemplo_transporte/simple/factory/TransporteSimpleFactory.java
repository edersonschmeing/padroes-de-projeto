package factory_method.java.exemplo_transporte.simple.factory;

import factory_method.java.exemplo_transporte.simple.modelo.Aereo;
import factory_method.java.exemplo_transporte.simple.modelo.Ferroviario;
import factory_method.java.exemplo_transporte.simple.modelo.Hidroviario;
import factory_method.java.exemplo_transporte.simple.modelo.Rodoviario;
import factory_method.java.exemplo_transporte.simple.modelo.Transporte;

public class TransporteSimpleFactory {

    public static Transporte ordemDeTransporte(int tipo) { 

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



}

    

