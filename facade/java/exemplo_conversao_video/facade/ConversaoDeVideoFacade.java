package facade.java.exemplo_conversao_video.facade;

import java.io.File;

import facade.java.exemplo_conversao_video.modelo.ArquivoDeVideo;
import facade.java.exemplo_conversao_video.modelo.Codec;
import facade.java.exemplo_conversao_video.modelo.CodecDeCompactacaoMPEG4;
import facade.java.exemplo_conversao_video.modelo.CodecDeCompactacaoOgg;
import facade.java.exemplo_conversao_video.modelo.CodecFactory;
import facade.java.exemplo_conversao_video.modelo.LeitorDeTaxaDeBits;
import facade.java.exemplo_conversao_video.modelo.MixAudio;

public class ConversaoDeVideoFacade {
    
    public File converterVideo(String nomeDoArquivo, String formato) {
       
        System.out.println("VideoConversionFacade: conversão iniciada.");
       
        ArquivoDeVideo arquivo = new ArquivoDeVideo(nomeDoArquivo);
        Codec codecFonte = CodecFactory.extrair(arquivo);
        Codec codecDestino;
       
        if (formato.equals("mp4")) {
            codecDestino = new CodecDeCompactacaoMPEG4();
        } else {
            codecDestino = new CodecDeCompactacaoOgg();
        }
       
        ArquivoDeVideo buffer = LeitorDeTaxaDeBits.ler(arquivo, codecFonte);
        ArquivoDeVideo resultadoIntermediario = LeitorDeTaxaDeBits.converter(buffer, codecDestino);
       
        File resultado = (new MixAudio()).consertar(resultadoIntermediario);
        System.out.println("VideoConversionFacade: conversão completada.");
        return resultado;
    }

}


