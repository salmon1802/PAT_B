import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-7 - 14:02
 * Created by Salmon
 */
public class Main_2020_winter_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        int low = 0;
        int high = 10;
        createFns(2, high);
        while (true) {
            if(num[high - 1] < n){
                low = low + 10;
                high = high + 10;
                createFns(low, high);
            }else {
                for (int i = low; i < high; i++) {
                    if(num[i] > n){
                        long res = (Math.abs(num[i] - n) < Math.abs(num[i - 1] - n)) ? num[i] : num[i - 1];
                        System.out.println(res);
                        break;
                    }
                }
                break;
            }
        }
    }

    static long[] num = new long[10000];
    public static void createFns(int low,int high){ //n：阶数
        num[0] = 0;
        num[1] = 1;
        for (int i = low; i < high; i++){
            num[i] = createFn(num[i - 2],num[i - 1]);
        }
    }

    public static long createFn(long n1,long n2){
        long n3 = n1 + n2;
        return n3;
    }

}
