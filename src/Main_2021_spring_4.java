import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021-9-8 - 14:21
 * Created by Salmon
 */
public class Main_2021_spring_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int num = Integer.parseInt(s[1]);
        createPrimeNum(num);

        int index = list.size() - 1;
        int flag1 = 0;
            for (int i = index; i >= 0; i--) {
                int errand = 0;
                int flag = 0;
                int count = 0;
                StringBuilder res = new StringBuilder();
                res.append(list.get(i));
                res.append(" ");
                for (int j = i - 1; j >= 0; j--) {
                    if(flag == 0){
                        errand = list.get(i) - list.get(j);
                        flag++;
                        count++;
                        res.append(list.get(j));
                        res.append(" ");
                    }
                    if(list.get(i) - list.get(j) == errand*count){
                        count++;
                        res.append(list.get(j));
                        res.append(" ");
                    }else if(list.get(j) < list.get(i) - errand*count){

                    }
                    if(count > n){
                        break;
                    }
                }
                if(count == n){
                    System.out.println(res.toString().trim());
                    flag1++;
                    break;
                }
            }

            if(flag1 == 0){
                System.out.println(list.get(index));
            }

    }

    static List<Integer> list = new ArrayList<>();
    public static void createPrimeNum(int num){
        for (int i = 2; i < num; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
