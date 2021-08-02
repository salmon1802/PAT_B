import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @date 2021-8-2 - 22:15
 * Created by Salmon
 */
public class Main1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < n; i++) {
            Matcher matcher = Pattern.compile("(A*)P(A+)T(A*)").matcher(bufferedReader.readLine());
            System.out.println(
                    matcher.matches() != false &&
                    matcher.group(1).length() * matcher.group(2).length() == matcher.group(3).length()
                            ? "YES" : "NO"
            );
        }
    }
}
