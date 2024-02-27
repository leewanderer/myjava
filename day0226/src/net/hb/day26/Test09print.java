package net.hb.day26;

public class Test09print {
	public static void main(String[] args) {
		 System.out.printf( "|%10d| |%10.2f| %c %s\n",  78, 34567.141592, 'B', "kim" ); 
		 System.out.printf( "|%4d| |%4.2f| %c %s\n",  78, 34567.141592, 'B', "kim" );
		 System.out.printf( "|%d| |%.2f| %c %s\n",  78, 34567.141592, 'B', "kim" );
		 
		 System.out.println(); //<br>태그같은역할 라인개행
		 System.out.printf( "%f %c %s %d\n",  9.1415, 'C', "lee", 24 ); 
	}//end
}//class END
