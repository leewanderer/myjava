package net.hb.day26;

public class Work26_02if {
	public static void main(String[] args) {
		  int a=1,b=3,c=12;
			//2조장 정윤님껏 소스예제 설명 
			if(a<b && a<c && b<c) {System.out.println("111  "+ a + " " + b + " " + c);}
			else if(a<b && a<c && c<b) {System.out.println("222  "+a + " " + c + " " + b);}
			else if(b<a && b<c && a<c) {System.out.println("333  "+b + " " + a + " " + c);}
			else if(b<c && b<a && c<a) {System.out.println("444  "+b + " " + c + " " + a);}
			else if(c<a && c<b && a<b) {System.out.println("555  "+c + " " + a + " " + b);}
			else {System.out.println("666  "+c + " " + b + " " + a);}
			
			

			
	} //end
}//class END
