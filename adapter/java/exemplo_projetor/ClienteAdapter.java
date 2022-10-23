/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Adaptador
*
*/

package adapter.java.exemplo_projetor;

import adapter.java.exemplo_projetor.adapters.AdaptadorProjetorLG;
import adapter.java.exemplo_projetor.adapters.AdaptadorProjetorSamsung;
import adapter.java.exemplo_projetor.modelo.ProjetorLG;
import adapter.java.exemplo_projetor.modelo.ProjetorSamsung;

public class ClienteAdapter {

    public static void main(String[] args) {
        
        AdaptadorProjetorSamsung projetorSamsung = new AdaptadorProjetorSamsung(new ProjetorSamsung());
        
        AdaptadorProjetorLG projetorLG = new AdaptadorProjetorLG(new ProjetorLG());
        
        ControleProjetores controlaProjetores = new ControleProjetores();
        
        controlaProjetores.inicia(projetorSamsung);  
        controlaProjetores.inicia(projetorLG);      

     }

    
}
