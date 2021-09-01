import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * @date 2021-8-31 - 21:31
 * Created by Salmon
 */
public class Main1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(bufferedReader.readLine());
        HashMap<BigDecimal,Integer> hashMap = new HashMap<>();
        bufferedReader.close();
        for(int i = 1; i <= n; i++){
            BigDecimal a = BigDecimal.valueOf(i / 2).setScale(0, BigDecimal.ROUND_DOWN);
            BigDecimal b = BigDecimal.valueOf(i / 3).setScale(0, BigDecimal.ROUND_DOWN);
            BigDecimal c = BigDecimal.valueOf(i / 5).setScale(0, BigDecimal.ROUND_DOWN);
            BigDecimal sum = a.add(b.add(c));
            hashMap.put(sum,1);
        }
        System.out.println(hashMap.size());
    }
}
