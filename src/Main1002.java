import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-1 - 22:33
 * Created by Salmon
 */
public class Main1002 {
    static String a[] = new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //读入输入到字符串
        String sNum = bufferedReader.readLine();
        //字符串转换为字符数组
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i < cNum.length; i++){
            //字符数组的各个元素转换成int值，算出sum
            sum = sum + (cNum[i] - '0');
        }
        //再次转换为字符串
        String sSum = String.valueOf(sum);
        System.out.print(a[sSum.charAt(0) - '0']);
        for(int i = 1; i < sSum.length(); i++){
            System.out.print(" " + a[sSum.charAt(i) - '0']);
        }
    }
}
