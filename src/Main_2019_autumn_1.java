import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @date 2021-9-9 - 14:12
 * Created by Salmon
 */
public class Main_2019_autumn_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        String str = s[0];
        int n = Integer.parseInt(s[1]);
        bufferedReader.close();
        String firstStr = str.substring(0, str.length() - n);
        String lastStr = str.substring(str.length() - n);
        String res = lastStr + firstStr;
        float n1 = Float.parseFloat(str);
        float n2 = Float.parseFloat(res);
        System.out.println(BigDecimal.valueOf(n2 / n1).setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
