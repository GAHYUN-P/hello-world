package Practice;

public class Grandeur {

	
	// TODO Auto-generated method stub
	public String color;
	public String gear;
	public int price; // 멤버 변수(속성)

	
	public Grandeur() { 
		System.out.println("Grandeur constructor");
	} // 생성자 : 클래스이름과 동일한 이름을 가진 메소드, 외부에서 이 클래스를 이용해
	  // 객체를 만들 때 가장 먼저 호출되는 부분, 생성할때 필요한 기능 기술하면 됨

	
	public void run() { //void : 반환값이 없다
		System.out.println("-- run --");
	} // 메소드(기능)
	
	public void stop() {
		System.out.println("-- stop --");
	} // 메소드(기능)
	
	public void info() {
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
