import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @date 2021-8-30 - 19:14
 * Created by Salmon
 */
public class Main1039 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = bufferedReader.readLine().split("");
        String[] s2 = bufferedReader.readLine().split("");
        bufferedReader.close();
        int s1Length = s1.length;
        int s2Length = s2.length;
        HashMap<String,Integer> hashMap1 = new HashMap<>();
        HashMap<String,Integer> hashMap2 = new HashMap<>();
        int num = 0;

        for (int i = 0; i < s1Length; i++){
            hashMap1.put(s1[i],hashMap1.containsKey(s1[i]) ? hashMap1.get(s1[i]) + 1 : 1);
        }
        for (int i = 0; i < s2Length; i++){
            hashMap2.put(s2[i],hashMap2.containsKey(s2[i]) ? hashMap2.get(s2[i]) + 1 : 1);
        }

        for (String key : hashMap2.keySet()){
            int temp = hashMap1.get(key) == null ? 0 : hashMap1.get(key);
            if(temp >= hashMap2.get(key)){
                continue;
            }else {
                num = num + (hashMap2.get(key) - temp);
            }
        }

        if(num == 0){
            System.out.println("Yes" + " " + (s1Length - s2Length));
        }else {
            System.out.println("No" + " " + num);
        }

    }
}
