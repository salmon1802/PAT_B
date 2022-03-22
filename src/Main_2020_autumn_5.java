import java.io.*;

/**
 * @date 2021-9-10 - 15:57
 * Created by Salmon
 */
public class Main_2020_autumn_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        streamTokenizer.nextToken();
        int n = (int) streamTokenizer.nval;
        streamTokenizer.nextToken();
        int money = (int) streamTokenizer.nval;
        int[] block = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            streamTokenizer.nextToken();
            block[i] = (int) streamTokenizer.nval;
        }
        bufferedReader.close();
        in.close();

        int i = 0;
        while (i < n) { //间隔
            for (int low = 0,high = low + i; low < n - i && high < n; low++,high++) {
                int needMoney = 0;
                for (int x = low; x <= high; x++) {
                    needMoney += block[x];
                }
                if(needMoney <= money){
                    res++;
                }
            }
            i++;
        }
        System.out.println(res);
    }
}
