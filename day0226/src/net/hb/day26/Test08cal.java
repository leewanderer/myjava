package net.hb.day26;

public class Test08cal {

	public static void main(String[] args) {
		//증감연산 = 단항연산 ++ -- 1씩증가 | 1씩감소

		int a=4, b=4, tot=0, hap=0;
		tot = (a++) +3; //뒤에 ++이 있으면 먼저 계산후 증감 4+3=7 a=5
		hap = (++b) +3; //앞에 ++이 있으면 먼저 증감후 연산 5+3=8 a=5
//		a++; //단독으로 기술할때 ++앞, --앞/ 뒤++, 뒤--
//		b++;// a=a+1; a=a-1; 상관없다
//		
//		++a;
//		++b;
//		
//		a--;
//		--b;
		
//		--a;
//		b--;
		System.out.println("a=" + a + "\t tot=" + tot);
		System.out.println("b=" + b + "\t hap=" + hap);
	}//end

}
