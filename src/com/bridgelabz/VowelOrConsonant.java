package com.bridgelabz;
import java.util.Scanner;
public class VowelOrConsonant {
    /**
     * taking alphabet from user and checking whether it is vowel or consonant.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char alphabet = scanner.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println("Entered alphabet " + alphabet + " is  Vowel");
        }
        else if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
            System.out.println("Entered alphabet " + alphabet + " is Consonant");
        }
        else
            System.err.println("enter a alphabet");
    }
}
