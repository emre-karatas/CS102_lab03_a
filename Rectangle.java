/**
 *
 * Rectangle Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public class Rectangle extends Shape
{
    private final  int SIDES = 4;
    private int width;
    private int height;
    private double x;
    private double y;
    private boolean selection;

    public Rectangle(double x, double y, int width, int height, boolean selection)
    {
        this.width = width;
        this.height = height;
        setLocation(x,y);
        setSelected(selection);
    }


    /**
     * Calculates area
     * @return area
     */
    public double getArea()
    {
        return width*height;
    }

    /**
     * Calculates perimeter
     * @return perimeter
     */
    public double getPerimeter()
    {
        return (getSIDES()/2)* (width+height);
    }

    public int getSIDES()
    {
        return SIDES;
    }

    /**
     * Tostring method
     * @return toString
     */
    public String toString()
    {
        return super.toString() + " width: " + width + ", height: " + height;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setLocation(double x, double y)
    {
        this.x = x;
        this.y = y;

    }

    @Override
    public boolean getSelected()
    {
       return selection;

    }

    @Override
    public boolean contains(double x, double y)
    {
        double xMin = getX()-(width/2);
        double xMax = getX() + (width/2);
        double yMin =  getY()-(height/2);
        double yMax = getY()+(height/2);
        // the x and y values should be in boundaries.
        if ( x > xMin && x < xMax && y > yMin && yMax > y )
        {
            return true;
        }
        return false;

    }

    @Override
    public void setSelected(boolean selection)
    {
       this.selection = selection;
    }
}
