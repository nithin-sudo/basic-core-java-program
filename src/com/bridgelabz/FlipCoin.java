package com.bridgelabz;
import java.util.Scanner;
public class FlipCoin{
    /**
     * Calculating head and tail percentage by using percentage formula.
     * @param args
     */
        public static void main(String[] args){
            double heads=0,tails=0,flips=0;
            System.out.println("Enter how many time you want to flip the coin: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input<=0){
                System.err.println("Enter a number which is greater than 0");
            }
            else {
                for (int i = 0; i < input; i++) {
                    if (Math.random() < 0.5) {
                        tails++;
                    } else {
                        heads++;
                    }
                    flips++;
                }
                double tailPercentage=(tails*100)/flips;
                double headPercentage=100-tailPercentage;
                System.out.println("no.of heads are" +heads+ "and tails are" +tails+ " and flips are"+flips);
                System.out.println("head percentage is:"+headPercentage+ "\ntail percentage is:"+tailPercentage);
            }
        }
}
