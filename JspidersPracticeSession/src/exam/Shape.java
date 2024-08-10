package exam;
//which access modifier we have to use-
public class Shape {

	protected void display() {
		System.out.println("Display-base");

	}

}public class Circle extends Shape{
	<public>void display(){
		System.out.println("Display-delivered");
	}
	
}
