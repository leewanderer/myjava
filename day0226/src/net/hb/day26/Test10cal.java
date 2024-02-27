package net.hb.day26;
public class Test10cal {
	public static void main(String[] args) {
		//증감연산 = 단항연산 ++ -- 1씩증가 | 1씩감소

		int a=4, b=4, tot=0, hap=0;
		
		hap = ++b +3; //앞에 ++이 있으면 먼저 증감후 연산 5+3=8 a=5
		tot = a++ +3; //뒤에 ++이 있으면 먼저 계산후 증감 4+3=7 a=5
		
		System.out.println("b=" + b + "\t hap=" + hap);
		System.out.println("a=" + a + "\t tot=" + tot);
		
		System.out.println();
		int su=10;
		for(int i=0; i<10; i++) {
			System.out.println(su + "");
			su--;
			
			//10 9 8 7 6 su변수
		}
				
	}//end
}//class END
