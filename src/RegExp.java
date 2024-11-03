import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        String ipRegex =
                "\\b(?<!-)((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
              "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}