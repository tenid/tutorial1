
class Main {     
    
 
	public static void main(String[] args) {   
		long a = System.currentTimeMillis();
		for( double i=0; i<10000000; i++) { };
		long b = System.currentTimeMillis();
		System.out.println(b-a);

    }

}




