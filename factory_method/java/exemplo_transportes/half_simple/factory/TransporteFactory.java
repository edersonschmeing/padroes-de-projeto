package factory_method.java.exemplo_transportes.half_simple.factory;

import factory_method.java.exemplo_transportes.half_simple.modelo.Transporte;

public abstract class TransporteFactory { 

         
    public Transporte ordemDeTransporte(int capacidade) {

         Transporte transporte = null;
             
         transporte = criarTransporte(capacidade);

         transporte.entregar();

         return transporte;

    }

    protected abstract Transporte criarTransporte(int capacidade);

}

    

