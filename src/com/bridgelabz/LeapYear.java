package com.bridgelabz;
import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args){
            System.out.println("Enter a year to check whether it is leap year or not: ");
            Scanner s = new Scanner(System.in);
            int year = s.nextInt();
            if(Integer.toString(year).length()==4) {
                if (((year % 4 == 0 && (year % 100 != 0)) || (year % 400 == 0))) {
                    System.out.println("Given Year is a Leap Year");
                } else {
                    System.out.println("Given Year is not a Leap Year");
                }
            }
            else{
                System.err.println("Enter a valid leap year");
            }
        }
}
