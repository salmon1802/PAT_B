import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @date 2021-8-14 - 21:54
 * Created by Salmon
 */
public class Main1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        int index = 0;
        if(!strings[0].equals("0")){
            for(int i = 1; i < strings.length; i++){
                if(!strings[i].equals("0")){
                    index = i;
                    strings[i] = String.valueOf(Integer.parseInt(strings[i]) - 1);
                    break;
                }
            }
            System.out.print(index);
            for (int i = 0; i < strings.length; i++){
                for(int j = 0; j < Integer.parseInt(strings[i]); j++) {
                    System.out.print(i);
                }
            }
        }else {
            for (int i = 0; i < strings.length; i++){
                for(int j = 0; j < Integer.parseInt(strings[i]); j++) {
                    System.out.print(i);
                }
            }
        }


    }
}
