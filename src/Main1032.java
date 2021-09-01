import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;

/**
 * @date 2021-8-25 - 18:19
 * Created by Salmon
 */
public class Main1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        streamTokenizer.nextToken();
        int n = (int) streamTokenizer.nval;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            streamTokenizer.nextToken();
            int schoolNum = (int) streamTokenizer.nval;
            streamTokenizer.nextToken();
            int point = (int) streamTokenizer.nval;
            if(map.containsKey(schoolNum)){
                map.put(schoolNum,map.get(schoolNum) + point);
                if(map.get(schoolNum) > max){
                    max = map.get(schoolNum);
                    maxIndex = schoolNum;
                }
            }else {
                if(point > max){
                    max = point;
                    maxIndex = schoolNum;
                }
                map.put(schoolNum, point);
            }
        }
        bufferedReader.close();

        System.out.println(maxIndex + " " + max);


    }


}
