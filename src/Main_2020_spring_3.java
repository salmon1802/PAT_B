import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-8 - 21:28
 * Created by Salmon
 */
public class Main_2020_spring_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n1 = s[0].length();
        int n2 = s[1].length();
        int n = Math.max(n1,n2);
        bufferedReader.close();
        StringBuilder balance = new StringBuilder();
        for (int i = 0; i < Math.abs(n1 - n2); i++) {
            balance.append(0);
        }
        if(n1 == n2){
            ;
        }else if(n1 > n2) {
            s[1] = balance.append(s[1]).toString();
        }else if(n1 < n2){
            s[0] = balance.append(s[0]).toString();
        }

        String[] strings = new String[30];
        for (int i = 0; i < 30; i++) {
            if(i < 10){
                strings[i] = String.valueOf(i);
            }else {
                strings[i] = String.valueOf(Character.valueOf((char) ('a' + i - 10)));
            }
        }
        StringBuilder res = new StringBuilder();
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int temp1 = Character.isAlphabetic(s[0].charAt(i)) ? s[0].charAt(i) - 'a' + 10 : s[0].charAt(i) - '0';
            int temp2 = Character.isAlphabetic(s[1].charAt(i)) ? s[1].charAt(i) - 'a' + 10 : s[1].charAt(i) - '0';
            int temp3 = temp1 + temp2 + carry;
            if(temp3 >= 30){
                carry = temp3 / 30;
                res.append(strings[temp3 % 30]);
            }else {
                carry = 0;
                res.append(strings[temp3]);
            }
        }
        res.reverse();
        for (int i = 0; i < res.length(); ) {
            if(res.charAt(i) == '0'){
                res.deleteCharAt(i);
            }else {
                break;
            }
        }
        if(res.toString().equals("")){
            System.out.println(0);
        }else {
            System.out.println(res);
        }
    }


}
