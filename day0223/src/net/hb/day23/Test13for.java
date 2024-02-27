package net.hb.day23;

public class Test13for {

	public static void main(String[] args) {
		// 반복문  do{~~} while(조건){}; for(){} while(조건){}
		
		int num=0;
		for(int i=0; i<10; i++) { //세미콜론이 여기들어가면 코드가 여기서끝난것임
			num=num+1;
			if(num==5) {continue;}
			System.out.print(num + " " );	
		}//for end
		
		System.out.println(); //라인개행
		num=0; //이거 주석처리하면 무한루프돌음
		while(true) {
			num=num+1;
			if(num==5) {continue;}
			System.out.print(num+" "); 
			if(num==10) {break;}
			
		}

	}//end	
}//class End
