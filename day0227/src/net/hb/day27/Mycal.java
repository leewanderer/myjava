package net.hb.day27;

public class Mycal {
	public static void main(String[] args) {
		int a=7, b=0;
		int hap=0, nmg=0;
		double mok =0.0;
		
		try {
		
		mok=(double)a/b;
		nmg=a%b;
		}catch(Exception e) {System.out.println("에러이유 " +e);}
		hap=a+b; //더하기는 에러가날리가없기때문에 밖으로빼도됨
		
		
		System.out.println("합 =" + hap);
		System.out.println("몫 =" + mok);
		System.out.println("나 =" + nmg);
		System.out.println("화요일 출석");
		
	} //end
}//class END
