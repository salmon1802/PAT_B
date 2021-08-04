import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @date 2021-8-4 - 19:39
 * Created by Salmon
 */
public class Main1005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String []strings = bufferedReader.readLine().split(" ");
        bufferedReader.close();
        int []num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(strings[i]);
            fun(num[i]);
        }

        Arrays.sort(num);
        int flag = 0;
        for(int i = n - 1; i >= 0; i--){
            if(!arrayList.contains(num[i]) && flag == 0){
                System.out.print(num[i]);
                flag = 1;
            }else if(!arrayList.contains(num[i])){
                System.out.print(" " + num[i]);
            }
        }
    }

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void fun(int n) {
            for(int i = 0; n != 1; i++){
                if(n % 2 == 0){
                    n = n / 2;
                    if(!arrayList.contains(n)){
                        arrayList.add(n);
                    }
                }else{
                    n = (3*n + 1) / 2;
                    if(!arrayList.contains(n)){
                        arrayList.add(n);
                    }
                }
            }
    }
}
