import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-6 - 21:27
 * Created by Salmon
 */
public class Main1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int moveNum = Integer.parseInt(s[1]);
        String[] num = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        for (int i = 0; i < moveNum; i++) {
            move(num);
        }
        for (int i = 0; i < n; i++) {
            if(i == 0){
                System.out.print(num[0]);
            }else{
                System.out.print(" "+ num[i]);
            }
        }
    }

    public static void move(String[] strings){
        String temp = strings[strings.length - 1];
        for (int i = strings.length - 1; i > 0; i--) {
            strings[i] = strings[i - 1];
        }
        strings[0] = temp;
    }
}
