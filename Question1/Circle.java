import java.math.*;
public class Circle extends GeometricObject {

    private double radius;
    static final double PI = Math.PI;

    public Circle()
    {
        super();
    }

    public Circle(double radius)
    {
        super();
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return (PI*radius*radius);
    }

    public double getPerimeter()
    {
        return (2*PI*radius);
    }

    public double getDiameter()
    {
        return (2*radius);
    }

    public void printCircle()
    {
        System.out.println("The color is "+getColor()+ "\nThe radius is "+getRadius()+ "\nThe area is "+getArea()+ "\nThe diameter is "+getDiameter()+ "\nThe perimeter is "+getPerimeter());
    }

}
