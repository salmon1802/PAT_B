import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



/**
 * @date 2021-8-18 - 19:08
 * Created by Salmon
 */
public class Main1030 {
    public static void main(String[] args) throws IOException {
        //v1 稳稳的超时
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] strings = bufferedReader.readLine().split("\\s+");
//        int n = Integer.parseInt(strings[0]);
//        long p = Long.parseLong(strings[1]);
//        String[] s = bufferedReader.readLine().split("\\s+");
//        bufferedReader.close();
//        long[] nums = Arrays.stream(s).mapToLong(Long::parseLong).toArray();
//        Arrays.sort(nums);
//        long M = nums[n - 1];
//        int count = 0;
//        for(int i = 0; i < n; i++){
//            if(nums[i] * p >= M){
//                count++;
//            }
//        }
//        System.out.println(count);

        //v2 有一个超时
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int p = sc.nextInt();
//        long[] nums = new long[n];
//        long M = 0;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextLong();
//            if(nums[i] > M){
//                M = nums[i];
//            }
//        }
//        for(int i = 0; i < n; i++){
//            if(nums[i] * p >= M){
//                count++;
//            }
//        }
//        System.out.println(count);

        /* v3 不超时了,但倒数第二个用例过不了，因为只考虑了最大值M且数不重复的情况
            例如 8 7
                15 8 8 8 2 2 2 1
                这组应该输出6，但我们的程序只输出4，就是因为没有考虑到其他的M的情况
                很难办，如果继续遍历或sort绝对会超时
        */
Math.pow(1, 2);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        streamTokenizer.nextToken();
        int n = (int)streamTokenizer.nval;
        streamTokenizer.nextToken();
        int p = (int)streamTokenizer.nval;
        long[] nums = new long[n];
        long M = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            streamTokenizer.nextToken();
            nums[i] = (long) streamTokenizer.nval;
            if(nums[i] > M){
                M = nums[i];
            }
        }
        bufferedReader.close();
        for(int i = 0; i < n; i++){
            if(nums[i] * p >= M){
                count++;
            }
        }
        System.out.println(count);
    }
}
