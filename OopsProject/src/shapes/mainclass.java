package shapes;

public class mainclass {

	public static void main(String[] args) {
		Rectangle rectangle  = new Rectangle(112.5,252.1);
		double area1 = rectangle.area();
		System.out.println("Area of Rectangle :  "+area1);
		Square sq = new Square(13.5);
		double area2= sq.area();
		System.out.println("Area of Square :  "+ area2);
	}

}
