import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-8 - 21:28
 * Created by Salmon
 */
public class Main_2020_spring_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();
        int n = s.length();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime(Integer.parseInt(s))){
                System.out.println(s + " " + "Yes");
                flag++;
            }else {
                System.out.println(s + " " + "No");
            }
            s = s.substring(1);
        }
        if(flag == n){
            System.out.println("All Prime!");
        }
    }

    public static boolean isPrime(int num){
        if(num == 1 || num == 0){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
