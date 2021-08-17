import sun.awt.geom.PathConsumer2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @date 2021-8-14 - 22:39
 * Created by Salmon
 */
public class Main1024False {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int zhengshu = 0;
        int fushu = 0;
        int flag = 0;
        int flag1 = 0;
        int zeroNumber = 0;

        int index = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == 'E'){
                index = i;
                flag++;
                if(s.charAt(index + 2) == '0'){
                    flag1++;
                }
                continue;
            } else if(s.charAt(i) == '+'){
                zhengshu++;
                continue;
            }else if(s.charAt(i) == '-'){
                fushu++;
                continue;
            }

            if(flag == 0){
                sb1.append(s.charAt(i));
            }else {
                if(s.charAt(i) == '0' && flag1 == 1){
                    continue;
                }else {
                    sb2.append(s.charAt(i));
                }
            }
        }

        for(int i = index - 1; i >= 0; i--){
            if(s.charAt(i) == '0'){
                zeroNumber++;
            }
        }

        double num2 = 1.0;
        double num1 = Double.parseDouble(String.valueOf(sb1));
        long mi = Long.parseLong(String.valueOf(sb2));
        if(zhengshu == 1){
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(num1);
            stringBuilder3.deleteCharAt(1);
            for(int i = 0; i < mi - 1; i++){
                stringBuilder3.append(0);
            }
            if(s.charAt(0) == '-'){
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(Long.parseLong(stringBuilder3.toString()) * -1);
                System.out.println(stringBuilder4);
            }else {
                System.out.println(stringBuilder3);
            }
        }else if(fushu == 1){
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(0.0);
            for(int i = 0; i < mi - 2; i++){
                stringBuilder1.append(0);
            }
            stringBuilder1.append(1);
            num2 = Double.parseDouble(stringBuilder1.toString());
        }

        if(fushu == 1){
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(num1 * num2);
            for(int i = 0; i < zeroNumber; i++){
                stringBuilder2.append(0);
            }
            System.out.println(stringBuilder2);
        }

    }
}
