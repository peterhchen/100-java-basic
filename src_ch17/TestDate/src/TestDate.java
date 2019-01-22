import java.util.Date;
public class TestDate {
    public static void main (String[] args) {
        Date date = new Date();
        // two letter format starting with t
        String str = String.format ("Current Date/Time: %tc", date);
        System.out.println (str);
    }
}
