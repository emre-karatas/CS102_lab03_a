/**
 *
 * Square Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public class Square extends Rectangle
{
    private int side;
    private boolean selection;

    public Square(double x, double y, int side, boolean selection)
    {
        super(x,y,side,side,selection);
        this.side = side;

    }

    @Override
    /**
     * Tostring method
     * @return toString
     */
    public String toString()
    {
        return "Type: " + getClass().getName() + ", x: " + getX() + ", y: " + getY() + ", perimeter : " + getPerimeter() + ", area: " + getArea() + ", selected?: " + getSelected() + ", side length : " + side;
    }

    @Override
    /**
     * Calculates area
     * @return area
     */
    public double getArea()
    {
        return super.getArea();
    }

    /**
     * Calculates perimeter
     * @return perimeter
     */
    @Override
    public double getPerimeter()
    {
        return super.getPerimeter();
    }
}
