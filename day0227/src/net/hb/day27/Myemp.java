package net.hb.day27;
import java.util.Scanner;
public class Myemp {
	public static void main(String[] args) {
		 //문제 Scanner클래스 이름데이터입력, 주소데이터입력  반복문X,제어문X
		//문제  Scanner 클래스 단점
		//문제 Scanner클래스 단점 숫자입력후 엔터치면 다음라인에서 문자입력시 문자값대신 엔터
		int sabun = 241000;
		String name = null;
		Scanner scan = new Scanner (System.in);
		
		System.out.println( "이름입력 >>> ") ;
		name = scan.nextLine();
		
		System.out.println(" 사번입력 >>> ");
		sabun= scan.nextInt(); //이름을 먼저 입력하면 이렇게해도됨
				
		
		System.out.println();
		System.out.println( "사번 = "+sabun + "\t 이름 =" + name);
		System.out.println("화요일 출석체크");
		scan.close();
		
		
		
//     String name="", juso="";
//     Scanner scan = new Scanner(System.in);
//     System.out.print("이름입력>>> ");
//     name = scan.nextLine();
//     System.out.print("주소입력>>> ");
//     juso = scan.nextLine();
//     
//     System.out.println(); //<br>역할 구분
//     System.out.println("이름 = " + name +" 주소 = " + juso);
     
     scan.close();
	}//end
}//class END





