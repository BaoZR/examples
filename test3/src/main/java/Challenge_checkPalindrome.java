/**
 * checkPalindrome("mom") ➞ true
 *
 * checkPalindrome("scary") ➞ false
 *
 * checkPalindrome("reviver") ➞ true
 *
 * checkPalindrome("stressed") ➞ false
 */
public class Challenge_checkPalindrome{
    public static boolean checkPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}