//6. Print numbers from 1 to N, Take N from user input.

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }

}


