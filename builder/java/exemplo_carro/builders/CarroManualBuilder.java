package builder.java.exemplo_carro.builders;

import builder.java.exemplo_carro.carros.Manual;
import builder.java.exemplo_carro.carros.TipoDoCarro;
import builder.java.exemplo_carro.componentes.ComputadorDeBordo;
import builder.java.exemplo_carro.componentes.Motor;
import builder.java.exemplo_carro.componentes.NavegadorGPS;
import builder.java.exemplo_carro.componentes.Transmissao;

public class CarroManualBuilder implements Builder{
   
    private TipoDoCarro tipoDoCarro;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private NavegadorGPS navegadorGPS;


    public void setTipoDoCarro(TipoDoCarro tipoDoCarro) {
        this.tipoDoCarro = tipoDoCarro;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Manual getResultado() {
        return new Manual(tipoDoCarro, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
    }
    
}

