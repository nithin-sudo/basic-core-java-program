package com.bridgelabz;
import java.util.Scanner;
public class MaximumValue {
    /**
     * taking array values from user and checking the maximum value among three numbers.
     * @param args
     */
    public static void main(String[] args){
        System.out.println("enter how many values you want to store: ");
        Scanner scanner= new Scanner(System.in);
        int numOfValues=scanner.nextInt();
        int[] maxArray= new int[10];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<numOfValues;i++)
        {
            maxArray[i]=scanner.nextInt();
        }
        int maximumValue=maxArray[0];
        for (int i=0;i<maxArray.length;i++)
        {
            if(maxArray[i]>maximumValue)
            {
                maximumValue=maxArray[i];
            }
        }
        System.out.println("maximum value among three numbers is :"+maximumValue);
    }
}
