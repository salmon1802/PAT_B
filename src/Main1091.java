import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-19 - 18:58
 * Created by Salmon
 */
public class Main1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split("\\s+");
        bufferedReader.close();
        for(int i = 0; i < n; i++) {
            fun(strings[i].length(),Integer.parseInt(strings[i]));
        }
    }

    public static void fun(int length,int num){
        int flag = 0;
        for(int N = 1; N <= 10; N++) {
            String temp = String.valueOf((int) Math.pow(num, 2) * N);
            String lastDig = temp.substring(temp.length() - length);
            if(num == Integer.parseInt(lastDig)){
                flag++;
                System.out.println(N + " " + temp);
                break;
            }
        }
        if(flag == 0){
            System.out.println("No");
        }
    }
}
