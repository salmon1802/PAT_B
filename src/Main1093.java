import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-20 - 17:48
 * Created by Salmon
 */
public class Main1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //v1 超时或者内存超限 不过写的很爽1min的事情
//        String s1 = bufferedReader.readLine();
//        String s2 = bufferedReader.readLine();
//        bufferedReader.close();
//        String[] strings = (s1 + s2).split("");
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < strings.length; i++) {
//            if(!res.toString().contains(strings[i])){
//                res.append(strings[i]);
//            }
//        }
//        System.out.println(res);

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        bufferedReader.close();
        char[] chars = (s1 + s2).toCharArray();
        int[] ASC = new int[127];
        for (int i = 0; i < chars.length; i++){
            if(ASC[chars[i]] == 0){
                System.out.print(chars[i]);
                ASC[chars[i]]++;
            }
        }

    }
}
