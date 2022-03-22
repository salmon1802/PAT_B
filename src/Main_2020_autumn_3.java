import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-10 - 15:00
 * Created by Salmon
 */
public class Main_2020_autumn_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 11; i++) {
            System.out.print(calendar(bufferedReader.readLine()));
        }
    }

    public static int calendar(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        StringBuilder firstNum = new StringBuilder();
        StringBuilder endNum = new StringBuilder();
        StringBuilder sign = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if(Character.isDigit(chars[i]) && flag == 0){
                firstNum.append(chars[i]);
            }else if(Character.isDigit(chars[i]) && flag != 0){
                endNum.append(chars[i]);
            }else {
                flag++;
                sign.append(chars[i]);
            }
        }
        return res(firstNum,endNum,sign);
    }

    public static int res(StringBuilder firstNum,StringBuilder endNum,StringBuilder sign1){
        String sign = sign1.toString();
        if(sign.equals("+")){
            return Integer.parseInt(firstNum.toString()) + Integer.parseInt(endNum.toString());
        }else if(sign.equals("-")){
            return Integer.parseInt(firstNum.toString()) - Integer.parseInt(endNum.toString());
        }else if(sign.equals("*")){
            return Integer.parseInt(firstNum.toString()) * Integer.parseInt(endNum.toString());
        }else if(sign.equals("/")){
            return Integer.parseInt(firstNum.toString()) / Integer.parseInt(endNum.toString());
        }else if(sign.equals("%")){
            return Integer.parseInt(firstNum.toString()) % Integer.parseInt(endNum.toString());
        }else if(sign.equals("sqrt")){
            return (int) Math.sqrt(Double.parseDouble(endNum.toString()));
        }else if(sign.equals("^")){
            return (int) Math.pow(Double.parseDouble(firstNum.toString()), Double.parseDouble(endNum.toString()));
        }else if(sign.equals("ling")){
            return 0;
        }else if(sign.equals("yi")){
            return 1;
        }else if(sign.equals("er")){
            return 2;
        }else if(sign.equals("san")){
            return 3;
        }else if(sign.equals("si")){
            return 4;
        }else if(sign.equals("wu")){
            return 5;
        }else if(sign.equals("liu")){
            return 6;
        }else if(sign.equals("qi")){
            return 7;
        }else if(sign.equals("ba")){
            return 8;
        }else if(sign.equals("jiu")){
            return 9;
        }
        return -1;
    }
}
