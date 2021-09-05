import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-2 - 22:19
 * Created by Salmon
 */
public class Main1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        String sign = s[0] + "1";
        int n = Integer.parseInt(s[1]);
        for (int i = 3; i <= n; i++) {
            sign = create(sign);
        }
        if(n == 1){
            System.out.println(s[0]);
        }else {
            System.out.println(sign);
        }

    }

    public static String create(String s){
            StringBuilder temp = new StringBuilder();

            for(int j = 0; j < s.length(); ){
                int k;
                int count = 0;
                for(k = j; k < s.length(); k++){
                    if(s.charAt(j) == s.charAt(k)){
                        count++;
                    }else {
                        temp.append(s.charAt(j));
                        temp.append(count);
                        j = k;
                        break;
                    }
                }
                if(k == s.length()){
                    temp.append(s.charAt(j));
                    temp.append(count);
                    break;
                }
            }
            s = temp.toString();
            return s;
    }

}
