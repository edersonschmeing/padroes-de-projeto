package builder.java.exemplo.builders;

import builder.java.exemplo.carros.TipoDoCarro;
import builder.java.exemplo.componentes.ComputadorDeBordo;
import builder.java.exemplo.componentes.Motor;
import builder.java.exemplo.componentes.NavegadorGPS;
import builder.java.exemplo.componentes.Transmissao;

public interface Builder {

    void setTipoDoCarro(TipoDoCarro tipoDoCarro);
    void setAssentos(int assentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao transmissao);
    void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
    void setNavegadorGPS(NavegadorGPS navegadorGPS);

}
