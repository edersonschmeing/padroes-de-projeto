package factory_method.java.exemplo_transporte.depois_do_padrao.factory;

import factory_method.java.exemplo_transporte.depois_do_padrao.modelo.Transporte;

public abstract class TransporteFactory { 

         
    public Transporte ordemDeTransporte() {

         Transporte transporte = null;
             
         transporte = criarTransporte();

         transporte.entregar();

         return transporte;

    }

    protected abstract Transporte criarTransporte();

}

    

