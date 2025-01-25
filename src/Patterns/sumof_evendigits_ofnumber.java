package Patterns;

import java.util.Scanner;

public class sumof_evendigits_ofnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0)
        {
            int digit = num % 10;
            if (digit !=0 )
            {
                if (digit%2==0)
                {
                    sum = sum + digit;
                }
            }
            num = num/10;
        }
        System.out.println("Sum is "+sum);
    }
}
