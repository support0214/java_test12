package langPackage03;

public class Value {
	int value; // 인스턴스 변수
	
	Value(int value){ //생성자
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		//부모타입으로 형변환 			
		//				  자식타입으로 형변환
		return value == ((Value)o).value;
		/*
		if(o instanceof Value) 
			return value == ((Value)o).value;
		else
			return false;
			*/
	}
}
