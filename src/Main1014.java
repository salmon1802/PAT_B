import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-8 - 21:55
 * Created by Salmon
 */
public class Main1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] string1 = bufferedReader.readLine().split("");
        String[] string2 = bufferedReader.readLine().split("");
        String[] string3 = bufferedReader.readLine().split("");
        String[] string4 = bufferedReader.readLine().split("");
        int flag = 0;
        int flag1 = 0;
        for(int i = 0; i < string1.length && flag != 2; i++) {
            if (string1[i].charAt(0) >= 'A' && string1[i].charAt(0) <= 'Z') {
                if (string1[i].equals(string2[i]) && flag == 0 && (string1[i].charAt(0) >= 'A' && string1[i].charAt(0) <= 'G')) {
                    print1(string1[i]);
                    flag++;
                    continue;
                } else if (string1[i].equals(string2[i]) && flag == 1 && (string1[i].charAt(0) >= 'A' && string1[i].charAt(0) <= 'N')) {
                    System.out.print(string1[i].charAt(0) - 'A' + 10 + ":");
                    flag++;
                    continue;
                }
            }else if (string1[i].charAt(0) >= '0' && string1[i].charAt(0) <= '9' && flag == 1) {
                if(string1[i].equals(string2[i])){
                    System.out.printf("%02d:", string1[i].charAt(0) - '0');
                    flag++;
                }
            }

        }





        for(int i = 0; i < string3.length && flag1 != 1; i++) {
                    if(string3[i].equals(string4[i]) &&
                            (
                                    (string3[i].charAt(0) >= 'A' && string3[i].charAt(0) <= 'Z') ||
                                    (string3[i].charAt(0) >= 'a' && string3[i].charAt(0) <= 'z')
                            )
                    ){
                        System.out.printf("%02d",i);
                        flag1++;
                        break;
                    }
                }

    }




    public static void print1(String s){
        switch (s.charAt(0)){
            case 'A' :
                System.out.print("MON ");break;
            case 'B' :
                System.out.print("TUE ");break;
            case 'C' :
                System.out.print("WED ");break;
            case 'D' :
                System.out.print("THU ");break;
            case 'E' :
                System.out.print("FRI ");break;
            case 'F' :
                System.out.print("SAT ");break;
            case 'G' :
                System.out.print("SUN ");break;
        }

    }

}
