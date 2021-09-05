import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @date 2021-9-3 - 22:54
 * Created by Salmon
 */
public class Main1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        streamTokenizer.nextToken();
        int n = (int) streamTokenizer.nval;
        for(int i = 0; i < n*4; i++){
            streamTokenizer.nextToken();
            String[] s = streamTokenizer.sval.split("-");
            if(s[1].equals("T")){
                System.out.print(s[0].charAt(0) - 'A' + 1);
            }
        }
    }
}
