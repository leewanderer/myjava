package net.hb.day23;

public class Test03while {
	public static void main(String[] args) {
		System.out.println("while(true)반복문");
		int su=0, total=0;
		while(true) {
			su=su+1;
			System.out.print(su+"  "); //12345678910 total=55
			total= total+su ;
			if(su==10) {break;}
			}

		System.out.println("total="+total);

	}//end	
}//class End
