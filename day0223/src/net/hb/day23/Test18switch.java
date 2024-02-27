package net.hb.day23;

public class Test18switch {
	public static void main(String[] args) {
		int kor=97, eng=91, total=0;   
		double avg=0.0;
		String result="";
		char grade='F'; //꼭 선언하세요 안하면 에러발생합니다.
	
		
		total = kor+eng;
		avg=(double)total/2;  
		
		
//		if(avg >= 90) {grade = 'A';}
//		else if (avg >= 80) {grade = 'B';}
//		else if (avg >= 70) {grade = 'C';}
//		else if (avg >= 60) {grade = 'D';}
//		else {grade='F';}

		//switch(조건){case값 : 처리; break; ~~  default: 처리; break;}
		switch((int)avg/10) {//실수형데이터는 에러발생해서 int형으로 형변환
		case 10: grade='A'; break;
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; break;
		}//switch end
		
		
		if(avg >=70) {result="축합격";}
		else {result="재시험";}

		
		System.out.println("국어=" + eng);
		System.out.println("영어=" + kor);
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg + "평균 = " + (int)avg);
		System.out.println("학점=" + grade);
		System.out.println("결과=" + result);
		System.out.println("Test18문서 3:32");
		
	}//end
}//class END
