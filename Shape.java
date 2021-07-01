/**
 *
 * Abstract Shape Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public abstract class Shape implements  Locatable,Selectable
{
    double x;
    double y;

    public Shape(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

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

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * Tostring method
     * @return toString
     */
    public String toString()
    {
        return  "Type: " + getClass().getName() +  ", x: " + getX() + ", y: " + getY() + ", perimeter: " + getPerimeter() + ", area: " + getArea() + ", selected?: " + getSelected() +", ";
    }


}
