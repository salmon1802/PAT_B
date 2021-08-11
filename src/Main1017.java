import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @date 2021-8-12 - 01:05
 * Created by Salmon
 */
public class Main1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        String s = strings[0];
        bufferedReader.close();
        char[] num = s.toCharArray();
        int div = Integer.parseInt(strings[1]);
        int temp = 0;
        int flag = 0;
        String end;
//        double n = Double.parseDouble(strings[0]);
//        int div = Integer.parseInt(strings[1]);
//        System.out.printf("%f %d",(n / div),(int)(n % div));
//        BigDecimal bigDecimal = new BigDecimal(strings[0]);
//        System.out.println(bigDecimal.divide(BigDecimal.valueOf(Integer.parseInt(strings[1]))) + " "
//                            + bigDecimal.divideAndRemainder(BigDecimal.valueOf(Integer.parseInt(strings[1]))));
//
        //前两种用语言特性解决不了，所以只能使用模拟手算的方法
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            temp = temp + Integer.parseInt(String.valueOf(num[i]));
            if(temp < div){
                if(i == 0){
                    flag++;
                }
                stringBuffer.append(0);
                temp = Integer.parseInt(String.valueOf(num[i]))*10;
                continue;
            }else if(temp >= div){
                int mid = temp / div;
                stringBuffer.append(mid);
                temp = temp % div *10;
            }
        }
        if(flag == 1 && s.length() > 1){
            end = stringBuffer.toString().substring(1);
        }else {
            end = stringBuffer.toString();
        }
        System.out.print(end + " " + temp / 10);
    }
}
