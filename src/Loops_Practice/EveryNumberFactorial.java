package Loops_Practice;

import java.util.Scanner;

public class EveryNumberFactorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1;i<=num;i++)
        {
            fact = fact * i;
            System.out.println("For the number "+i+" Factorial is :"+fact);
        }
        System.out.println("Final Factorial is : "+fact);
    }
}
