public class Main {
    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length()-1; i>=0;i--){
            reverse += str.charAt(i);
        }
        if (reverse.equals(str))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba") ? "Yes":"No");
    }
}