package builder.java.exemplo_carro;

import builder.java.exemplo_carro.builders.CarroBuilder;
import builder.java.exemplo_carro.builders.CarroManualBuilder;
import builder.java.exemplo_carro.carros.Carro;
import builder.java.exemplo_carro.carros.Manual;
import builder.java.exemplo_carro.diretor.CarDiretor;

public class ClienteBuilder {
    
    public static void main(String[] args) {
        
        CarDiretor diretor = new CarDiretor();
        
        CarroBuilder builder = new CarroBuilder();
        diretor.construirCarroSport(builder);

        Carro carro = builder.getResultado();
        System.out.println("Carro construído:\n" + carro.getTipoDoCarro());


        CarroManualBuilder manualBuilder = new CarroManualBuilder();
        diretor.construirCarroSport(manualBuilder);

        Manual manual = manualBuilder.getResultado();
        System.out.println("\nCarro manual construído:\n" + manual.print());
    }

}
