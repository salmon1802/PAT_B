import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-8 - 14:21
 * Created by Salmon
 */
public class Main_2021_spring_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        String fir = s[1];
        String sec = s[2];
        String div = s[3];
        int row = 0;
        while (row < n) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < row; i++) {
                res.append(sec);
            }
            res.append(div);
            for (int i = 0; i < n - row - 1; i++) {
                res.append(fir);
            }
            System.out.println(res);
            row++;
        }
    }
}
