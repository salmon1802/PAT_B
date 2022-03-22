
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @date 2021-9-9 - 15:14
 * Created by Salmon
 */
public class Main_2019_autumn_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            int flag = 0;
            String[] s = bufferedReader.readLine().split("\\s+");
            int decRound = Integer.parseInt(s[0]);
            int sumOfSingle = Integer.parseInt(s[1]);
            StringBuilder createNum1 = new StringBuilder("1");
            StringBuilder createNum2 = new StringBuilder();
            for (int j = 0; j < decRound - 1; j++) {
                createNum1.append(0);
            }
            for (int j = 0; j < decRound; j++) {
                createNum2.append(9);
            }
//            long num1 = Long.parseLong(createNum1.toString());
//            long num2 = Long.parseLong(createNum2.toString());
            int num1 = Integer.parseInt(createNum1.toString());
            int num2 = Integer.parseInt(createNum2.toString());
//            for (long j = num1; j <= num2; j++) {
            for (int j = num1; j <= num2; j++) {
                int sum = sum(j);
                if(sum == sumOfSingle){ //找到了一个可能符合的数A
//                    long temp = j + 1;
                    int temp = j + 1;
                    int n1 = sum(temp); // A + 1后的各位数字之和
//                    BigInteger bigInteger1 = new BigInteger(String.valueOf(n1));
//                    BigInteger bigInteger2 = new BigInteger(String.valueOf(sumOfSingle));
//                    BigInteger maxGongNum = bigInteger1.gcd(bigInteger2);
//                    if(isPrim(maxGongNum.intValue())){
                    if(isPrim(gcd(n1, sumOfSingle))){
                        if(flag == 0){
                            System.out.println("Case " + (i + 1));
                        }
                        flag++;
                        System.out.println(n1 + " " + j);
                    }
                }
            }

            if (flag == 0){
                System.out.println("Case " + (i + 1));
                System.out.println("No Solution");
            }
        }
        bufferedReader.close();
    }

    public static boolean isPrim(int n){
        if(n <= 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int sum(int n){
        int sum = 0;
        String num = String.valueOf(n);
        for (int x = 0; x < num.length(); x++) {
            sum += (num.charAt(x) - '0');
        }
        return sum;
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}
