import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


/**
 * @date 2021-8-16 - 15:56
 * Created by Salmon
 */
public class Main1026 {
    //V1
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = bufferedReader.readLine().split("\\s+");
//        double c1 = Double.parseDouble(s[0]);
//        double c2 = Double.parseDouble(s[1]);
//        double n = (c2 - c1) / 100;
//        StringBuilder res = new StringBuilder();
//
//        for(int i = 2; i >= 0; i--){
//            if((int)(n / Math.pow(60, i)) != 0){
//                BigDecimal bigDecimal = new BigDecimal(n / Math.pow(60, i));
//                if(i != 0){
//                    bigDecimal = bigDecimal.setScale(0, BigDecimal.ROUND_DOWN);
//                    if(String.valueOf(bigDecimal).length() == 1){
//                        res.append("0");
//                    }
//                    res.append(bigDecimal);
//                    res.append(":");
//                }else{
//                    bigDecimal = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_UP);
//                    if(String.valueOf(bigDecimal).length() == 1){
//                        res.append("0");
//                    }
//                    res.append(bigDecimal);
//                }
//                n = n % Math.pow(60, i);
//            }else {
//                res.append("00");
//                if(i != 0)
//                    res.append(":");
//            }
//        }
//        System.out.println(res);
//
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        bufferedReader.close();
        double n = (Double.parseDouble(strings[1]) - Double.parseDouble(strings[0])) / 100;
        int time = Integer.parseInt(BigDecimal.valueOf(n).setScale(0,BigDecimal.ROUND_HALF_UP).toString());
        int hh = time / 3600;
        int mm = (time % 3600) / 60;
        int ss = time % 60;
        System.out.printf("%02d:%02d:%02d", hh,mm,ss);
    }
}
