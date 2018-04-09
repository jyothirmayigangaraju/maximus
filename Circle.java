
public class Circle {
	
	int radius;
	double a;
	double c;
	double pi;
	
	public Circle(int radius, double pi) {
		
		this.radius = radius;
		this.pi = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public void area()
	{
		a=pi*radius*radius;
		System.out.println(a);
	}
	
    public void circumference()
    {
    	c=2*pi*radius;
    	System.out.println(c);
    }
}
