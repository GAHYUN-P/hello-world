package Practice01;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass(); //ChildClass 객체 생성
		
		/*
		child1.name = "hong gil dong";
		child1.gender = "M";
		child1.age = 20; // 변수 지정안하면 null or 0
		*/
		
		child1.setInfo("hong gil dong", "M", 20);
		
		child1.getInfo(); // 메소드 호출
		
		//child1.mySecrete(); // 호출불가
	}

}
