package builder.java.exemplo_carro.builders;

import builder.java.exemplo_carro.carros.TipoDoCarro;
import builder.java.exemplo_carro.componentes.ComputadorDeBordo;
import builder.java.exemplo_carro.componentes.Motor;
import builder.java.exemplo_carro.componentes.NavegadorGPS;
import builder.java.exemplo_carro.componentes.Transmissao;

public interface Builder {

    void setTipoDoCarro(TipoDoCarro tipoDoCarro);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
    void setNavegadorGPS(NavegadorGPS navegadorGPS);

}
