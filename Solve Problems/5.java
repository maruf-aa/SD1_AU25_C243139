/*5. Simple Calculator (Add, Subtract, Multiply, Divide): Use if-else or switch to perform
operations. */

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Addition is " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is " + (a * b));
                break;
            case 4:
                System.out.println("Division is " + (a / b));
                break;            
           default:
                System.out.println("invalid choice");
        }

    }

}

