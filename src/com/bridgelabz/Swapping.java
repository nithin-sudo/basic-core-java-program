package com.bridgelabz;

import java.util.Scanner;

public class Swapping {
    /**
     * taking two numbers from user and swapping that two numbers.
     * @param args
     */
        public static void main(String[] args){
            int temp;
            System.out.println("Enter the first number to be swapped:");
            Scanner scanner=new Scanner(System.in);
            int numberOne=scanner.nextInt();
            System.out.println("Enter the second number to be swapped:");
            int numberTwo=scanner.nextInt();
            temp=numberOne;
            numberOne=numberTwo;
            numberTwo=temp;
            System.out.println("Numbers after Swapped numberOne: "+numberOne+" and numberTwo: "+numberTwo);
        }
}
