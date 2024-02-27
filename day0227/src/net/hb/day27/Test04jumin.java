package net.hb.day27;

public class Test04jumin {
	public static void main(String[] args) {

		
//		String jumin = new String("901124-4837629"); //이게정석
		String jumin = "901124-1837629"; //해법
		
		//1번이나3번이면 남자임/ 2번이거나4번이면 여자임
		char data = jumin.charAt(7);
		if(data =='1' || data=='3') {System.out.println("남자");
		}else if(data=='2' || data=='4') {System.out.println("여자");}
		else {System.out.println("성별알수없음");}
//		char gender = jumin.charAt(7); 
//		char data =jumin.charAt(7); //배열,문자열은 0번째부터시작
		
		//char 는 꼭 따옴표를 붙여줘야함 안그러면 이상하게결과남
	} //end
}//class END
