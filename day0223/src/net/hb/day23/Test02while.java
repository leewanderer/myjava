package net.hb.day23;

public class Test02while {

	public static void main(String[] args) {
		int su=0, total=0;
		while(su<10) {//누적연산처리 while 반복문밖에 기술
			su=su+1;
			
			System.out.print(su+"  ");
			total= total+su ;
		}
		System.out.println("total="+total);

	}//end	
}//class End
