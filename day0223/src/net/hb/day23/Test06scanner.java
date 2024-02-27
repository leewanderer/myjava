package net.hb.day23;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class Test06scanner {
	public static void main(String[] args) {
		int dan=0;
		//스캐너세트------
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단 입력>>>  ");
		dan= scan.nextInt();
		//스캐너세트끝-------
		for(int i=0; i<10; i=i+1) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		scan.close();
		//자바의 기본클래스는 java.lang팩키지 포함 되어있으면 import생략가능
		//1. 자바에서 키보드입력 scanner클래스 이용 java.util패키지소속 Scanner클래스
		//2. 보통 클래스를 객체화(object)를함 new키워드 Scanner scan =new Scanner(System.in);
		//3.안내문 숫자변수는 : sc.nextInt()  문자변수라면 :sc.nextLine()
	}//end	
}//class End
