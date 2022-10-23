package factory_method.java.exemplo_transporte.half_simple.factory;

import factory_method.java.exemplo_transporte.half_simple.modelo.Aereo;
import factory_method.java.exemplo_transporte.half_simple.modelo.Hidroviario;
import factory_method.java.exemplo_transporte.half_simple.modelo.Transporte;

public class NaoTerrestreFactory extends TransporteFactory { 

         
    public Transporte criarTransporte(int capacidade) {

         //aqui será implementado a complexidade de criação do objeto 
         if (capacidade == Transporte.GRANDE) { 
            return new Hidroviario();
         } else if (capacidade == Transporte.POUCA) {
            return new Aereo(); 
         }
         return null;

    }

}

    

