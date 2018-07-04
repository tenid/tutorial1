import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;





public class Main {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null); //자동으로 화면 중앙 배치
		f.setSize(200,300);
		f.setLayout(null);
		
	
		
		
		JButton b = new JButton("그리기");
		b.setBounds(20, 200, 150, 50);
		f.add(b);
		
		MyButton u = new MyButton();
		u.setBounds(0, 0, 200, 200);
		f.add(u);
		
		class action implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				u.a=(int)(Math.random()*150)+1;
				u.b=(int)(Math.random()*150)+1;
				u.repaint();
				
			}
			
			
			
		}
		b.addActionListener(new action());
		f.setVisible(true);
		
	}
}

//JButton으로 하면 오류 발생
class MyButton extends JLabel{
	public int a,b;
	public void paintComponent(Graphics g) {
		g.drawLine(0, 0, a, b);
	}
	
}
	


