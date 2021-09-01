import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @date 2021-8-30 - 20:52
 * Created by Salmon
 */
public class Main1040 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        long n = 0,pCount = 0,aCount = 0,tCount = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 'P' && flag == 0){
                continue;
            }else {
                flag++;
            }

            if(s.charAt(i) == 'P'){
                pCount++;
            }else if(s.charAt(i) == 'A'){
                aCount = aCount + pCount; //在没有扫描到T之前，所有的A前有多少个P
            }else if (s.charAt(i) == 'T'){
                n = n + aCount; //每个T之前有多少个PA
            }
        }
        System.out.println(n % 1000000007);
    }
}
