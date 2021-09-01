import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @date 2021-8-30 - 18:55
 * Created by Salmon
 */
public class Main1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] s = bufferedReader.readLine().split("\\s+");
        Arrays.sort(s);
        StringBuilder res = new StringBuilder();
        String[] strings = bufferedReader.readLine().split("\\s+");
        bufferedReader.close();
        for (int i = 1; i <= Integer.parseInt(strings[0]); i++) {
            int num = 0;
            for (int j = 0; j < n; j++) {
                if(s[j].equals(strings[i])){
                    num++;
                }
            }
            res.append(num);
            res.append(" ");
        }
        System.out.println(res.toString().trim());
    }
}
