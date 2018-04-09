
public class TestCircle {

	public static void main(String[] args) {
		
		Circle d = new Circle(5,3.14);
		d.area();
		d.circumference();
		System.out.println("Radius:" +d.getRadius());
		System.out.println("PI :" +d.getPi());
		
	}

}
