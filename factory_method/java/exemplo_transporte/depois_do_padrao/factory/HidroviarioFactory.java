package factory_method.java.exemplo_transporte.depois_do_padrao.factory;

import factory_method.java.exemplo_transporte.depois_do_padrao.modelo.Hidroviario;
import factory_method.java.exemplo_transporte.depois_do_padrao.modelo.Transporte;

public class HidroviarioFactory extends TransporteFactory { 
         
    public Transporte criarTransporte() {

        //aqui será implementado a complexidade de criação do objeto 
        return new Hidroviario();

    }

}

    

