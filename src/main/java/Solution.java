public class Solution {
    public boolean isPalindrome(String s) {

        // holds our string with only alphanumeric characters
        String fixedString = "";

        // iterate through string s, add all valid alphanumeric characters to fixed string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedString += c;
            }
        }

        // problem asks us to convert all characters to lowercase
        fixedString = fixedString.toLowerCase();

        // pointers to iterate through string s
        // a = front / moves right , b = back / moves left
        int frontPointer = 0;
        int backPointer = fixedString.length() - 1;

        while (frontPointer <= backPointer) {
            if (fixedString.charAt(frontPointer) != fixedString.charAt(backPointer)) {
                return false;
            }

            //increment
            frontPointer++;

            // decrement
            backPointer--;
        }
        return true;
    }
}
