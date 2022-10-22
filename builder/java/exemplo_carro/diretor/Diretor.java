package builder.java.exemplo_carro.diretor;

import builder.java.exemplo_carro.builders.Builder;
import builder.java.exemplo_carro.carros.TipoDoCarro;
import builder.java.exemplo_carro.componentes.ComputadorDeBordo;
import builder.java.exemplo_carro.componentes.Motor;
import builder.java.exemplo_carro.componentes.NavegadorGPS;
import builder.java.exemplo_carro.componentes.Transmissao;

public class Diretor {

    public void construirCarroSport(Builder builder) {
        builder.setTipoDoCarro(TipoDoCarro.CARRO_SPORT);
        builder.setAssentos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmissao(Transmissao.SEMI_AUTOMATICO);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setNavegadorGPS(new NavegadorGPS());
    }

    public void construirCarroCidade(Builder builder) {
        builder.setTipoDoCarro(TipoDoCarro.CARRO_CIDADE);
        builder.setAssentos(2);
        builder.setMotor(new Motor(1.0, 0));
        builder.setTransmissao(Transmissao.AUTOMATICO);
        builder.setComputadorDeBordo(new ComputadorDeBordo());
        builder.setNavegadorGPS(new NavegadorGPS());
    }

    public void construirSUV(Builder builder) {
        builder.setTipoDoCarro(TipoDoCarro.SUV);
        builder.setAssentos(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setNavegadorGPS(new NavegadorGPS());
    }
}

