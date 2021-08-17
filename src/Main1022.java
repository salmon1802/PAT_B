import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @date 2021-8-14 - 21:20
 * Created by Salmon
 */
public class Main1022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        long n = Long.parseLong(strings[0]) + Long.parseLong(strings[1]);
        int D = Integer.parseInt(strings[2]);
        ArrayList res = new ArrayList();

        for(int i = 0; !(n < D); i++) {
            res.add(i, n % D);
            n = n / D;
        }
        res.add(n);
        for(int i = res.size() - 1; i >= 0; i--){
            System.out.print(res.get(i));
        }
    }
}
