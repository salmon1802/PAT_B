import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-8 - 21:16
 * Created by Salmon
 */
public class Main1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        int min = Integer.parseInt(strings[0]);
        int max = Integer.parseInt(strings[1]);
        int n = 2;

        for(int i = -min + 1; i <= max - min; ) {
            if(isPrime(n)){
                i++;
                if(i <= 0){
                    ;
                }else if ((i % 10 == 0 && i != 0) || i == max - min + 1) {
                    System.out.println(n);
                } else {
                    System.out.print(n + " ");
                }
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
