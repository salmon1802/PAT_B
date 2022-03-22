import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-6 - 15:27
 * Created by Salmon
 */
public class Main1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();
        int s1Length = s1.length();
        String s2 = bufferedReader.readLine();
        int s2Length = s2.length();
        bufferedReader.close();
        int n1 = s.length() - s1Length;
        int n2 = s.length() - s2Length;
        StringBuilder s11 = new StringBuilder();
        StringBuilder s22 = new StringBuilder();

        for (int i = 0; i < n1; i++) {
            s11.append(0);
        }
        s11.append(s1);
        s1 = s11.toString();

        for (int i = 0; i < n2; i++) {
            s22.append(0);
        }
        s22.append(s2);
        s2 = s22.toString();



        StringBuilder res = new StringBuilder();
        int temp = 0;
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            int scale = (s.charAt(i) - '0') == 0 ? 10 : s.charAt(i) - '0';
            int sum = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + temp;
            if(sum < scale){
                res.append(sum);
                temp = 0;
            }else {
                res.append(sum % scale);
                temp = sum / scale;
            }
        }

        res.reverse();
        for (int j = 0; j < res.length(); j++) {
            if(res.charAt(j) != '0'){
                res.delete(0, j);
                break;
            }
        }
        System.out.println(res);
    }
}
