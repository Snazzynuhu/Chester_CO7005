package Palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word, let's check if it's a palindrome");
        String word = scanner.nextLine();
        scanner.close();
        
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // System.out.println(cleanedWordArr instanceof char[]);
        System.out.println("CLEANED "+ cleanedWord);

        String reversedWord = "";
        for (int i = cleanedWord.length() - 1; i >= 0; i--) {
            reversedWord += cleanedWord.charAt(i);
        }
        System.out.println("Reversed String : " + reversedWord);
        return cleanedWord.equals(reversedWord);
    }
}

