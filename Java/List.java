import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Main {     
    
 
	public static void main(String[] args) {   
		JFrame f = new JFrame("메인 윈도우");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200,300);
		
		DefaultListModel<String> m = new DefaultListModel<>();
		m.addElement("과자");
		m.addElement("햄버거");
		m.addElement("컵라면");
		m.addElement("음료수");
		
		
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




