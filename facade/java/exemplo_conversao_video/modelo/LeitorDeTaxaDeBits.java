package facade.java.exemplo_conversao_video.modelo;

public class LeitorDeTaxaDeBits {
  
    public static ArquivoDeVideo ler(ArquivoDeVideo arquivo, Codec codec) {
        System.out.println("LeitorDeTaxaDeBits: leitura do arquivo...");
        return arquivo;
    }

    public static ArquivoDeVideo converter(ArquivoDeVideo buffer, Codec codec) {
        System.out.println("LeitorDeTaxaDeBits: gravando arquivo...");
        return buffer;
    }
}