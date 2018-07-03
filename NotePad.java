import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;




public class Main {

	public static void main(String[] args) {
	
		//������ â �����
	JFrame f= new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // javaw.exe�� �������ʴ� �����ذ�
	f.setSize(500,400);
	//�ؽ�Ʈ ��� ����
	TextArea t = new TextArea();
	f.add(t);
	//�޴� �����

	JMenuBar m = new JMenuBar();
	f.setJMenuBar(m);
	f.setFocusable(true);
	
	JMenu m_file = new JMenu("����");
	JMenu m_editer = new JMenu("����");
	
	m.add(m_file);
	m.add(m_editer);
	
	JMenuItem i_save =new JMenuItem("����");
	JMenuItem i_load =new JMenuItem("�ҷ�����");
	m_file.add(i_save);
	m_file.add(i_load);
	
	
	i_save.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FileDialog dialog = new FileDialog(f, "����", FileDialog.SAVE);
			dialog.setVisible(true);
			String path = dialog.getDirectory()+dialog.getFile();
			
			try {
			FileWriter w = new FileWriter(path);
			String s= t.getText();
			w.write(s);
			w.close();
			}
			catch(Exception e2) {
				 System.out.println("�������"+e2);
			}
					
			
		}
	});
	
i_load.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FileDialog dialog = new FileDialog(f, "�б�", FileDialog.LOAD);
			dialog.setVisible(true);
			String path = dialog.getDirectory()+dialog.getFile();
			String s="";
			if(dialog.getFile()==null)return; //�ҷ������� ���� null�϶� �߻��ϴ� ���� ����
			try {
						FileReader r = new FileReader(path);
						
						int k;
						for(;;)
						{
							k=r.read();
							if(k==-1)break;
							s+=(char)k;
						}
						r.close();
			}
			catch(Exception e2) {
				System.out.println("����"+e);
			}
					
					t.setText(s);
		}
	});
	
	
	
	f.setVisible(true);
	
	
	}
}
