import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @date 2021-9-6 - 14:26
 * Created by Salmon
 */
public class Main1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] s1 = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < n2; i++) {
            hashMap.put(s1[i],1);
        }
        int peopleNum = 0;
        int things = 0;
        for (int i = 0; i < n1; i++) {
            int flag = 0;
            String[] s2 = bufferedReader.readLine().split("\\s+");
            StringBuilder stringBuilder = new StringBuilder();
            int n3 = Integer.parseInt(s2[1]);
            for (int j = 2; j < n3 + 2; j++) {
                if(hashMap.containsKey(s2[j])){
                    stringBuilder.append(" ");
                    stringBuilder.append(s2[j]);
                    flag++;
                    things++;
                }
            }
            if (flag != 0){
                peopleNum++;
                System.out.print(s2[0] + ":");
                System.out.print(stringBuilder + "\n");
            }
        }
        System.out.println(peopleNum + " " + things);
    }
}
