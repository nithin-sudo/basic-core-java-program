package com.bridgelabz;
import java.util.Scanner;
public class PrimeFactor {
    /**
     * taking a number from user and calculating prime factors for that number
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Enter the number to which prime factors be calculated: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println("the prime factors are:");
        for(int i=2;i<=input;i++)
        {
            while(input%i==0)
            {
                input=input/i;
                System.out.println(i);
            }
        }
    }
}
