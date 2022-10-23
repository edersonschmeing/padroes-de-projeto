package abstract_factory.java.exemplo_moveis.factory;

import abstract_factory.java.exemplo_moveis.modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.modelo.CadeiraArtDeco;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentroArtDeco;
import abstract_factory.java.exemplo_moveis.modelo.Sofa;
import abstract_factory.java.exemplo_moveis.modelo.SofaArtDeco;

public class FabricaArtDecoFactory implements FabricaFactory {
    public Cadeira fabricaCadeira() {

        System.out.println("Fabricado uma cadeira art deco");
        return new CadeiraArtDeco();
    }
        
    public MesaDeCentro fabricaMesaDeCentro() {

        System.out.println("Fabricando uma mesa art deco");
        return new MesaDeCentroArtDeco();

    }

    public Sofa fabricaSofa(){
        System.out.println("Fabricando um sofa art deco");
        return new SofaArtDeco();
    }
}