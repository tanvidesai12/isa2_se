
public class Circle implements Shape{
double radius;


	@Override
	public double computeArea() {
		double area=Math.PI*radius*radius;
		return area;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
