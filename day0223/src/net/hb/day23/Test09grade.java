package net.hb.day23;
public class Test09grade {
	public static void main(String[] args) {
		int kor=60, eng=85, total=0;   
		double avg=0.0;
		String result="";
		char grade='F'; //꼭 선언하세요 안하면 에러발생합니다.
		
		total = kor+eng;
		avg=(double)total/2;  //87.5출력
			
		if(avg >= 90) {grade = 'A';}
		else if (avg >= 80) {grade = 'B';}
		else if (avg >= 70) {grade = 'C';}
		else if (avg >= 60) {grade = 'D';}
		else {grade='F';}
		
		if(avg >=70) {result="축합격";}
		else {result="재시험";}
	
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg);
		System.out.println("학점=" + grade);
		System.out.println("결과=" + result);
		
	}//end
}//class END
