import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @date 2021-9-1 - 21:24
 * Created by Salmon
 */
public class Main1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer tokenizer = new StreamTokenizer(bufferedReader);
        tokenizer.nextToken();
        int n1 = (int) tokenizer.nval;
        tokenizer.nextToken();
        int n2 = (int) tokenizer.nval;
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i = 0; i < n1; i++){
            String[] s = bufferedReader.readLine().split("\\s+");
            hashMap.put(s[0],hashMap.containsKey(s[0]) ? hashMap.get(s[0]) + " " + s[1] : s[1]);
        }
        for (int i = 0; i < n2; i++) {
            String string = bufferedReader.readLine();
            String[] strings = string.split("\\s+");
            int n = Integer.parseInt(strings[0]);
            int flag = 0;
            for (int j = 1 ; j <= n; j++) {
                if (hashMap.containsKey(strings[j])){
                    String[] compare = hashMap.get(strings[j]).split("\\s+");
                    for (int k = 0; k < compare.length; k++) {
                        if(string.contains(compare[k])){
                            System.out.println("No");
                            flag++;
                            break;
                        }
                    }
                    if(flag != 0){
                        break;
                    }
                }else {
                    continue;
                }
            }
            if(flag == 0){
                System.out.println("Yes");
            }
        }
        bufferedReader.close();
    }
}
