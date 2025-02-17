//HW 7_1
public class Triangle extends Figure {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());

    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
