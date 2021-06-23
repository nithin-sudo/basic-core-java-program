package com.bridgelabz;
import java.util.Scanner;
public class EvenOrOdd {
    /**
     * taking a number from user printing it is even or odd.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Enter the number to check if it is even or odd: ");
        Scanner scanner = new Scanner(System.in);
        int evenOrOdd = scanner.nextInt();
        if(evenOrOdd%2==0)
            System.out.println(+evenOrOdd+" is even");
        else
            System.out.println(+evenOrOdd+" is odd");
    }
}
