package abstract_factory.java.exemplo_moveis.Factory;

import abstract_factory.java.exemplo_moveis.Modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.Modelo.Sofa;


public interface FabricaFactory {
    
    public Cadeira fabricaCadeira();
        
    public MesaDeCentro fabricaMesaDeCentro();

    public Sofa fabricaSofa();
    
}
