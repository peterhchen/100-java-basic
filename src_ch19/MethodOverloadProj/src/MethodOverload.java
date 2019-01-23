public class MethodOverload {
    public static void main (String[] args) {
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int iRes = minFunction(a, b);
        double dRes = minFunction(c, d);
        System.out.println ("Integer Min Value: " + iRes);
        System.out.println ("Double Min Value: " + dRes);
    }
    public static int minFunction (int n1, int n2) {
        int min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }
    public static double minFunction (double n1, double n2) {
        double min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }
}
