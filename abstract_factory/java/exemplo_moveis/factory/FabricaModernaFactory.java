package abstract_factory.java.exemplo_moveis.factory;

import abstract_factory.java.exemplo_moveis.modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.modelo.CadeiraModerna;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentroModerna;
import abstract_factory.java.exemplo_moveis.modelo.Sofa;
import abstract_factory.java.exemplo_moveis.modelo.SofaModerna;


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
