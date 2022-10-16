public class Circle 
{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    public double getRadius()
    {
        return radius;
    }

    public double getCircumference()
    {
        return Math.PI*(2*radius);
    }

    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

    public String toString()
    {
        return "circle radius: " + radius + " ";
    }

    public static void main(String args[])
    {
        Coordinate test = new Coordinate(0.0,5.0);
        Coordinate test2 = new Coordinate(0.0,0.0);
        System.out.println(test);
        System.out.println(test2);
        Circle yes = new Circle(test2.getDistanceFrom(test));
        System.out.println(yes + "area: "+ yes.getArea() + " circumference: "+ yes.getCircumference());
    }
}