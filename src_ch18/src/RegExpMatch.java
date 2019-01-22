import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpMatch {
    public static void main (String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "((.*)(\\d+)(.*))";
        Pattern r = Pattern.compile (pattern);
        Matcher m = r.matcher (line);
        if (m.find ()) {
            System.out.println ("Found value group (0): " + m.group (0));
            System.out.println ("Found value group (1): " + m.group (1));
            System.out.println ("Found value group (2): " + m.group (2));
            System.out.println ("Found value group (3): " + m.group (3));
            System.out.println ("Found value group (4): " + m.group (4));
        } else {
            System.out.println ("No Match");
        }
    }
}
