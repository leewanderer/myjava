package net.hb.day23;

public class Test11dowhile {

	public static void main(String[] args) {
		// 반복문  do{~~} while(조건){}; for(){} while(조건){}
		System.out.println("do{} while() 반복문");
		int num=0, total=0;
		
		do {
			num=num+1;
			System.out.print(num + " " );	
			total=total+num;
		} while(num<10);
		
		System.out.println("total= "+total );

	}//end	
}//class End
