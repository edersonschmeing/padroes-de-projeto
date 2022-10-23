package factory_method.java.exemplo_transportes.half_simple.factory;

import factory_method.java.exemplo_transportes.half_simple.modelo.Ferroviario;
import factory_method.java.exemplo_transportes.half_simple.modelo.Rodoviario;
import factory_method.java.exemplo_transportes.half_simple.modelo.Transporte;

public class TerrestreFactory extends TransporteFactory { 
         
    public Transporte criarTransporte(int capacidade) {

        //aqui será implementado a complexidade de criação do objeto 
        if (capacidade == Transporte.GRANDE) { 
           return new Ferroviario();
        } else if (capacidade == Transporte.POUCA) {
           return new Rodoviario(); 
        }
        return null;

    }

}

    

