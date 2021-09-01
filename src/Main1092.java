import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @date 2021-8-19 - 19:24
 * Created by Salmon
 */
public class Main1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        streamTokenizer.nextToken();
        int c = (int) streamTokenizer.nval; //月饼种类
        streamTokenizer.nextToken();
        int r = (int) streamTokenizer.nval; //城市
        int[][] sales = new int[r][c];
        int[] totolKindSale = new int[c];
        int maxSingleKindSaleOfCity = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                streamTokenizer.nextToken();
                sales[i][j] = (int) streamTokenizer.nval;
                if(i == 0){
                    totolKindSale[j] = sales[i][j];
                }else {
                    totolKindSale[j] = totolKindSale[j] + sales[i][j];
                }
//                if(sales[i][j] > maxSingleKindSaleOfCity){
//                    maxSingleKindSaleOfCity = sales[i][j];
//                }
            }
        }
        bufferedReader.close();
//        System.out.println(maxSingleKindSaleOfCity);
        int max = 0;
        for(int i = 0; i < c; i++) {
            if(totolKindSale[i] > max){
                max = totolKindSale[i];
            }
        }
        System.out.println(max);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < c; i++) {
            if(totolKindSale[i] == max){
                res.append(i + 1);
                res.append(" ");
            }
        }
        System.out.println(res.toString().trim());

    }
}
