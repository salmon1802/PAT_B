
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * @date 2021-8-12 - 20:56
 * Created by Salmon
 */
public class Main1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        char[] number = s.toCharArray();
        while (true){
            StringBuffer sb = new StringBuffer();
                for (int i = 0; i < 4 - number.length; i++){
                    sb.append(0);
                }
                number = sb.append(String.valueOf(number)).toString().toCharArray();
            Arrays.sort(number);
//            int n1 = Integer.parseInt(number.toString());
//            int n1 = Integer.parseInt(arrayToString(number));
            int n1 = Integer.parseInt(String.valueOf(number));
            for(int i = 0; i < number.length / 2; i++){ //这里其实也可以使用StringBuffer的reverse方法，懒得写了
                 char temp = number[i];
                 number[i] = number[number.length - 1 - i];
                number[number.length - 1 - i] = temp;
            }
            int n2 = Integer.parseInt(String.valueOf(number));
            System.out.printf("%04d - %04d = %04d\n", n2, n1, n2 - n1);
            if(n2 - n1 == 0 || n2 - n1 == 6174) break;
            number = String.valueOf(n2 - n1).toCharArray();

        }
    }

//    public static String arrayToString(char[] c){
//        StringBuffer stringBuffer = new StringBuffer();
//        for(int i = 0; i < c.length; i++){
//             stringBuffer.append(c[i]);
//        }
//        return stringBuffer.toString();
//    }
}
