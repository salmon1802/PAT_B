import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @date 2021-8-30 - 17:26
 * Created by Salmon
 */
public class Main1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        double n = Double.parseDouble(strings[0]);
        String s = strings[1];
        StringBuilder print = new StringBuilder();
        for (int i = 0; i < n; i++) {
            print.append(s);
        }
        print.append("\n");

        for (int i = 0; i < BigDecimal.valueOf(n / 2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue() - 2; i++){
            print.append(s);
            for (int j = 0; j < n - 2; j++) {
                print.append(" ");
            }
            print.append(s);
            print.append("\n");
        }

        for (int i = 0; i < n; i++) {
            print.append(s);
        }

        System.out.println(print);
    }
}
