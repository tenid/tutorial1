import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Main {     
    
 
	public static void main(String[] args) {   
		JFrame f = new JFrame("���� ������");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200,300);
		
		DefaultListModel<String> m = new DefaultListModel<>();
		m.addElement("����");
		m.addElement("�ܹ���");
		m.addElement("�Ŷ��");
		m.addElement("�����");
		
		
		JList l = new JList(m);
		f.add(l);
		
		l.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(!e.getValueIsAdjusting())
				System.out.println(l.getSelectedValuesList());
			}
		});
		f.setVisible(true);
		
    }

}




