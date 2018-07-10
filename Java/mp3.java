import javax.swing.JFrame;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

class Main {     
    
    public static void main(String[] args) {   
     
     JFXPanel panel = new JFXPanel();
     
     JFrame f = new JFrame("메인 윈도우");
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setLocationRelativeTo(null);
     f.setSize(200,200);
     
     Media m = new Media("file:/C:/Users/user/Documents/Remix.mp3");
     MediaPlayer p = new MediaPlayer(m);
     p.play();
     
     f.setVisible(true);
     
     
    }

}




