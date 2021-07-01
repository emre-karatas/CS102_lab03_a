/**
 *
 * Circle Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public  class Circle extends Shape
{
    private int radius;
    private double x;
    private double y;
    private boolean selection;

    public Circle( double x, double y, int radius, boolean selection)
    {
        this.radius = radius;
        setLocation(x,y);
        setSelected(selection);

    }


    /**
     * Calculates area
     * @return area
     */
    public double getArea()
    {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * Calculates perimeter
     * @return perimeter
     */
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    /**
     * Tostring method
     * @return toString
     */
    @Override
    public String toString()
    {
        return super.toString() + " radius : " + radius;
    }


    /**
     * get x coordinate
     * @return x
     */
    @Override
    public double getX() {
        return x;
    }

    /**
     * Get y coordinate
     * @return y
     */
    @Override
    public double getY() {
        return y;
    }

    /**
     * Set location
     * @param x location
     * @param y location
     */
    @Override
    public void setLocation(double x, double y)
    {
        this.x = x;
        this.y = y;

    }

    /**
     * getSelection
     * @return selection
     */
    @Override
    public boolean getSelected()
    {
        return selection;
    }

    @Override
    public boolean contains(double x, double y)
    {
        // if (x-a)^2 + (y-b)^2 > r^2, then the (a,b) is inside
        if (Math.pow(getX()-x,2) + Math.pow(getY()-y,2) < Math.pow(radius,2) )
        {
            return true;
        }
        return  false;
    }

    @Override
    public void setSelected(boolean selection)
    {
        this.selection = selection;
    }
}
