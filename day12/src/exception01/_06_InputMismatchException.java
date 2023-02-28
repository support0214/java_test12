package exception01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_InputMismatchException {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int sum = 0;
		for(int i =1; i <=3; i++) {
			System.out.println(i+ "번째 정수입력 " );
			try {
				int num = scan.nextInt();
				sum += num;
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다");
			//  e.printStackTrace();
			//	System.out.println("예외메시지 : " + e.getMessage());
				scan.next();
				--i;
			}
		}
		System.out.println("합 = " + sum);
	}
}