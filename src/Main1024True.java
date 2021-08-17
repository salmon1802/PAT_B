import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * @date 2021-8-15 - 00:38
 * Created by Salmon
 */
public class Main1024True {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BigDecimal s= new BigDecimal(bufferedReader.readLine());
            bufferedReader.close();
            System.out.println(s.toPlainString());
        }
}
