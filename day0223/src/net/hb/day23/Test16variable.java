package net.hb.day23;

import java.util.Scanner;

public class Test16variable {

	public static void main(String[] args) {
	int su =0; //지역변수는 값이없는상태  출력문법이라 에러발생
	Scanner scan = new Scanner(System.in);
	System.out.print("숫자입력>>> ");
	su=scan.nextInt();
	System.out.println("숫자 = " + su);

	  
//	  boolean su = true;
	  scan.close();
	}//end	
}//class End
