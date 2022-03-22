import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @date 2021-9-9 - 22:46
 * Created by Salmon
 */
public class Main_2019_winter_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("");
        int n = s.length;
        int[] sign = new int[6];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(s[i].equals("S")){
                sign[0]++;
                if(sign[0] > max){
                    max = sign[0];
                }
            }else if(s[i].equals("t")){
                sign[1]++;
                if(sign[1] > max){
                    max = sign[1];
                }
            }else if(s[i].equals("r")){
                sign[2]++;
                if(sign[2] > max){
                    max = sign[2];
                }
            }else if(s[i].equals("i")){
                sign[3]++;
                if(sign[3] > max){
                    max = sign[3];
                }
            }else if(s[i].equals("n")){
                sign[4]++;
                if(sign[4] > max){
                    max = sign[4];
                }
            }else if(s[i].equals("g")){
                sign[5]++;
                if(sign[5] > max){
                    max = sign[5];
                }
            }
        }

        int count = 0;
        while (count != max) {
            count++;
            for (int i = 0; i < 6; i++) {
                if(i == 0 && sign[i] != 0){
                    System.out.print("S");
                    sign[i]--;
                }else if(i == 1 && sign[i] != 0){
                    System.out.print("t");
                    sign[i]--;
                }else if(i == 2 && sign[i] != 0){
                    System.out.print("r");
                    sign[i]--;
                }else if(i == 3 && sign[i] != 0){
                    System.out.print("i");
                    sign[i]--;
                }else if(i == 4 && sign[i] != 0){
                    System.out.print("n");
                    sign[i]--;
                }else if(i == 5 && sign[i] != 0){
                    System.out.print("g");
                    sign[i]--;
                }
            }
        }
    }
}
