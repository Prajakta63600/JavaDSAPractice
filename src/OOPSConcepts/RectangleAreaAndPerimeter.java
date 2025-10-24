package OOPSConcepts;

class Rectangle {
	private int height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return height * width;
	}

	public int getPerimeter() {
		return 2 * (height + width);
	}
}

public class RectangleAreaAndPerimeter {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		System.out.println("Area of Rectangle is:" + r.getArea());
		System.out.println("Perimeter of Rectangle is:" + r.getPerimeter());

		r.setHeight(40);
		r.setWidth(30);
		System.out.println("Area of Rectangle is:" + r.getArea());
		System.out.println("Perimeter of Rectangle is:" + r.getPerimeter());

	}

}
