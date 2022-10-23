package adapter.java.exemplo_burraco_redondo.adapters;

import adapter.java.exemplo_burraco_redondo.Modelo.PinoQuadrado;
import adapter.java.exemplo_burraco_redondo.Modelo.PinoRedondo;

public class PinoQuadradoAdapter extends PinoRedondo {
    
    private PinoQuadrado pino;

    public PinoQuadradoAdapter(PinoQuadrado pino) {
        this.pino = pino;
    }

    @Override
    public double getRaio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return resultado;
    }
}
