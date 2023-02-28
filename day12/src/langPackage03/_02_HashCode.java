package langPackage03;

public class _02_HashCode {

	public static void main(String[] args) {
		String str1 = new String("abc"); 
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); // 값 true
		System.out.println(str1 == str2); // 주소 false
		System.out.println(str1.hashCode()); // hashCode True
		System.out.println(str2.hashCode()); 
		System.out.println(System.identityHashCode(str1)); //identityHashCode false 
		System.out.println(System.identityHashCode(str2)); //똑같이 하기 위해선 오버라이딩
		System.out.println(str1);
		

	}

}
