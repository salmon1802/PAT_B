import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-7 - 21:08
 * Created by Salmon
 */
public class Main1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            String[] strings = bufferedReader.readLine().split("\\s+");
            if((Double.parseDouble(strings[0]) + Double.parseDouble(strings[1])) > Double.parseDouble(strings[2])) {
                System.out.println("Case #" + (i + 1) +": true");
            }else {
                System.out.println("Case #" + (i + 1) +": false");
            }
        }
        bufferedReader.close();
    }
}
