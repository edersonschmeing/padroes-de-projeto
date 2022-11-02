package facade.java.exemplo_conversao_video.modelo;

import java.io.File;

public class MixAudio {
    
    public File consertar(ArquivoDeVideo resultado){
        System.out.println("MixAudio: consertando audio...");
        return new File("tmp");
    }

}
