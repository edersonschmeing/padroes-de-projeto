package factory_method.java.exemplo_transportes.simple;

import factory_method.java.exemplo_transportes.simple.factory.TransporteSimpleFactory;
import factory_method.java.exemplo_transportes.simple.modelo.Transporte;

public class ClienteSimpleFactory {

    public static void main(String[] args) {
     
        System.out.println("### Ordem de transporte - simple factory ###");
        
        System.out.println("");
        Transporte transporteAereo = TransporteSimpleFactory.ordemDeTransporte(Transporte.AEREO);
        System.out.println(transporteAereo.toString());

        System.out.println("");
        Transporte transporteFerroviario = TransporteSimpleFactory.ordemDeTransporte(Transporte.FERROVIARIO);
        System.out.println(transporteFerroviario.toString());

        System.out.println("");
        Transporte transporteHidroviario = TransporteSimpleFactory.ordemDeTransporte(Transporte.HIDROVIARIO);
        System.out.println(transporteHidroviario.toString());

        System.out.println("");
        Transporte transporteRodoviario = TransporteSimpleFactory.ordemDeTransporte(Transporte.RODOVIARIO);
        System.out.println(transporteRodoviario.toString());

    }

}