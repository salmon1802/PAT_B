import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-6 - 22:35
 * Created by Salmon
 */
public class Main1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i == strings.length - 1){
                System.out.print(strings[i]);
            }else{
                System.out.print(" " + strings[i]);
            }
        }
    }
}
