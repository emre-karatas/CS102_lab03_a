import java.util.ArrayList;

/**
 *
 * ShapeContainer Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public class ShapeContainer
{
    ArrayList<Shape> shapes = new ArrayList<>();


    
    public double getArea()
    {
        double result =0;
        for ( int i = 0; i < shapes.size(); i++)
        {
            result += shapes.get(i).getArea();
        }
        return result;
    }

    public double getPerimeter()
    {
        double total=0;
        for (int i = 0; i < shapes.size(); i++)
        {
            total += shapes.get(i).getPerimeter();
        }
        return total;
    }

    public void add( Shape s)
    {
        shapes.add(s);
    }
    public String toString()
    {
        String output = "";
        for ( int i = 0; i <shapes.size(); i++)
        {
            output += shapes.get(i).toString() + "\n" ;
        }
        return output;
    }

    public Shape givenShapeContains(double x, double y)
    {
        Shape returned = null;
        for ( int i = 0; i < shapes.size(); i++)
        {
            if ( shapes.get(i).contains(x,y) == true )
            {
                returned = shapes.get(i);
                break;
            }
        }
        return returned;
    }

    public void removeSelectedShapes()
    {

        ArrayList<Shape> newList = new ArrayList<>();
        for ( int i = 0; i < shapes.size();i++ )
        {
            if ( shapes.get(i).getSelected() != true)
            {
                newList.add(shapes.get(i));
            }
        }
        if ( newList.size() == 0)
        {
            System.out.println("No shapes found!");
        }
        else
        {
            for ( int i = 0; i < newList.size(); i++ )
            {
                System.out.println(newList.get(i));
            }

        }

    }

}
