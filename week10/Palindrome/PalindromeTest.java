package Palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void testIsPalindrome() {
         assertTrue(Palindrome.isPalindrome("radar"));

         assertTrue(Palindrome.isPalindrome("A man, a plan, a canal, Panama"));

         assertFalse(Palindrome.isPalindrome("hello"));
    }
}
