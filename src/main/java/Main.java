public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String exampleOne = "A man, a plan, a canal: Panama";
        String exampleTwo = "race a car";
        String exampleThree = " ";

        System.out.println("Example One : " + solution.isPalindrome(exampleOne));
        System.out.println("Example Two : " + solution.isPalindrome(exampleTwo));
        System.out.println("Example Three : " + solution.isPalindrome(exampleThree));
    }
}
