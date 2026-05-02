public class PatternStar {

    public void printPattern(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternStar obj = new PatternStar();
        int x = 5;
        obj.printPattern(x);
    }
}
