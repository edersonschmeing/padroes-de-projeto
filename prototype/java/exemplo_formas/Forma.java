package prototype.java.exemplo_formas;


public abstract class Forma {
    public int x;
    public int y;
    public String cor;

    public Forma() {
    }

    public Forma(Forma forma) {
        if (forma != null) {
            this.x = forma.x;
            this.y = forma.y;
            this.cor = forma.cor;
        }
    }

    public abstract Forma clone();

}