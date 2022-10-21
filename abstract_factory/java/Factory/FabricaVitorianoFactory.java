package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.CadeiraVitoriano;
import abstract_factory.java.Modelo.MesaDeCentro;
import abstract_factory.java.Modelo.MesaDeCentroVitoriano;
import abstract_factory.java.Modelo.Sofa;
import abstract_factory.java.Modelo.SofaVitoriano;

public class FabricaVitorianoFactory implements FabricaFactory {
    
    public Cadeira fabricaCadeira() {

        System.out.println("Fabricado uma cadeira vitoriano");
        return new CadeiraVitoriano();
    }
        
    public MesaDeCentro fabricaMesaDeCentro() {

        System.out.println("Fabricando uma mesa vitoriano");
        return new MesaDeCentroVitoriano();

    }

    public Sofa fabricaSofa(){
        System.out.println("Fabricando um sofa vitoriano");
        return new SofaVitoriano();
    }


}