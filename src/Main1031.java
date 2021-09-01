import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-22 - 18:16
 * Created by Salmon
 */
public class Main1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        char[] checkCode = {'1','0','X','9','8','7','6','5','4','3','2'};
        int[] weightCal = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String rec = bufferedReader.readLine();
            char[] c = rec.substring(0, 17).toCharArray();
            char M = rec.charAt(17);
            int sum = 0;
            int flag = 0;
            for (int j = 0; j < 17; j++) {
                if(c[j] >= '0' && c[j] <= '9'){
                    sum = sum + weightCal[j] * (c[j] - '0');
                }else {
                    flag++;
                    res.append(rec);
                    res.append("\n");
                    break;
                }
            }
            if(flag == 0){
                int z = sum % 11;
                if (checkCode[z] != M){
                    res.append(rec);
                    res.append("\n");
                }
            }
        }

        if(res.toString().isEmpty()){
            System.out.println("All passed");
        }else{
            res.deleteCharAt(res.lastIndexOf("\n"));
            System.out.println(res);
        }
    }

}
