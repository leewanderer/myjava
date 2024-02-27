package net.hb.day27;


import java.io.IOException;
import java.net.ServerSocket;

//public class MyServer {
//	public static void main(String[] args) throws IOException {
//
//			ServerSocket ss = new ServerSocket();
//
//	} //end
//}//class END

//예외처리  Unhandled 에러는 try{}catch(Exception ex){}권장
//무한루프처리 Unreachable에러는 조건주어서 break;



public class MyServer {
	public static void main(String[] args)  {

			try {
				ServerSocket ss = new ServerSocket();
			} catch (IOException e) {  
				e.printStackTrace();
			}finally {System.out.println("에러상관없이무조건실행");}
	} //end
}//class END
