import java.util.Scanner;

/**
 *
 * ShapeTester Class
 * @author Emre Karatas-22001641
 * @version v1.0 30.06.2021
 */
public class ShapeTester
{
    public static void displayer()
{
    System.out.println("Please indicate your selection: ");
    System.out.println("1)Create empty set of shapes.");
    System.out.println("2)Add Shapes");
    System.out.println("3)Print total area and total perimeter.");
    System.out.println("4)Print all information about shapes.");
    System.out.println("5)Find first Shape that contains given x,y.");
    System.out.println("6) Remove selected shapes.");
    System.out.println("7)Quit.");
    System.out.print("Enter your selection here:");
}
    public static void main(String[] args)
    {
        ShapeContainer shapes = new ShapeContainer();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to tester class!");
        int selection;
        displayer();
        do {
            selection = scan.nextInt();

            if ( selection == 1)
            {
                shapes = new ShapeContainer();
                System.out.println("New shape collection is created!");
            }
            else if ( selection == 2)
            {
                int shapeSelection;
                do {
                    System.out.println("Please select the shape you want to add: 1)Rectangle 2)Square 3)Circle 4)Triangle 0) Quit");
                    shapeSelection = scan.nextInt();
                    if ( shapeSelection == 1)
                    {
                        int width;
                        int height;
                        double x;
                        double y;
                        String answer;
                        boolean selectable = false;
                        System.out.print("Enter width: ");
                        width = scan.nextInt();
                        System.out.print("Enter height: ");
                        height= scan.nextInt();
                        System.out.print("Enter x location: ");
                        x = scan.nextDouble();
                        System.out.print("Enter y location: ");
                        y = scan.nextDouble();
                        System.out.print("selectable or not? Enter 'true' if selectable: ");
                        answer = scan.next();
                        if (answer.equals("true"))
                        {
                            selectable = true;
                        }

                        if ( width < 0 || height < 0 )
                        {
                            System.out.println("Width or height cannot be negative!");

                        }
                        else
                        {
                            Rectangle rect = new Rectangle(x,y,width,height,selectable);
                            shapes.add(rect);
                        }
                    }
                    else if ( shapeSelection == 2)
                    {
                        double x;
                        double y;
                        int side;
                        boolean selectable = false;
                        String answer;
                        System.out.print("enter side length: ");
                        side = scan.nextInt();
                        System.out.print("Enter x location: ");
                        x = scan.nextDouble();
                        System.out.print("Enter y location: ");
                        y = scan.nextDouble();
                        System.out.println("selectable or not? Enter 'true' if selectable.");
                        answer = scan.next();
                        if (answer.equals("true"))
                        {
                            selectable = true;
                        }
                        if ( side < 0)
                        {
                            System.out.println("Side of a square cannot be negative!");

                        }
                        else
                        {
                            Square square = new Square(x,y,side,selectable);
                            shapes.add(square);
                        }
                    }
                    else if ( shapeSelection == 3)
                    {
                        int radius;
                        double x;
                        double y;
                        boolean selectable = false;
                        String answer;
                        System.out.print("Enter the radius: ");
                        radius = scan.nextInt();
                        System.out.print("Enter x location: ");
                        x = scan.nextDouble();
                        System.out.print("Enter y location: ");
                        y = scan.nextDouble();
                        System.out.print("selectable or not? Enter 'true' if selectable.");
                        answer = scan.next();
                        if (answer.equals("true"))
                        {
                            selectable = true;
                        }
                        if ( radius < 0 )
                        {
                            System.out.println("Radius cannot be negative!");
                        }
                        else
                        {
                            Circle crc = new Circle(x,y,radius,selectable);
                            shapes.add(crc);
                        }
                    }
                    else if ( shapeSelection == 4)
                    {
                        int a;
                        int b;
                        int c;
                        double x;
                        double y;
                        boolean selectable = false;
                        String answer;
                        System.out.print("Please enter the side A: ");
                        a = scan.nextInt();
                        System.out.print("Please enter the side B: ");
                        b = scan.nextInt();
                        System.out.print("Please enter the side C: ");
                        c = scan.nextInt();
                        System.out.print("Enter x location: ");
                        x = scan.nextDouble();
                        System.out.print("Enter y location: ");
                        y = scan.nextDouble();
                        System.out.print("selectable or not? Enter 'true' if selectable.");
                        answer = scan.next();
                        if (answer.equals("true"))
                        {
                            selectable = true;
                        }

                        if ( a < 0 || b <0 || c < 0)
                        {
                            System.out.println("The sides cannot be negative!");
                        }
                        // triangle equation formula
                        else if ( a >= b+c || b >= a+c || c >= a+b || Math.abs(a-b) >= c || Math.abs(c-b) >= a || Math.abs(a-c) >= b )
                        {
                            System.out.println("That triangle cannot be formed!");
                        }
                        else
                        {
                            Triangle triangle = new Triangle(x,y,a,b,c,selectable);
                            shapes.add(triangle);
                        }
                    }

                } while (shapeSelection != 0);

            }
            else if ( selection == 3)
            {
                System.out.println("Total perimeter of the shapes: " + shapes.getPerimeter());
                System.out.println("Total area of the shapes: " + shapes.getArea());
            }
            else if ( selection == 4)
            {
                if ( shapes.toString().equals(""))
                {
                    System.out.println("No shapes found!");
                }
                System.out.println(shapes);
            }
            else if ( selection == 5)
            {
                double x;
                double y;
                System.out.print("Enter x coordinate: ");
                x = scan.nextDouble();
                System.out.print("Enter y coordinate: ");
                y = scan.nextDouble();
                if ( shapes.givenShapeContains(x, y) == null)
                {
                    System.out.println("No shape founded near the coordinates x: " + x + ", y: " + y );
                }
                else
                {
                    System.out.println(shapes.givenShapeContains(x,y));
                    System.out.println("Selected or not? : " + shapes.givenShapeContains(x,y).getSelected());
                }

            }
            else if ( selection == 6)
            {
                System.out.println("All shapes which are selected as true are removed. New Shapes are:");
                shapes.removeSelectedShapes();
            }


        } while (selection != 7 );
        System.out.println("See you again!");


    }
}
