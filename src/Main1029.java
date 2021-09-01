import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-18 - 16:51
 * Created by Salmon
 */
public class Main1029 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = bufferedReader.readLine().toUpperCase().split("");
        String[] s2 = bufferedReader.readLine().toUpperCase().split("");
        bufferedReader.close();


        String res = removeSameChar(s1, s2);
        System.out.println(res);
    }

    static String removeSameChar(String[] s1,String[] s2){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            int count = 0;
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])) {
                    count++;
                    break;
                }
            }
            if(count == 0 && !res.toString().contains(s1[i])){
                res.append(s1[i]);
            }
        }
        return res.toString();
    }


}
