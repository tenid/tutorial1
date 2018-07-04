import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;





public class Main {

	public static void main(String[] args) {
		
		new Color(255,255,255); //색 설정
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null); //자동으로 화면 중앙 배치
		f.setSize(200,300);
		f.setLayout(null);

		MyButton g = new MyButton();
		g.setBounds(0, 0, 200, 200);
		f.add(g);
		
		class action implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				g.repaint(); //새로 설정된 g버튼을(JLabel을 다시 그려라) 즉,paintComponent메소드 다시 실행
				
			}
			
		}
		Timer t = new Timer(100,new action()); //100초 동안 계속 action객체 생성
		t.start(); //타이머 시작
		f.setVisible(true);
		
	}
}

//JButton으로 하면 오류 발생

class MyButton extends JLabel{
	public int a;
	//paintComponent 함수는 버튼이 생성될때 자동으로 시작되는 메소드
	public void paintComponent(Graphics g) {
		a = (int) (Math.random()*50);
		g.fillRect(100-a, 100-a, 2*a, 2*a);
	}
	
}
	


