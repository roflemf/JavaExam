import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		/*
		 * 1분문제) 다음 자바소스에서 switch ~ case문을  if else if 다중조건문과 ||(논리합) 연산, 그리고 ==(같다) 연산을 활용한 코드로 변경.
	소스예) 
	import java.util.Scanner;
	
	public class Ex12_01 {
		public static void main(String[] args) {
	
			int month = 0;
	
			System.out.print("현재 월을 입력>>");
	
			Scanner scan=new Scanner(System.in);
			month=Integer.parseInt(scan.nextLine());
	
			switch(month) {
			    case 3: case 4: case 5: 
			    	System.out.println("현재는 봄"); break;
			    case 6: case 7: case 8:
			    	System.out.println("현재는 여름"); break;
			    case 9: case 10: case 11:
			    	System.out.println("현재는 가을"); break;
			    default: System.out.println("현재는 겨울");
		}
	}
}


if(month==3 || month==4 || month==5) "봄입니다."
		 */
		Scanner scan = new Scanner(System.in);
		 
		int month  = 0;
		System.out.print("현재 월을 입력 >> ");
		
		month=Integer.parseInt(scan.nextLine());
		if(month ==3 || month ==4 || month ==5) {
			System.out.println("현재는 봄");
		}else if(month ==6 || month ==7 || month ==8) {
			System.out.println("현재는 여름");
		}else if(month == 9 || month == 10 || month == 11) {
			System.out.println("현재는 가을");
		}else {
			System.out.println("현재는 겨울");
		}
	}
}
