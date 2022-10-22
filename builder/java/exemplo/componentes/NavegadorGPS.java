package builder.java.exemplo.componentes;


public class NavegadorGPS {

    private String rota;

    public NavegadorGPS() {
        this.rota = "BR-277, KM-555, Cascavel, Paraná, Brasil";
    }

    public NavegadorGPS(String manualRota) {
        this.rota = manualRota;
    }

    public String getRota() {
        return rota;
    }
}
