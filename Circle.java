package lab4;,


public class Circle {
	Point center;
	int radius;

    
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double getCircumference(int radius) {
		return 2 * Math.PI * radius;
	}
	

	public double getArea (int radius){
		return Math.PI * radius * radius;
	}

}
