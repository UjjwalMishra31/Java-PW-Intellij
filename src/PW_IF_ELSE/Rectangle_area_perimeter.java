package PW_IF_ELSE;
import java.util.*;

public class Rectangle_area_perimeter
{
    public static void main(String[] args)
    {       // Tell whether perimeter is greater than area
        Scanner sc = new Scanner(System.in);
        int leng, bread, area , perimeter;
        System.out.println("Enter the length of rectangle");
        leng = sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        bread = sc.nextInt();
        area = leng * bread;
        perimeter = 2 * (leng + bread);
        if(area > perimeter)
        {
            System.out.println("Area is greater than Perimeter");
            System.out.println("Area is "+ area);
            System.out.println("Perimeter is "+perimeter);
        } else if (area == perimeter)
        {
            System.out.println("Area is same as perimeter");
            System.out.println("Area is "+area);
            System.out.println("Perimeter is "+perimeter);
        } else
        {
            System.out.println("Perimeter is greater than Area");
            System.out.println("Perimeter is "+perimeter);
            System.out.println("Area is "+area);
        }

    }
}
