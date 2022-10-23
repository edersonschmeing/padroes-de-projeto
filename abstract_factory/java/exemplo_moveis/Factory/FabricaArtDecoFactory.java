package abstract_factory.java.exemplo_moveis.Factory;

import abstract_factory.java.exemplo_moveis.Modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.Modelo.CadeiraArtDeco;
import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.Modelo.MesaDeCentroArtDeco;
import abstract_factory.java.exemplo_moveis.Modelo.SofaArtDeco;
import abstract_factory.java.exemplo_moveis.Modelo.Sofa;

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