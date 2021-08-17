import org.omg.Messaging.SyncScopeHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-17 - 16:42
 * Created by Salmon
 */
public class Main1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int num = Integer.parseInt(s[0]);
        String sign = s[1];

        int temp = 1;
        int sum = 0;
        int i = 0;
        while (true) {
            temp = temp + 2;
            if(sum + temp > (num - 1) / 2){
                break;
            }
            sum = sum + temp;
            i++;
        }
        int total = i; //一半的层数，中间的一个*没有计算
        int maxNum = 2*i + 1; //每层符号的最大数

        StringBuilder Top = new StringBuilder(); //包含*
        StringBuilder Down = new StringBuilder(); //不含*
        int temp1 = maxNum;
        for(int j = 0; j < total + 1; j++) {
            for(int x = 0; x < (maxNum - temp1) / 2; x++){
                Top.append(" ");
            }
            for(int k = 0; k < temp1; k++) {
                Top.append(sign);
            }
            for(int y = 0; y < (maxNum - temp1) / 2; y++){
               // Top.append(" ");
            }
            Top.append("\n");
            temp1 = temp1 - 2;
        }
        int temp2 = 3;
        for(int j = 0; j < total; j++) {
            for(int x = 0; x < (maxNum - temp2) / 2; x++){
                Down.append(" ");
            }
            for(int k = 0; k < temp2; k++) {
                Down.append(sign);
            }
            for(int y = 0; y < (maxNum - temp2) / 2; y++){
                //Down.append(" ");
            }
            Down.append("\n");
            temp2 = temp2 + 2;
        }

        System.out.print(Top);
        System.out.print(Down);
        System.out.println(num - (sum*2 + 1));
    }
}
