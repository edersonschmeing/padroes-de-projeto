package facade.java.exemplo_conversao_video.modelo;

public class CodecFactory {
    
    public static Codec extrair(ArquivoDeVideo arquivo) {
      
        String tipo = arquivo.getTipoCodec();
      
        if (tipo.equals("mp4")) {
            System.out.println("CodecFactory: extraindo mpeg audio...");
            return new CodecDeCompactacaoMPEG4();
        }
        else {
            System.out.println("CodecFactory: extraindo ogg audio...");
            return new CodecDeCompactacaoOgg();
        }
    }

}
