package factory_method.java.depois_do_padrao;

import factory_method.java.depois_do_padrao.modelo.Transporte;
import factory_method.java.depois_do_padrao.factory.AereoFactory;
import factory_method.java.depois_do_padrao.factory.DutoviarioFactory;
import factory_method.java.depois_do_padrao.factory.FerroviarioFactory;
import factory_method.java.depois_do_padrao.factory.HidroviarioFactory;
import factory_method.java.depois_do_padrao.factory.RodoviarioFactory;
import factory_method.java.depois_do_padrao.factory.TransporteFactory;

public class ClienteFactory {

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte ###");
        
        System.out.println("");
        TransporteFactory aereoFactory = new AereoFactory();
        Transporte transporteAereo = aereoFactory.ordemDeTransporte();
        System.out.println(transporteAereo.toString());

        System.out.println("");
        TransporteFactory ferroviarioFactory = new FerroviarioFactory(); 
        Transporte transporteFerroviario = ferroviarioFactory.ordemDeTransporte();
        System.out.println(transporteFerroviario.toString());

        System.out.println("");
        TransporteFactory hidroviarioFactory = new HidroviarioFactory();
        Transporte transporteHidroviario = hidroviarioFactory.ordemDeTransporte();;
        System.out.println(transporteHidroviario.toString());

        System.out.println("");
        TransporteFactory rodoviarioFactory = new RodoviarioFactory();
        Transporte transporteRodoviario = rodoviarioFactory.ordemDeTransporte();
        System.out.println(transporteRodoviario.toString());


        System.out.println("");
        TransporteFactory dutoviarioFactory = new DutoviarioFactory();
        Transporte transporteDutoviario = dutoviarioFactory.ordemDeTransporte();
        System.out.println(transporteDutoviario.toString());


    }

}