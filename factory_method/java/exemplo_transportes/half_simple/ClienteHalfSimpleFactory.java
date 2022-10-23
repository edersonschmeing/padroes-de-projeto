package factory_method.java.exemplo_transportes.half_simple;

import factory_method.java.exemplo_transportes.half_simple.factory.NaoTerrestreFactory;
import factory_method.java.exemplo_transportes.half_simple.factory.TerrestreFactory;
import factory_method.java.exemplo_transportes.half_simple.modelo.Transporte;

public class ClienteHalfSimpleFactory {

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte ###");
        
        System.out.println("");
        TerrestreFactory terrestreCapacidadeGrandeFactory = new TerrestreFactory();
        Transporte transporteCapacidadeGrande = terrestreCapacidadeGrandeFactory.ordemDeTransporte(Transporte.GRANDE);
        System.out.println(transporteCapacidadeGrande.toString());

        System.out.println("");
        TerrestreFactory terrestreCapacidadePoucaFactory = new TerrestreFactory();
        Transporte transporteCapacidadePouca = terrestreCapacidadePoucaFactory.ordemDeTransporte(Transporte.POUCA);
        System.out.println(transporteCapacidadePouca.toString());

        System.out.println("");
        NaoTerrestreFactory naoTerrestreCapacidadeGrandeFactory = new NaoTerrestreFactory();
        Transporte transporteCapacidadeGrandeN = naoTerrestreCapacidadeGrandeFactory.ordemDeTransporte(Transporte.GRANDE);
        System.out.println(transporteCapacidadeGrandeN.toString());

        System.out.println("");
        NaoTerrestreFactory naoTerrestreCapacidadePoucaFactory = new NaoTerrestreFactory();
        Transporte transporteCapacidadePoucaN = naoTerrestreCapacidadePoucaFactory.ordemDeTransporte(Transporte.POUCA);
        System.out.println(transporteCapacidadePoucaN.toString());

    }

}