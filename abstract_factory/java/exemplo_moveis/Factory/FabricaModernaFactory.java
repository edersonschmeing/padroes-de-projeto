package abstract_factory.java.exemplo_moveis.Factory;

import abstract_factory.java.exemplo_moveis.Modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.Modelo.CadeiraModerna;

import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentroModerna;
import abstract_factory.java.exemplo_moveis.Modelo.Sofa;
import abstract_factory.java.exemplo_moveis.Modelo.SofaModerna;


public class FabricaModernaFactory implements FabricaFactory {
    

    public Cadeira fabricaCadeira() {

        System.out.println("Fabricado uma cadeira moderna");
        return new CadeiraModerna();
    }
        
    public MesaDeCentro fabricaMesaDeCentro() {

        System.out.println("Fabricando uma mesa moderna");
        return new MesaDeCentroModerna();
        
    }

    public Sofa fabricaSofa(){
        System.out.println("Fabricando um sofa moderno");
        return new SofaModerna();
    }

}
