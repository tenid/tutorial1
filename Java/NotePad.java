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
	
		//윈도우 창 만들기
	JFrame f= new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // javaw.exe가 꺼지지않는 버그해결
	f.setSize(500,400);
	//텍스트 기능 수행
	TextArea t = new TextArea();
	f.add(t);
	//메뉴 만들기

	JMenuBar m = new JMenuBar();
	f.setJMenuBar(m);
	f.setFocusable(true);
	
	JMenu m_file = new JMenu("파일");
	JMenu m_editer = new JMenu("수정");
	
	m.add(m_file);
	m.add(m_editer);
	
	JMenuItem i_save =new JMenuItem("저장");
	JMenuItem i_load =new JMenuItem("불러오기");
	m_file.add(i_save);
	m_file.add(i_load);
	
	
	i_save.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FileDialog dialog = new FileDialog(f, "저장", FileDialog.SAVE);
			dialog.setVisible(true);
			String path = dialog.getDirectory()+dialog.getFile();
			
			try {
			FileWriter w = new FileWriter(path);
			String s= t.getText();
			w.write(s);
			w.close();
			}
			catch(Exception e2) {
				 System.out.println("저장오류"+e2);
			}
					
			
		}
	});
	
i_load.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FileDialog dialog = new FileDialog(f, "읽기", FileDialog.LOAD);
			dialog.setVisible(true);
			String path = dialog.getDirectory()+dialog.getFile();
			String s="";
			if(dialog.getFile()==null)return; //불러오기의 값이 null일때 발생하는 버그 수정
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
				System.out.println("오류"+e);
			}
					
					t.setText(s);
		}
	});
	
	
	
	f.setVisible(true);
	
	
	}
}
