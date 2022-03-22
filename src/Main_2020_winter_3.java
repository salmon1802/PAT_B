import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @date 2021-9-7 - 14:02
 * Created by Salmon
 */
public class Main_2020_winter_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int decCount = Integer.parseInt(s[1]);
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            if(strings[0].equals("1")){
                System.out.println(BigDecimal.valueOf(Double.parseDouble(strings[1])).setScale(decCount, BigDecimal.ROUND_HALF_UP));
            }else if(strings[0].equals("2")){
                System.out.println(BigDecimal.valueOf(Double.parseDouble(strings[1])).setScale(decCount, BigDecimal.ROUND_DOWN));
            }else {
                fun3(decCount, strings[1]);
            }
        }
    }

    public static void fun3(int decCount,String num){
        StringBuilder res = new StringBuilder();
        String[] temp = num.split("\\.");
        String s = temp[1];
        res.append(temp[0]);
        res.append(".");

        if(s.length() <= decCount){
            res.append(s);
            for (int i = 0; i < decCount - s.length(); i++){
                res.append(0);
            }
        }else if(s.charAt(decCount) - '0' < 5){
            res.append(s.substring(0, decCount));
        }else if(s.charAt(decCount) - '0' > 5){
            res.append(Integer.parseInt(s.substring(0, decCount)) + 1);
        }else {
            if(s.charAt(decCount + 1) - '0' != 0){
                res.append(Integer.parseInt(s.substring(0, decCount)) + 1);
            }else {
                if((s.charAt(decCount - 1) - '0') % 2 == 0){ //为偶数
                    res.append(s.substring(0, decCount));
                }else { //为奇数
                    res.append(Integer.parseInt(s.substring(0, decCount)) + 1);
                }
            }
        }
        System.out.println(res);
    }
}
