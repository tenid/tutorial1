import java.io.File;

class class01 {     
    
    public static void main(String[] args) {   
            
            File f = new File("c:\\abc\\myfile.txt");
            System.out.println(f.exists()); //true
            System.out.println(f.isDirectory()); //false
            System.out.println(f.length()+" bytes"); // ���Ͽ뷮�� ��µȴ�.
            
            File f2 = new File("c:\\abc");      
            System.out.println(f2.isDirectory()); //true
            
            File f3 = new File("c:\\abc\\test.txt");
            System.out.println(f3.exists()); //false
            try {   f3.createNewFile(); } // 0����Ʈ�� �������� �����ȴ�.
            catch( Exception e) {}          
            System.out.println(f3.exists()); //true
        
    }      
}