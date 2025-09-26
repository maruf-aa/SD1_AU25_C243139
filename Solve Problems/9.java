//9. Sum of all numbers from 1 to N

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

}


