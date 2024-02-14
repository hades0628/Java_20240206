package ex04;
/*
 * 이코드 문제점
 * 1. 이 박스에는 사과 오렌지만 담소싶은데 다른것이 담겨도 제거 불가
 * 2. get할때 형변환 해야한다. 다운캐스팅을 해야한다.
 */


class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an Orange";
	}
}

class Box {
	private Object obj;
	
	void setObj(Object obj) {
		
		this.obj = obj;
	}
	
	Object getObj(){
		return obj;
	}
}



public class FruitBoxEx01 {

	public static void main(String[] args) {
		Box abox = new Box();
		Box bbox = new Box();
		
		abox.setObj(new Apple());
		bbox.setObj(new Orange());
		
		Apple ap = (Apple)abox.getObj();
		Orange op = (Orange)bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
	}

}