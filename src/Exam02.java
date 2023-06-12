class OverloadT{
	public void over() {
		System.out.println("아무것도 없음");
	}
	public void over(int i) {
		System.out.println("정수 하나");
	}
	public void over(int i, String str) {
		System.out.println("정수하나, 문자열하나");
	}
	public void over(String str, int i) {
		System.out.println("문자열하나, 정수하나");
	}
	public void over(int ...arr) {//가변인자 문법
		//arr = {1, 2, 3, 4}; <- arr.length를 통해 크기를 알수있음 4
		
		int result=0;
				for(int i = 0;i<arr.length ; i++) {
					result = result + arr[i];
				}
				
				/*
				for(int j : arr) {//for each
					result += j;
				}*/
				
		System.out.println("모두 더한값: " + result);
	}
}
public class Exam02 {
public static void main(String[] args) {
	OverloadT test = new OverloadT();
	
	test.over(1, "11");
	test.over("11", 1);
	
	test.over(10, 10, 10, 10, 10, 10, 10, 10, 10, 10); 
	
}
}
