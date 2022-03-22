import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @date 2021-9-8 - 14:21
 * Created by Salmon
 */
public class Main_2021_spring_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        int count = 0;
        while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF){
            String temp = streamTokenizer.sval;
            if(temp == null){
                continue;
            }
            if(temp.length() < 6){
                continue;
            }else if(temp.equals("Pintia") || temp.equals("pintia") ||
                    temp.equals("Pintia.") || temp.equals("pintia.") ||
                    temp.equals("Pintia,") || temp.equals("pintia,")
            ) {
                count++;
            }else if(temp.contains(",")){
                String[] s = temp.split(",");
                for (int i = 0; i < s.length; i++){
                    if(s[i].equals("Pintia") || s[i].equals("pintia")){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        if(count == 0){
            System.out.println("wu gan");
        }else if(count <= 3) {
            System.out.println("you ai");
        }else {
            System.out.println("zhen ai la");
        }
    }
}
