class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;  // negatives are never palindrome

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;           // take last digit
            reversed = reversed * 10 + digit; // build reversed number
            x /= 10;                      // drop last digit
        }

        return original == reversed;      // compare
    }
}