package Practice01;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("-- ChildClass constructor--");
	}
	
	public void setInfo(String n, String g, int a) { //호출부에서 값을 주면 값을 넣는다. 매게변수 자료형 주의
		System.out.println("-- setinfo() START--");
		
		name = n;
		gender = g;
		age = a;
	}
	//메소드도 변수와 같이 선언 및 정의 후 필요시에 호출해서 사용한다.
	public void getInfo() { //메소드 선언, 접근자 변환형 메소드이름(매개변수)
		System.out.println("--getInfo() START --");
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age); // 메소드 정의
	}
	
	private void mySecrete() { // private 메소드기때문에 다른클래스에서 접근불가, 같은 객체클래스 내부에서는 자유롭게 사용가능
		System.out.println("--mySecret()--");
	}
}
