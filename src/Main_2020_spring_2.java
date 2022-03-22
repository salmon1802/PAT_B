import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-8 - 21:28
 * Created by Salmon
 */
public class Main_2020_spring_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(strings[0]);
        int sign = Integer.parseInt(strings[1]);
        String[] s = bufferedReader.readLine().split("\\s+");
        bufferedReader.close();
        int minIndex = 0,maxIndex = 0,max = 0;
        int flag = 0;
        int flag1 = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(s[i]);
            max = Math.max(temp, max);
            if(temp > sign){
                if(flag == 0){
                    minIndex = i;
                    maxIndex = i;
                    flag++;
                }
                maxIndex = Math.max(maxIndex, i);
            }else {
                if(flag == 1){ //扫描到不合格数据时，至少找到一个区间
                    flag = 0;
                    flag1++;
                    System.out.println("[" + minIndex + "," + " " + maxIndex + "]");
                }
            }
        }
        if(flag1 == 0){
            System.out.println(max);
        }
    }
}
