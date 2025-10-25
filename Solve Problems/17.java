//Convert a string to uppercase and lowercase

import java.util.*;
public class Firstclass {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        name = name.toLowerCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);
        
    }
}
