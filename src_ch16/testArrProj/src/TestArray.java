public class TestArray {
    public static void main (String[] args) {
        double [] dList = {1.9, 2.9, 3.4, 3.9};
        for (int i = 0; i < dList.length; i++) {
            System.out.println (dList[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < dList.length; i++) {
            total += dList[i];
        }
        System.out.println ("Total is: " + total);
        double max = dList[0];
        for (int i = 0; i < dList.length; i++) {
            if (dList[i] > max) max = dList[i];
        }
        System.out.println ("Max is " + max);
    }
}
