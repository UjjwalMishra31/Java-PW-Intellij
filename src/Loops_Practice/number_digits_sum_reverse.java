package Loops_Practice;

import java.util.Scanner;

public class number_digits_sum_reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0,reverse = 0;
        while(num!=0)
        {
            int digit = num%10;
            sum = sum + digit;
            num = num / 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The sum of the digits is "+sum);
        System.out.println("Reverse number is : "+reverse);
        System.out.println(num1 + reverse);
    }
}
