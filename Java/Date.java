import java.util.Date;

class Main {     
    
 
	public static void main(String[] args) {   
    	 Date d = new Date();        
         System.out.println(d.toString()); // 현재 날짜와 시간 요일이 영어로 출력된다.
         
         System.out.println(d.getMonth()+1); // 달
         System.out.println(d.getDate()); //날짜
         System.out.println(d.getHours()); //시간
         System.out.println(d.getMinutes()); //분
     
    }

}




