package net.hb.day27;

import java.util.Scanner;

public class Mygugudanexception {
	public static void main(String[] args) {	
	
		int kor = 34; //자바에서  null값은 클래스타입,interface타입
		//null값은 클래스의 초기값에 사용
		char flag = 'a';//char 타입은 무조건 싱글따옴표
		int dan =1;
		Scanner scan  ;= new Scanner(System.in); //ne w
		
		try {
		System.out.print("Mygugudan 단입력 >>> ");
	  dan=scan.nextInt() ; //블럭변수
//		}catch(Exception ex) {}
		
    for(int i=1; i<10; i=i+1) {
    	System.out.println(dan+"*"+i+"="+(dan*i));
    }
    
    scan.close(); //java.io
    

	}//end
}//class END
