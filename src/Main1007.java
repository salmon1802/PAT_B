import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @date 2021-8-5 - 21:52
 * Created by Salmon
 */
public class Main1007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int num = 0;
        findAllPrimeNum(n);
        for (int i = 0, j = 1; i < arrayList.size() && j < arrayList.size(); i++,j++) {
                if(arrayList.get(j) - arrayList.get(i) == 2){
                    num++;
                }
        }
        System.out.println(num);

    }

   static ArrayList<Integer> arrayList = new ArrayList();
    public static void findAllPrimeNum(int n){
        for (int i = 1; i < n; i++){
            if(isPrimeNum(i)){
                arrayList.add(i);
            }
        }
    }

    public static boolean isPrimeNum(int n){
        if(n < 2){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
