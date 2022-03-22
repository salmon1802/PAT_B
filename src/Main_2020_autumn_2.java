import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * @date 2021-9-10 - 14:25
 * Created by Salmon
 */
public class Main_2020_autumn_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int start = Integer.parseInt(s[0]);
        int end = Integer.parseInt(s[1]);
        int[] count = new int[3];
        for (int i = start; i <= end; i++) {
            if (dealNum(i) == 0){
                count[0]++;
            }else if(dealNum(i) == 1){
                count[1]++;
            }else {
                count[2]++;
            }
        }


        int max = 0;
        for (int i : count) {
            if(i > max){
                max = i;
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if(count[i] == max && i == 0){
                res.append(0);
                res.append(" ");
            }else if(count[i] == max && i == 1){
                res.append(1);
                res.append(" ");
            }else if(count[i] == max && i == 2){
                res.append(8);
                res.append(" ");
            }
        }
        System.out.println(max);
        System.out.println(res.toString().trim());
    }



    public static int dealNum(int n){
        String s = String.valueOf(n);
        char[] num = s.toCharArray();
        int length = num.length;
        double mul = 1;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int temp = num[i] - '0';
            mul = mul * Math.pow(temp, 3);
        }
        String s1 = String.valueOf((int) mul);
        int length1 = s1.length();
        char[] chars = s1.toCharArray();
        for (int i = 0; i < length1; i++) {
            sum += (chars[i] - '0');
        }
        if(sum == 8 || sum == 0 || sum == 1){
            return sum;
        }else {
            return dealNum(sum);
        }
    }
}
