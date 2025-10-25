//Count vowels and consonants in a string

import java.util.*;
public class Firstclass {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int v = 0, c = 0;
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < sb.length(); i++) 
        {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u')
            {
                v++;
            } 
            else 
            {
                c++;
            }
            
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        
    }
}
