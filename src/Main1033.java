import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-26 - 20:02
 * Created by Salmon
 */
public class Main1033 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String noWork = bufferedReader.readLine();
//        int flag = 0;
//        if(noWork.contains("+")){
//            flag++;
//        }
        String[] strings = bufferedReader.readLine().split("");
        bufferedReader.close();
        for (int i = 0; i < strings.length; i++) {
            //if(!(noWork.contains(strings[i].toLowerCase()) || noWork.contains(strings[i].toUpperCase()))){
            if(noWork.indexOf(strings[i].toLowerCase()) == -1 && noWork.indexOf(strings[i].toUpperCase()) == -1){
            //    if(flag == 1 && (strings[i].charAt(0) >= 'A' && strings[i].charAt(0) <= 'Z')){
                if(noWork.indexOf("+") != -1 && (strings[i].charAt(0) >= 'A' && strings[i].charAt(0) <= 'Z')){

                }else {
                        System.out.print(strings[i]);
                }
            }
        }
    }
}
