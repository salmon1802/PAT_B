import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2021-9-7 - 14:02
 * Created by Salmon
 */
public class Main_2020_winter_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        String[] s = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(s[i]);
            if(number % 2 != 0){
                map.put(number,map.containsKey(number) ? map.get(number).intValue() + 1 : 1);
            }
        }
        for (int key : map.keySet()){
            if(map.get(key).intValue() % 2 != 0){
                System.out.println(key);
                break;
            }
        }
    }
}
