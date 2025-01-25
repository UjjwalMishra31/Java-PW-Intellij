package Patterns;

import java.util.Scanner;

public class productof_digits_ofgiven_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int numsum = 0;
        int count = 0;
        int product = 1;
        while(num!=0)
        {//12023
            numsum = num % 10;

            product = product * numsum;
            count++;
            num = num / 10;
        }
        System.out.println("The product of digits of given number is "+product );
        System.out.println("Total number of digits in the number are "+count);
    }
}
