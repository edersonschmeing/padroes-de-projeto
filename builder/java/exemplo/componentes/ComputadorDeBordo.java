package builder.java.exemplo.componentes;

import builder.java.exemplo.carros.Carro;

public class ComputadorDeBordo {

    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void mostraNivelDeCombustivel() {
        System.out.println("Nível de combustível: " + carro.getCombustivel());
    }

    public void showStatus() {
        if (this.carro.getMotor().estaLigado()) {
            System.out.println("Carro esta ligado");
        } else {
            System.out.println("Carro não esta ligado");
        }
    }
}