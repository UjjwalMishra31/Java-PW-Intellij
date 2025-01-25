package Loops_Practice;

import java.util.Scanner;

public class productofnumbers_exceptzero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                product = product * digit;
                count++;
            }
            num = num / 10;
        }

        if (count > 0) {
            System.out.println("The product of digits of the given number is " + product);
        } else {
            System.out.println("No non-zero digits found.");
        }
        System.out.println("Total number of non-zero digits in the number are " + count);
    }
}
