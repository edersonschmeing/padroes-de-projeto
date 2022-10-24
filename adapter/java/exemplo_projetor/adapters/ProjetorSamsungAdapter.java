package adapter.java.exemplo_projetor.adapters;

import adapter.java.exemplo_projetor.modelo.ProjetorSamsung;

public class ProjetorSamsungAdapter implements Projetor {
    
    private ProjetorSamsung projetor;

    public ProjetorSamsungAdapter (ProjetorSamsung projetor) {
      this.projetor = projetor;
    }
 
    public void liga() {
       projetor.turnOn();
    }

}
