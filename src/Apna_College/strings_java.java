package Apna_College;

public class strings_java
{
    public static void main(String[] args)
    {
        String name = "Aman";
        System.out.println(name.length()); // prints length of string
        System.out.println(name.charAt(2));// prints character at that particular location
        //substring starts counting from the 0th char
        System.out.println(name.substring(0,2));// prints character from A to a i.e. Ama { n,n-1 }
        String name1 = "Ujjwal Mishra";
        System.out.println(name1.substring(3,9));
    }
}
