package exception01;

public class _02_NullpointException {

	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException npe) {
			System.out.println("데이터가 들어있지 않습니다");
			System.out.println("메시지 : "  + npe);
		}

	}

}
