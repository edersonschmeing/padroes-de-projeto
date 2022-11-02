package facade.java.exemplo_conversao_video;

import facade.java.exemplo_conversao_video.facade.ConversaoDeVideoFacade;

import java.io.File;

public class Cliente {

    public static void main(String[] args) {
        
        ConversaoDeVideoFacade converter = new ConversaoDeVideoFacade();
        
        File video_mp4 = converter.converterVideo("youtubevideo.ogg", "mp4");
        // ...
    }
    
}
