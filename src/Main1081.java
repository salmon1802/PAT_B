import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-1 - 22:07
 * Created by Salmon
 */
public class Main1081 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            check(bufferedReader.readLine());
        }
        bufferedReader.close();
    }

    public static void check(String s){
        int numberCount = 0;
        int charCount = 0;
        int flag = 0;
        if(s.length() < 6){
            System.out.println("Your password is tai duan le.");
        }else {
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    numberCount++;
                }else if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
                    charCount++;
                }else if(s.charAt(i) != '.') {
                    System.out.println("Your password is tai luan le.");
                    flag++;
                    break;
                }
            }

            if(flag == 0){
                if(numberCount == 0){
                    System.out.println("Your password needs shu zi.");
                }else if(charCount == 0){
                    System.out.println("Your password needs zi mu.");
                }else {
                    System.out.println("Your password is wan mei.");
                }
            }

        }
    }
}
