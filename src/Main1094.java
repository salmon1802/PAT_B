import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-20 - 19:08
 * Created by Salmon
 */
public class Main1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int length = Integer.parseInt(s[1]);
        String num = bufferedReader.readLine();
        bufferedReader.close();

        int flag = 0;
        for (int i = 0; i <= n - length; i++) {
            String res = num.substring(i, i + length);
            if(isPrime(res)){
                flag++;
                System.out.println(res);
                break;
            }
        }

        if(flag == 0){
            System.out.println(404);
        }


    }
    public static boolean isPrime(String s){
        int num = Integer.parseInt(s);
        if(num <= 1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
