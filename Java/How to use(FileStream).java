import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
	  int k;
	      	
	  try {
	  
      FileInputStream input = new FileInputStream("C:\\Users\\user\\Documents\\text.txt");
      FileOutputStream out = new FileOutputStream("C:\\Users\\user\\Documents\\copy.txt");
      
      while((k=input.read())!=-1)
      {
    	 out.write(k); 
      }
     input.close();
     out.close();
	  }
	  catch (Exception e) {
		// TODO: handle exception
		 System.out.println(e);
	}
             
    
		
		
	}
}





