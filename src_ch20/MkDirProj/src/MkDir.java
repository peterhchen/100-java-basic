import java.io.*;
public class MkDir {
    public static void main (String args[]) {
        String dirname = "C:/Users/14088/pchen";
        File d = new File (dirname);
        d.mkdirs();
    }
}
