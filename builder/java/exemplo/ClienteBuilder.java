package builder.java.exemplo;

import builder.java.exemplo.builders.CarroBuilder;
import builder.java.exemplo.builders.CarroManualBuilder;
import builder.java.exemplo.carros.Carro;
import builder.java.exemplo.carros.Manual;
import builder.java.exemplo.diretor.Diretor;

public class ClienteBuilder {
    
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor();

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
