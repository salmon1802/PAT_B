import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-7 - 14:01
 * Created by Salmon
 */
public class Main_2020_winter_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            if(strings[i].length() == 1){
                System.out.println("Yes");
            }else {
                    int num = Integer.parseInt(strings[i]);
                    int div = strings[i].length();
                    if(num % div == 0){
                        System.out.println("Yes");
                        continue;
                    }else {
                        System.out.println("No");
                    }
                }
            }
        bufferedReader.close();
    }
}
