package abstract_factory.java.exemplo_moveis.Factory;

import abstract_factory.java.exemplo_moveis.Modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.Modelo.CadeiraVitoriano;
import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentroVitoriano;
import abstract_factory.java.exemplo_moveis.Modelo.Sofa;
import abstract_factory.java.exemplo_moveis.Modelo.SofaVitoriano;

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