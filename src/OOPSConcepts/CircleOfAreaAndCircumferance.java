package OOPSConcepts;

class circle{
	private int radius;
	
	public circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double  getCircumference() {
		return 2*Math.PI*radius;
	}
}
public class CircleOfAreaAndCircumferance {

	public static void main(String[] args) {
		circle c = new circle(5);
		System.out.println("Area of Circle: "+c.getArea());
		System.out.println("Area of circumference: "+c.getCircumference());

	}

}
