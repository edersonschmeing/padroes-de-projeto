package builder.java.exemplo_carro.builders;

import builder.java.exemplo_carro.carros.Carro;
import builder.java.exemplo_carro.carros.TipoDoCarro;
import builder.java.exemplo_carro.componentes.ComputadorDeBordo;
import builder.java.exemplo_carro.componentes.Motor;
import builder.java.exemplo_carro.componentes.NavegadorGPS;
import builder.java.exemplo_carro.componentes.Transmissao;

public class CarroBuilder implements Builder {
   
    
    private TipoDoCarro tipoDoCarro;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private NavegadorGPS navegadorGPS;


    public void setTipoDoCarro(TipoDoCarro tipoDoCarro) {
        this.tipoDoCarro = tipoDoCarro;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    @Override
    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Carro getResultado() {
        return new Carro(tipoDoCarro, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
    }
}