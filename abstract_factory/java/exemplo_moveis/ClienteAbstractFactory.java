package abstract_factory.java.exemplo_moveis;

import abstract_factory.java.exemplo_moveis.factory.FabricaArtDecoFactory;
import abstract_factory.java.exemplo_moveis.factory.FabricaFactory;
import abstract_factory.java.exemplo_moveis.factory.FabricaModernaFactory;
import abstract_factory.java.exemplo_moveis.factory.FabricaVitorianoFactory;
import abstract_factory.java.exemplo_moveis.modelo.Cadeira;
import abstract_factory.java.exemplo_moveis.modelo.MesaDeCentro;
import abstract_factory.java.exemplo_moveis.modelo.Sofa;

public class ClienteAbstractFactory {

    public static void main(String[] args) {
           
        System.out.println("### Fabricando móveis  ###");        
        
        String tipos[] = {"M", "V", "A"};

        String tipo = tipos[0]; 
        //String tipo = tipos[1]; 
        //String tipo = tipos[2]; 
        

        FabricaFactory factory = null;
        if (tipo == "M")
            factory = new FabricaModernaFactory();
        else if  (tipo == "V") 
            factory = new FabricaVitorianoFactory();
        else 
            factory = new FabricaArtDecoFactory();

        Cadeira cadeira = factory.fabricaCadeira();
        cadeira.sentar();
        System.out.println(cadeira.toString());
        
        System.out.println(" ");        
        
        MesaDeCentro mesaDeCentro = factory.fabricaMesaDeCentro();
        mesaDeCentro.colocarDecoracao();
        System.out.println(mesaDeCentro.toString());
        
        Sofa sofa = factory.fabricaSofa();
        sofa.deitar();
        System.out.println(sofa.toString());
    }
    
}
