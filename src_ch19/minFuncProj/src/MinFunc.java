public class MinFunc {
    public static void main (String[] args) {
        int a = 11;
        int b = 6;
        int c = minFunciton (a, b);
        System.out.println ("Minimum Value: " + c);
    }
    public static int minFunciton (int a, int b) {
        int min;
        if (a > b) min = b;
        else min = a;
        return min;
    }
}
