package proxy.java.exemplo_imagem.Modelo;

public class ImagemReal implements Imagem {  
   
    private String nomeDoArquivo;
    
    public ImagemReal(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
        carregarDoDisco(nomeDoArquivo);
     }
    
     public void exibir() {
        System.out.println("Exibindo " + nomeDoArquivo);
     }
    
    private void carregarDoDisco(String nomeDoArquivo){
        System.out.println("Carregando " + nomeDoArquivo);
     }
   }
