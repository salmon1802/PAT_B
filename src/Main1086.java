import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-31 - 21:20
 * Created by Salmon
 */
public class Main1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        StringBuilder res = new StringBuilder();
        res.append(Integer.parseInt(strings[0]) * Integer.parseInt(strings[1]));
        res.reverse();
        int i = 0;
        for ( ; i < res.length(); i++){
            if(res.charAt(i) != '0'){
                break;
            }
        }
        System.out.println(res.delete(0, i));
    }
}
