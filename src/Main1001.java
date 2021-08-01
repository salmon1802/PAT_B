import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-1 - 21:29
 * Created by Salmon
 *
 */
public class Main1001 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.close();
//  事实证明BufferedReader确实比Scanner快
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        int i;
        for(i = 0; n != 1; i++){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = (3*n + 1) / 2;
            }
        }
        System.out.println(i);
    }
}
