package abstract_factory.java.Factory;

import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.MesaDeCentro;
import abstract_factory.java.Modelo.Sofa;


public interface FabricaFactory {
    
    public Cadeira fabricaCadeira();
        
    public MesaDeCentro fabricaMesaDeCentro();

    public Sofa fabricaSofa();
    
}
