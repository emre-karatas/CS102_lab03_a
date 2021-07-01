/**
 *
 * Triangle Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public class Triangle extends Shape
{
    private int a;
    private int b;
    private int c;

    private double x;
    private double y;

    private boolean selection;

    public Triangle(double x, double y, int a, int b, int c, boolean selection)
    {
        super(x,y);
        this.a = a;
        this.b = b;
        this.c = c;
        setLocation(x,y);
        setSelected(selection);

    }

    /**
     * Calculates area
     * @return area
     */
    public double getArea()
    {
        double semiPerimeter = (a+b+c)/2;
        double sqrt = semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c);

        return Math.sqrt(sqrt);
    }

    /**
     * Calculates perimeter
     * @return perimeter
     */
    public double getPerimeter()
    {
        return a+b+c;
    }

    /**
     * Tostring method
     * @return toString
     */
    public String toString()
    {
        return super.toString() + " Side A: " + a + ", Side B: " + b + ", Side C: " + c;
     }



    @Override
    public boolean getSelected() {
        return selection;
    }

    @Override
    public boolean contains(double x, double y)
    {
        // comparing x and y locations
        if ( getX() == x && getY() == y)
        {
            return true;

        }
        return false;
    }


    @Override
    public void setSelected(boolean selection) {
        this.selection = selection;
    }
}
