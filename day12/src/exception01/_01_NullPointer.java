package exception01;

public class _01_NullPointer {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			// 예외가 발생할만한 상황
			int result = 5/3;
			System.out.println(result);
			System.out.println(3);
			System.out.println(4);
		} catch(ArithmeticException e){
			// 예외가 발생했을때 처리
			System.out.println("0으로 나눌수 없습니다");
			System.out.println(5);
		}
		System.out.println(6);
	}

}
