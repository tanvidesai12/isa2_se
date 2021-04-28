
public class Rectangle implements Shape {
	double length,breadth;
	
	
	@Override
	public double computeArea() {
		double area=length*breadth;
		return area;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	

}
