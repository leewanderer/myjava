package net.hb.day26;

import java.util.Scanner;

public class Work26_05coffee2 {
	Scanner sc = new Scanner(System.in);
	int menu=0, in=0, out=0;
	int coffee = 200;
	int cocoa = 250;
	boolean run = true;
	
	System.out.print("요금을 투입하세요 >>>");
	in = sc.nextInt();
	while(run) {
		System.out.println("==========커피 자판기==========");
		System.out.println("1. 커피(200)\t2. 코코아(250)\t 3. 반환  4.종료");
		System.out.print("메뉴를 선택하세요 >>>");
		menu = sc.nextInt();
		if(menu==1) {
			out = in-coffee;
			System.out.println("맛있게 드세요.");
			if(coffee>out) {
				System.out.println("요금이 부족합니다.");
			}
		}else if(menu==2) {
			out = in-cocoa;
			System.out.println("맛있게 드세요.");
			if(cocoa>out) {
				System.out.println("요금이 부족합니다.");
			}
		}else if(menu==3) {
			System.out.println("거스름돈 : "+out);
			in = out;
		}else if(menu==4) {
			System.out.println("프로그램 종료!!");
			run = false;
		}
	}
}
}