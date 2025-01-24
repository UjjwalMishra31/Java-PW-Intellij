package PW_IF_ELSE;

import java.util.Scanner;

public class find_big_number
{
    public static void main(String[] args)
    {   // given three input find the biggest out of the 3 input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x1 = sc.nextInt();
        System.out.println("Enter second number");
        int x2 = sc.nextInt();
        System.out.println("Enter third number");
        int x3 = sc.nextInt();
        if (x1>x2 && x1>x3)
        {
            System.out.println("First number is bigger");
        } else if (x2>x1 && x2>x3)
        {
            System.out.println("Second number is bigger");
        }
        else
        {
            System.out.println("Third number is bigger");
        }
    }
}
