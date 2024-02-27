package net.hb.day23;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
		int month;
		int year = 2011;
		int lastDay = 9;
		
		Scanner input= new Scanner(System.in);
		System.out.print("원하는 달을 입력하세요 : " );
		month = input.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay =31;
			break;
		case 2:
			lastDay =28;
			break;
			default 
				
				lastDay=30;
				break;	
		}

		
		System.out.println(month +"월의 마지막 날은" +lastDay+"입니다.");
	}//end	
}//class End
