import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-9 - 14:38
 * Created by Salmon
 */
public class Main_2019_autumn_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int start = Integer.parseInt(s[0]);
        int end = Integer.parseInt(s[1]);
        int flag = 0;
        for (int i = start; i <= end; i++) {
            int temp = isYuanFenNum(i);
                if(temp != -1){
                    flag++;
                    System.out.println(i + " " + temp);
                }
        }
        if(flag == 0){
            System.out.println("No Solution");
        }
    }

    public static int isYuanFenNum(int a){
        int aBro = a - 1;
        double c = Math.sqrt(Math.pow(a, 3) - Math.pow(aBro, 3));
        if(!isIntegNum(c)){
            return -1;
        }else {
            double sign = Math.sqrt(c);
            for (int i = 1; i <= sign; i++) {
                if(Math.pow(i, 2) + Math.pow(i - 1, 2) == c){
                    return i;
                }
            }
            return  -1;
        }
    }

    public static boolean isIntegNum(double n){
        String s = String.valueOf(n);
        if(s.charAt(s.length() - 1) != '0'){
            return false;
        }else {
            return true;
        }
    }
}
