
public class E_01_02 {
	public static void main(String[] args) {
		/*
		 * 2번문제) for반복문,if조건문, %나머지 연산을 이용해서 1부터 10까지의 정수 중에서 홀수, 짝수의 총합을 각각 구하는 java 코드를 작성
			public class Ex12_02 {
				public static void main(String[] args) {
			        int i;

        //코드작성


   }
}
		 */
		
		int evenResult = 0;
		int oddResult = 0;
		
		for(int i = 0; i< 11; i++) {
			if(i%2 ==0) {
				evenResult += i;
				
			}else {
				oddResult += i;
				
			}
		}

		System.out.println("짝수의 합 : " + evenResult );
		System.out.println("홀수의 합 : " + oddResult);
	}

}
