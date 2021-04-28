
public class Triangle implements Shape{
	double base,height;
	
	

	@Override
	public double computeArea() {
		double area=0.5*base*height;
		return area;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

}
