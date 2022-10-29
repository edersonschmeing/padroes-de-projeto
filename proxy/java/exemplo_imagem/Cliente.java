/**
* https://pt.wikipedia.org/wiki/Proxy_(padrões_de_projeto)
* Exemplo do padrão de projeto Proxy
*
*/

package proxy.java.exemplo_imagem;

import proxy.java.exemplo_imagem.Modelo.Imagem;
import proxy.java.exemplo_imagem.proxies.ImagemProxy;

public class Cliente {

    public static void main(String[] args) {
        
        Imagem imagem = new ImagemProxy("TADS.png");
        //A imagem será carregada do disco
        imagem.exibir();

        System.out.println("");
        
        //A imagem não será carregada do disco
        imagem.exibir();
    }

}
    

