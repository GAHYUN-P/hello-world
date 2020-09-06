package Practice;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		
		Grandeur myCar1 = new Grandeur(); // 클래스로부터 'new'를 이용해서 객체를 생성(인스턴스화)한다. 메모리에 객체생성되는 시점
										  // 해당클래스의 생성자가 가장먼저 호출된다
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 30000000;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		System.out.println();
		
		Grandeur myCar2 = new Grandeur(); // 두번째 객체 생성
		myCar2.color = "blue";
		myCar2.gear = "manual";
		myCar2.price = 25000000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		*/
		
		Bicycle myBicycle = new Bicycle("red", 100); //생성과 동시에 객체의 속성을 정할 수 있다
		
		myBicycle.info();
		
		/*
		myBicycle.color = "red";
		myBicycle.price = 3000000;
		*/
		
		myBicycle.color = "yellow";
		
		myBicycle.info();
		
	}
}
