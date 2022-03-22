import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Collections;

/**
 * @date 2021-9-9 - 22:28
 * Created by Salmon
 */
public class Main_2019_winter_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        String[] s = bufferedReader.readLine().split("\\s+");
        int row = Integer.parseInt(s[0]);
        int col = Integer.parseInt(s[1]);
        StringBuilder res = new StringBuilder();
        int[] nums = new int[row];
        for (int i = 0; i < row; i++) {
            int[] rNum = new int[col];
            for (int j = 0; j < col; j++) {
                streamTokenizer.nextToken();
                rNum[j] = (int) streamTokenizer.nval;
            }
            Arrays.sort(rNum);
            res.append(rNum[col - 1]);
            res.append(" ");
            nums[i] = rNum[col - 1];
        }
        System.out.println(res.toString().trim());
        bufferedReader.close();
        Arrays.sort(nums);
        System.out.println(nums[row - 1]);
    }
}
