import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


/**
 * @date 2021-9-10 - 14:04
 * Created by Salmon
 */
public class Main_2020_autumn_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String chars = bufferedReader.readLine();
        int n = chars.length();
        int index = n / 2;
        if(n % 2 != 0){
            System.out.println("Error: " + n + " digit(s)");
        }else {
            String s1 = chars.substring(0, index);
            BigDecimal b1 = new BigDecimal(s1);
            String s2 = chars.substring(index);
            BigDecimal b2 = new BigDecimal(s2);
            int sub = b2.subtract(b1).intValue();
            if (sub == 2) {
                System.out.println("Yes: " + s2 + " - " + s1 + " = " + sub);
            }else {
                System.out.println("No: " + s2 + " - " + s1 + " != " + 2);
            }
        }
    }
}
