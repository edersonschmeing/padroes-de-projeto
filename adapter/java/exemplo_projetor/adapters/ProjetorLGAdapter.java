package adapter.java.exemplo_projetor.adapters;

import adapter.java.exemplo_projetor.modelo.ProjetorLG;

public class ProjetorLGAdapter implements Projetor {
    
    private ProjetorLG projetor;

    public ProjetorLGAdapter (ProjetorLG projetor) {
      this.projetor = projetor;
    }
 
    public void liga() {
       projetor.enable(0);
    }

}
