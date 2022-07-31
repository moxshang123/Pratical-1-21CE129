// Name : MOXSHANG SHAH
// ID : 21CE129

// Aim : 
// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true

import java.util.*;
public class Practical_3 {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=a%10 , d=b%10;
        // comparing the last digit
        if(c == d)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}
