import java.io.*;
public class ListDir {
    public static void main (String args[]) {
        File file = null;
        String [] paths;
        try {
            file = new File ("C:/Users/14088");
            paths = file.list ();
            for (String path:paths) {
                System.out.println (path);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
