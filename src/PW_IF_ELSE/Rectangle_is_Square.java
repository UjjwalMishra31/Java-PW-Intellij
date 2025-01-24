package PW_IF_ELSE;
import java.util.*;
public class Rectangle_is_Square {
    public static void main(String[] args)
    {   //Tell whether the given rectangle is square , with the given data
        Scanner sc = new Scanner(System.in);
        int leng,bread,area;
        System.out.println("Enter the length");
        leng = sc.nextInt();
        System.out.println("Enter the breadth");
        bread = sc.nextInt();
        area = leng * bread;
        if (leng == bread)
        {
            System.out.println("The area of rectangle is "+area);
            System.out.println("The given length "+leng+" and breadth "+bread+" forms a Square");
        }
        else
        {
            System.out.println("The area of rectangle is "+area);
            System.out.println("It is not a Square");
        }
    }
}
