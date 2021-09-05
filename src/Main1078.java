import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-4 - 22:28
 * Created by Salmon
 */
public class Main1078 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sign = bufferedReader.readLine();
        String string = bufferedReader.readLine();
        if(sign.equals("C")){
            System.out.println(C(string));
        }else {
            System.out.println(D(string));
        }
        bufferedReader.close();

    }

    public static String C(String string){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < string.length(); ){
            int j = i;
            int num = 0;
            while (j < string.length() && string.charAt(j) == string.charAt(i) ){
                    j++;
                    num++;
            }
            if(num == 1){
                res.append(string.charAt(i));
            }else {
                res.append(num);
                res.append(string.charAt(i));
            }
            i = j;
        }
        return res.toString();
    }
    public static String D(String string){
        StringBuilder res = new StringBuilder();
        StringBuilder num = new StringBuilder("0");
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                num.append(string.charAt(i));
            }else {
                int n = Integer.parseInt(num.toString());
                if(n == 0){
                    res.append(string.charAt(i));
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    res.append(string.charAt(i));
                }
                num.delete(0, num.length());
                num.append(0);
            }
        }
        return res.toString();
    }

}
