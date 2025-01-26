package Apna_College;

import java.util.Scanner;

public class miniCalculator_usingSwitchCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the task you want to perform \n 1. Addition \n 2. Subtraction \n 3. Division \n 4. Multiplication");
        int task = sc.nextInt();
        switch (task)
        {
            case 1:
                System.out.println("Addition : "+(num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction : "+(num1 - num2));
                break;
            case 3:
                System.out.println("Division : "+(num1 / num2));
                break;
            case 4:
                System.out.println("Multiplication : "+(num1 * num2));
                break;
            default:
                System.out.println("Enter correct Input");
        }
    }
}
