// Name : MOXSHANG SHAH
// ID : 21CE129

// Aim :
// Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

import java.util.*;
public class Practical_6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // entering the values related to array

        System.out.println("Enter size : ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter array : ");
        for (int i = 0; i < str.length; i++) 
        {
            str[i] = sc.next();
        }
        // enter the char which we want to remove from the array

        System.out.println("Enter the chars. wanted to remove : ");
        String ch = sc.next();

        // passing the array and the wanted char. into the method.

        new_removed(str, ch);
        sc.close();
    }
    static void new_removed(String str[], String ch) 
    {
        int count = 0;

        // logic for the removing the char.

        for (int i = 0; i < str.length; i++) 
        {
            if (str[i].equals(ch)) 
            {
                count++;
            }
        }
        String[] d = new String[str.length - count];
        int x = 0;
        for (int i = 0; i < str.length; i++) 
        {
            if (!str[i].equals(ch))
            {
                d[x] = str[i];
                x++;
            }
        }

        // printing the final array

        System.out.println("New Array with removed char :");
        for (int i=0;i<x;i++) 
        {
            System.out.print(d[i]+" ");
        }
    }
}