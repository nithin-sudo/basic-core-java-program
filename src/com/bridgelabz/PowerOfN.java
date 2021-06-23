package com.bridgelabz;
import java.util.Scanner;
public class PowerOfN {
    /**
     * taking the input N from user and printing powers of 2 till N is reached.
     * @param args
     */
         public static void main(String[] args){
            System.out.println("Enter N value till which powers of 2 to be printed: ");
            Scanner s = new Scanner(System.in);
            int input = s.nextInt();
            for (int i=0;i<=input;i++)
            {
                double value=Math.pow(2,i);
                System.out.println("2 pow of "+i+" is "+(int) value);
            }

        }
}
