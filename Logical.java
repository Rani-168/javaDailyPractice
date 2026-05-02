public class Logical {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int newX = 0;

        while (x != 0) {
            int digit = x % 10;
            newX = newX * 10 + digit;
            x = x / 10;
        }

        return original == newX;
    }

    public static void main(String[] args) {
        Logical obj = new Logical();
        int x = 121;
        System.out.println(obj.isPalindrome(x));
    }
}