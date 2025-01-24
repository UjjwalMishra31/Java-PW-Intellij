package Apna_College;

import java.util.Arrays;

public class arrays_java
{
    public static void main(String[] args)
    {
        int[] marks = new int[5];
        marks[0]=10;
        marks[1]= 2;
        marks[2]=11;
        marks[3]= 21;
        marks[4]= 16;
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        // length of arrays
        System.out.println(marks.length);
        // sorting of arrays
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
    }
}
