package abstract_factory.java.exemplo_moveis.factory;

import abstract_factory.java.exemplo_moveis.modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.modelo.CadeiraVitoriano;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentroVitoriano;
import abstract_factory.java.exemplo_moveis.modelo.Sofa;
import abstract_factory.java.exemplo_moveis.modelo.SofaVitoriano;

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