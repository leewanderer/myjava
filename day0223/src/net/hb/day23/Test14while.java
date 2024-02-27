package net.hb.day23;

public class Test14while {

	public static void main(String[] args) {
		// 반복문  do{~~} while(조건){}; for(){} while(조건){}
		System.out.println("Test14while"); 
		int num=0;

		while(true) {
			num=num+1;
			if(num==5) {continue;}
			System.out.print(num+" "); 
			if(num==10) {break;}
		}

	}//end	
}//class End
