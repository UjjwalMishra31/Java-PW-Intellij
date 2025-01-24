package PW_Loops_Basics;

import java.util.Scanner;

public class Table_of_any_numbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
