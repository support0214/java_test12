package langPackage03.stringMethod;

public class _01_StringEx1 {

	public static void main(String[] args) {
		int num = 10;
		String strNum = String.valueOf(num);  // 인트 → 스트링 변환
		System.out.println(strNum);
		
		String strNum2 = "" + num;
		System.out.println(strNum2);
		
		System.out.println(strNum + strNum2); // 두개 다 문자열로 인식
		
	}

}
