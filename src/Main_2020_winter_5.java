import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 * @date 2021-9-7 - 14:02
 * Created by Salmon
 */
public class Main_2020_winter_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = bufferedReader.readLine().split("");
        String[] s2 = bufferedReader.readLine().split("");
        bufferedReader.close();

        HashMap<Integer,String> hashMap = new HashMap<>();

        int[] Index = new int[s2.length];
        int n = 0;
        while (n < s1.length) {
            int flag = 0;
            StringBuilder sb = new StringBuilder();
            int j = 0;
                for (int i = n; i < s1.length && j < s2.length; i++) {
                    if(s1[i].equals(s2[j])){
                        Index[j] = i;
                        flag++;
                        j++;
                        sb.append(s1[i]);
                    }else if(flag != 0){
                        sb.append(s1[i]);
                    }
                }

            if(flag == s2.length){
                n = Index[0] + 1;
                if(!hashMap.containsKey(Index[Index.length - 1] - Index[0] + 1)){
                    hashMap.put(Index[Index.length - 1] - Index[0] + 1,sb.toString());
                }
            }else {
                break;
            }
        }

        for (int key : hashMap.keySet()){
            System.out.println(hashMap.get(key));
            break;
        }
    }
}
