import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @date 2021-9-10 - 15:33
 * Created by Salmon
 */
public class Main_2020_autumn_4 { //只能逆序或顺序只有一次时正确
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        int[] nums = new int[n];
        int maxIndex = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            streamTokenizer.nextToken();
            nums[i] = (int) streamTokenizer.nval; //当前熊猫体重
            res[i] = 200; //奶量

            if(i != 0){
                if(nums[i] < nums[i - 1]){ //后比前轻，从maxIndex到当前i全部加100ml奶
                    for (int j = maxIndex; j < i; j++) {
                        res[j] += 100;
                    }
                }else if(nums[i] > nums[i - 1]){ //后比前重 ，移动maxIndex
                    maxIndex = i;
                    if(i == n - 1){
                        res[i] += 100;
                    }
                }else { //体重相同，跳过
                    continue;
                }
            }
        }
        bufferedReader.close();

        int sum = 0;
        for (int milk : res) {
            sum = sum + milk;
        }
        System.out.println(sum);
    }
}
