import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-11 - 20:27
 * Created by Salmon
 */
public class Main1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        char[] c1 = strings[0].toCharArray();
        char[] c2 = strings[2].toCharArray();
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i < c1.length; i++){
            if(c1[i] == strings[1].charAt(0)){
                stringBuffer1.append(strings[1]);
            }
        }
        if(stringBuffer1.toString().equals("")){
            stringBuffer1.append("0");
        }
        for (int i = 0; i < c2.length; i++){
            if(c2[i] == strings[3].charAt(0)){
               stringBuffer2.append(strings[3]);
            }
        }
        if(stringBuffer2.toString().equals("")){
            stringBuffer2.append("0");
        }
        System.out.println((Integer.parseInt(stringBuffer1.toString()) + Integer.parseInt(stringBuffer2.toString())));;


    }
}
