package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumber {
    /**
     * taking the input from the user and printing Nth Harmonic value.
     * @param args
     */
    public static void main(String[] args){
        int initialValue=1;
        double harmonicNumber=0;
        double value;
        System.out.println("Enter the number until which harmonic number should generate: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (double i=1;i<input;i++)
        {
            value=(double) (initialValue/i);
            harmonicNumber+=value;
        }
        System.out.println("the Nth harmonic number is:"+ harmonicNumber);
    }
}
