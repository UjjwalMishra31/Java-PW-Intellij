package Loops_Practice;

import java.util.Scanner;

public class factorial_numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial is : "+fact);
    }
}
