import java.io.*;
public class Exception {
    public static void main (String args[]) {
        try {
            int a[] = new int [2];
            System.out.println ("Access Element three: " + a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Exception thrown: " + e);
        }
        System.out.println ("Out og the block");
    }
}
