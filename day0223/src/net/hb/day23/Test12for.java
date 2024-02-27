package net.hb.day23;

public class Test12for {

	public static void main(String[] args) {
		// 반복문  do{~~} while(조건){}; for(){} while(조건){}
		System.out.println("for() 반복문");
		int num=0, total=0;
		
		for(int i=0; i<10; i++)  {// ;<-소괄호뒤에 쓰면 코드가 여기서끝난것임
			num=num+1;
			System.out.print(num + " " );	
			total=total+num;
		}
		
		System.out.println("total= "+total );

	}//end	
}//class End
