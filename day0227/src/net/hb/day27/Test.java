package net.hb.day27;

public class Test {
	public static void main(String[] args) {
		// 예외처리기 try{예외가 발생할수있는 코드}catch(예외종류참조변수){예외처리코드}
		int x =3;
		int y =9;
		
		
		try {int result = x/y;
		System.out.println("result = " +result);
		}catch(Exception e) {
			System.out.println("Divided By Zero Exception!!!");
		}
		
		System.out.println("try -catch block is ended");

	} //end
}//class END
