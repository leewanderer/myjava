package net.hb.day23;

public class Test10print {

	public static void main(String[] args) {
		System.out.printf("Test09print문서\n");
		
		System.out.printf("%.2f %c %s",  3.141592, 'B', "kim" );
		System.out.printf("%10.2f %c %s",  3.141592, 'B', "kim" );
		//10자리 확보해서 오른쪽에서부터 나옴 (그래서 10개미만이면 왼쪽에 공간생김)
		//1번처럼 아무것도안쓰면 자동처리
		//. 뒤에는 원하는 소수점자리까지

	}//end	
}//class End
