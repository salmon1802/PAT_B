import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @date 2021-8-7 - 21:42
 * Created by Salmon
 */
public class Main1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        BigDecimal A4 = new BigDecimal(0);
        int A5 = 0;

        int flag1 = 1;
        int flag2 = 0;
        int sum = 0, time = 0;
        for (int i = 1; i <= Integer.parseInt(strings[0]); i++) {
            if(Integer.parseInt(strings[i]) % 2 == 0 && Integer.parseInt(strings[i]) % 5 == 0){
                A1 = A1 + Integer.parseInt(strings[i]);
            }
            if(Integer.parseInt(strings[i]) % 5 == 1){
                flag2 = 1;
                if(flag1 == 1){
                    A2 = A2 + Integer.parseInt(strings[i]);
                    flag1 = -flag1;
                }else {
                    A2 = A2 - Integer.parseInt(strings[i]);
                    flag1 = -flag1;
                }
            }
            if(Integer.parseInt(strings[i]) % 5 == 2){
                A3++;
            }
            if(Integer.parseInt(strings[i]) % 5 == 3){
                 sum = sum + Integer.parseInt(strings[i]);
                 time++;
            }
            if(Integer.parseInt(strings[i]) % 5 == 4){
                if(Integer.parseInt(strings[i]) > A5){
                    A5 = Integer.parseInt(strings[i]);
                }
            }
        }

        if(time != 0){
            BigDecimal bigDecimal = new BigDecimal((float)sum / time);
            A4 = bigDecimal.setScale(1,BigDecimal.ROUND_HALF_UP);
        }




        if(A1!=0)
            System.out.print(A1+" ");
        else
            System.out.print('N'+" ");
        if(A2!=0 || flag2 == 1)
            System.out.print(A2+" ");
        else
            System.out.print('N'+" ");
        if(A3!=0)
            System.out.print(A3+" ");
        else
            System.out.print('N'+" ");
        if(!A4.equals(new BigDecimal(0)))
            System.out.print(A4+" ");
        else
            System.out.print('N'+" ");
        if(A5!=0)
            System.out.print(A5);
        else
            System.out.print('N');
    }
}
