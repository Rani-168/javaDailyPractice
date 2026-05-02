public class PatternNum { 
    
    public void printPattern(int x) {
        
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        PatternNum obj = new PatternNum();
        int x = 5;
        obj.printPattern(x);   // no need to print return
    }
}
