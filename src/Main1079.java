import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @date 2021-9-5 - 21:54
 * Created by Salmon
 */
public class Main1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();
        StringBuilder stringBuilder = new StringBuilder(s);
        int n = 0;
        while (true) {
            n++;
            if(n > 10){
                System.out.println("Not found in 10 iterations.");
                break;
            }
            if(isPalindromicNum(stringBuilder.toString())){
                stringBuilder.append(" is a palindromic number.");
                System.out.println(stringBuilder.toString());
                break;
            }else {
                String temp1 = stringBuilder.toString();
                String temp2 = stringBuilder.reverse().toString();
                int n1 = Integer.parseInt(temp1);
                int n2 = Integer.parseInt(temp2);
                System.out.print(temp1 + " + " + temp2 + " = ");
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append(n1 + n2);
                System.out.print(stringBuilder + "\n");
            }

        }
    }

    public static boolean isPalindromicNum(String s){
        if(s.equals("0")){
            return true;
        }
        int n = s.length();
        for (int i = 0; i < n / 2; i++){
            if(s.charAt(i) == s.charAt(n - 1 - i)){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
