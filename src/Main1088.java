import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-31 - 21:46
 * Created by Salmon
 */
public class Main1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int M = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);
        int Y = Integer.parseInt(s[2]);
        int A = -1,B = 0;
        double C = 0;
        for(int a = 10 ; a <= 99; a++){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder = stringBuilder.append(a).reverse();
            if(stringBuilder.charAt(0) == '0'){
                stringBuilder.deleteCharAt(0);
            }
            int b = Integer.parseInt(stringBuilder.toString());
            if(Math.abs(a - b) ==  ((double) X / Y) * b){
                A = a;
                B = b;
                C = B / Y;
            }
        }

        if(A == -1){
            System.out.println("No Solution");
        }else {
            System.out.print(A + " ");
            System.out.print(A > M ? "Cong " : A == M ? "Ping " : "Gai ");
            System.out.print(B > M ? "Cong " : B == M ? "Ping " : "Gai ");
            System.out.print(C > M ? "Cong" : C == M ? "Ping" : "Gai");

        }


    }


}
