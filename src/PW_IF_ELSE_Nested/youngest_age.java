package PW_IF_ELSE_Nested;

import java.util.Scanner;

public class youngest_age
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r,s,a;
        System.out.println("Enter Ram's age");
        r = sc.nextInt();
        System.out.println("Enter Ajay's age");
        a = sc.nextInt();
        System.out.println("Enter Shyam's age");
        s = sc.nextInt();
        if (r < s)
        {
            if (r<a)
            {
                System.out.println("Ram is youngest");
            }
            else
            {
                System.out.println("Ajay is youngest");
            }
        }
        else
        {
            if (s < a)
            {
                System.out.println("Shyam is youngest");
            }
            else
            {
                System.out.println("Ajay is youngest");
            }
        }
    }
}
