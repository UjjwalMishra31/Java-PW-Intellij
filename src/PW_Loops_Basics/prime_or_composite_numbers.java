package PW_Loops_Basics;

import java.util.Scanner;

public class prime_or_composite_numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean num = false;
        for (int i = 2; i<n ; i++ )
        {
            if (n%i==0)
            {
                num = true;
                break;
                // System.out.println(i);
            }
        }
        if (n == 1)
        {
            System.out.println("Nor composite nor prime");
        }
        else if (num == true)
        {
            System.out.println("Composite Number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}
