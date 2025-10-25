//Check if a string is palindrome

import java.util.*;
public class Firstclass {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();

        if (name.equalsIgnoreCase(sb.toString())) 
        {
            System.out.println("This is a Palindrome");
        } 
        else 
        {
            System.out.println("This is not a Palindrome");
            
        }
        
    }
}
