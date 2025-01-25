package Loops_Practice;

import java.util.Scanner;

public class print_reverse_ofa_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num!= 0)
        {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }
}
