package net.hb.day26;

import java.util.Scanner;

public class Test05gugudan {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력 >>> ");
	  int dan=scan.nextInt() ;
    for(int i=0; i<10; i=i+1) {
    	System.out.println(dan+"*"+i+"="+(dan*i));
    }
	}//end
}//class END
