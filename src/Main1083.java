import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

/**
 * @date 2021-9-2 - 21:54
 * Created by Salmon
 */
public class Main1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            streamTokenizer.nextToken();
            int key = Math.abs((i + 1) - (int) streamTokenizer.nval);
            hashMap.put(key,hashMap.containsKey(key) ? hashMap.get(key) + 1 : 1);
        }

        List<HashMap.Entry<Integer,Integer>> list = new ArrayList(hashMap.entrySet());

        for (int i = list.size() - 1; i >= 0; i--){
            if(list.get(i).getValue() != 1){
                System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
            }
        }

    }
}
