package com.bridgelabz;
import java.util.Scanner;
public class QuotientAndRemainder {
    /**
     * taking the number and divisor from user and calculating quotient and remainder
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("enter divisor:");
        int divisor=scanner.nextInt();
        int quotient=input/divisor;
        int remainder=input%divisor;
        System.out.println("the quotient is "+quotient+" and remainder is "+remainder);
    }
}
