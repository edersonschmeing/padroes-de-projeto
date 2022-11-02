package facade.java.exemplo_conversao_video.modelo;

public class ArquivoDeVideo {
    
    private String nome;
    private String tipoCodec;

    public ArquivoDeVideo(String nome) {
        this.nome = nome;
        this.tipoCodec = nome.substring(nome.indexOf(".") + 1);
    }

    public String getTipoCodec() {
        return tipoCodec;
    }

    public String getNome() {
        return nome;
    }

}
