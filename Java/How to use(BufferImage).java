import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("메인 윈도우"); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		JLabel l = new JLabel();
		f.add(l);
		
		File file = new File("C:\\Users\\user\\Documents\\Hyengin.png");
		BufferedImage m;
		
		try {
			m=ImageIO.read(file);
			l.setIcon(new ImageIcon(m));
		} catch (Exception e) {};
		
		
		f.pack();
		f.setVisible(true);
		
	
		
	}
}





