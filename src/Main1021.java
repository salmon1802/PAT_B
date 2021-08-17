import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-14 - 21:11
 * Created by Salmon
 */
public class Main1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().toCharArray();
        int[] num = new int[10];
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '0'){
                num[0]++;
            }else if(chars[i] == '1'){
                num[1]++;
            }else if(chars[i] == '2'){
                num[2]++;
            }else if(chars[i] == '3'){
                num[3]++;
            }else if(chars[i] == '4'){
                num[4]++;
            }else if(chars[i] == '5'){
                num[5]++;
            }else if(chars[i] == '6'){
                num[6]++;
            }else if(chars[i] == '7'){
                num[7]++;
            }else if(chars[i] == '8'){
                num[8]++;
            }else if(chars[i] == '9'){
                num[9]++;
            }
        }
        for(int i = 0; i < 10; i++){
            if(num[i] != 0){
                System.out.println(i + ":" + num[i]);
            }
        }
    }
}
