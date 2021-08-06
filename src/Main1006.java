import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-5 - 00:43
 * Created by Salmon
 */
public class Main1006 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int hun = n / 100;
        int ten = (n / 10) % 10;
        int num = n % 10;
        for(int i = 0; i < hun; i++){
            System.out.print("B");
        }
        for(int i = 0; i < ten; i++){
            System.out.print("S");
        }
        for(int i = 0; i < num; i++){
            System.out.print(i + 1);
        }
    }
}
