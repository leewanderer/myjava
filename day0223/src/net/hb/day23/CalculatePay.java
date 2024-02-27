package net.hb.day23;

import java.util.Scanner;

public class CalculatePay {
	public static void main(String[] args) {
		final int RATE = 5000; //상수
		int pay=0;
		int hours = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("시간을 입력하세요 : ");
		hours = input.nextInt();
		
		if(hours > 8)
			pay = RATE * 8 + (int)(1.5*RATE*(hours-8));
		else
			pay = RATE * hours;
		
		System.out.printf("임금은 %d 입니다.\n", pay);
	}//end	
}//class End
