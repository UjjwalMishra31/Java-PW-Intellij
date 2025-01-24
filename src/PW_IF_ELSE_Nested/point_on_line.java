package PW_IF_ELSE_Nested;
import java.util.*;
public class point_on_line
{
    public static void main(String[] args)
    {// to tell whether all three points forms a straight line
        Scanner sc = new Scanner(System.in);
        int x1,y1,z1,x2,y2,z2,x3,y3,z3;
        int m1,m2;
        System.out.println("Enter value of x1");
        x1 = sc.nextInt();
        System.out.println("Enter value of x2");
        x2 = sc.nextInt();
        System.out.println("Enter value of x3");
        x3 = sc.nextInt();
        System.out.println("Enter value of y1");
        y1 = sc.nextInt();
        System.out.println("Enter value of y2");
        y2 = sc.nextInt();
        System.out.println("Enter value of y3");
        y3 = sc.nextInt();
        m1 = (y3-y2)/(x3-x2);
        m2 = (y2-y1)/ (x2-x1);
        if (m1 == m2)
            System.out.println("The points are on a straight line");
        else
            System.out.println("The points are not a straight line");
    }

}
