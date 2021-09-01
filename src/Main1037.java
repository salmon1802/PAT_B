import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @date 2021-8-30 - 17:49
 * Created by Salmon
 */
public class Main1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        String[] s1 = strings[0].split("\\."); //应付的钱
        String[] s2 = strings[1].split("\\."); //付的钱
        bufferedReader.close();

        long pay1 = Long.parseLong(s1[0])*17*29 + Long.parseLong(s1[1])*29 + Long.parseLong(s1[2]);
        long pay2 = Long.parseLong(s2[0])*17*29 + Long.parseLong(s2[1])*29 + Long.parseLong(s2[2]);
        long pay = pay2 - pay1;
        StringBuilder res = new StringBuilder();
        if(pay < 0){
            pay = -pay;
            res.append("-");
            res.append(pay / (17*29));
            res.append(".");
            res.append((pay % (17*29)) / 29);
            res.append(".");
            res.append((pay % (17*29)) % 29);
        }else {
            res.append(pay / (17*29));
            res.append(".");
            res.append((pay % (17*29)) / 29);
            res.append(".");
            res.append((pay % (17*29)) % 29);
        }
        System.out.println(res);
    }
}
