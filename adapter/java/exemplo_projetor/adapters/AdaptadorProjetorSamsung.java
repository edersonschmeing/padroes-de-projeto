package adapter.java.exemplo_projetor.adapters;

import adapter.java.exemplo_projetor.modelo.ProjetorSamsung;

public class AdaptadorProjetorSamsung implements Projetor {
    
    private ProjetorSamsung projetor;

    public AdaptadorProjetorSamsung (ProjetorSamsung projetor) {
      this.projetor = projetor;
    }
 
    public void liga() {
       projetor.turnOn();
    }

}
