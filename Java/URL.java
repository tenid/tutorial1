import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;

class Main {     
    
    public static void main(String[] args) {   
     
    	JFrame f = new JFrame("메인윈도우");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setLocationRelativeTo(null);
    	f.setSize(200,300);
    	
        try {
        	
			URL u = new URL("http://itlove.tistory.com/attachment/cfile1.uf@9993783359DC28F60DA181.zip");
			
			HttpURLConnection h = (HttpURLConnection) u.openConnection();
			h.addRequestProperty("User-Agent", "Mozilla/4.0");
			
			InputStream in = (InputStream)h.getInputStream();
			FileOutputStream out = new FileOutputStream(new File("C:/Users/user/Downloads/test2.zip"));
			int k;
			while((k=in.read())!= -1)
			{
				out.write(k);
			}
			in.close();
			out.close();
			System.out.println("다운로드 완료.");
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	f.setVisible(true);
     
     
    }

}




