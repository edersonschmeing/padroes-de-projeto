package abstract_factory.java.exemplo_moveis.factory;

import abstract_factory.java.exemplo_moveis.modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.modelo.Sofa;


public interface FabricaFactory {
    
    public Cadeira fabricaCadeira();
        
    public MesaDeCentro fabricaMesaDeCentro();

    public Sofa fabricaSofa();
    
}
