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
		
		new Color(255,255,255); //�� ����
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null); //�ڵ����� ȭ�� �߾� ��ġ
		f.setSize(200,300);
		f.setLayout(null);

		MyButton g = new MyButton();
		g.setBounds(0, 0, 200, 200);
		f.add(g);
		
		class action implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				g.repaint(); //���� ������ g��ư��(JLabel�� �ٽ� �׷���) ��,paintComponent�޼ҵ� �ٽ� ����
				
			}
			
		}
		Timer t = new Timer(100,new action()); //100�� ���� ��� action��ü ����
		t.start(); //Ÿ�̸� ����
		f.setVisible(true);
		
	}
}

//JButton���� �ϸ� ���� �߻�

class MyButton extends JLabel{
	public int a;
	//paintComponent �Լ��� ��ư�� �����ɶ� �ڵ����� ���۵Ǵ� �޼ҵ�
	public void paintComponent(Graphics g) {
		a = (int) (Math.random()*50);
		g.fillRect(100-a, 100-a, 2*a, 2*a);
	}
	
}
	


