package Practice;

public class Bicycle {
	
	public String color;
	public int price;
	
	
	public Bicycle() {
		System.out.println("Bicycle constructor");
	} // 디폴트 생성
	
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor 2");
		color = c;
		price = p;
	} // 생성할때 값을 넘겨받음
	
	public void info() {
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
