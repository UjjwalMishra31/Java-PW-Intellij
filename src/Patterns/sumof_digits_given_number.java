package Patterns;

import java.util.Scanner;

public class sumof_digits_given_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int numsum = 0;
        int count = 0;
        int sum = 0;
        while(num!=0)
        {
            numsum = num % 10;
            sum = sum + numsum;
            count++;
            num = num / 10;
        }
        System.out.println("The sum of digits of given number is "+sum);
        System.out.println("Total number of digits in the number are "+count);
    }
}
