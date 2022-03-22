import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-8 - 21:28
 * Created by Salmon
 */
public class Main_2020_spring_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            StringBuilder sb1 = new StringBuilder();
            String[] s = bufferedReader.readLine().split("\\s+");
            sb1.append(switchs(s[0]));
            if(s[1].length() <= 2){
                sb1.append(0);
                sb1.append(s[1].charAt(0));
            }else {
                sb1.append(s[1].substring(0,2));
            }
            StringBuilder sb2 = new StringBuilder();
            if(s[2].length() < 4){
                for (int j = 0; j < 4 - s[2].length(); j++){
                    sb2.append(0);
                }
            }
            sb2.append(s[2]);
            String temp = sb1.toString();
            if(sb1.reverse().toString().equals(sb2.toString())){
                System.out.println("Y " + sb2 + temp);
            }else {
                System.out.println("N " + sb2 + temp);
            }
        }
    }

    public static String switchs(String s){
        if(s.equals("Jan")){
            return "01";
        }else if(s.equals("Feb")){
            return "02";
        }else if(s.equals("Mar")){
            return "03";
        }else if(s.equals("Apr")){
            return "04";
        }else if(s.equals("May")){
            return "05";
        }else if(s.equals("Jun")){
            return "06";
        }else if(s.equals("Jul")){
            return "07";
        }else if(s.equals("Aug")){
            return "08";
        }else if(s.equals("Sep")){
            return "09";
        }else if(s.equals("Oct")){
            return "10";
        }else if(s.equals("Nov")){
            return "11";
        }else if(s.equals("Dec")){
            return "12";
        }
        return "-1";
    }
}
