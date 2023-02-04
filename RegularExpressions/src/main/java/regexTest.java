import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest {
    public static void main(String[] args)
    {
        String re = "^lastname=\\W\\w*.";
        String tex = "lastname=abdfgdfgc,";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(tex);
        boolean result = matcher.matches();
        System.out.println("result = "+result);
    }
}
