import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @date 2021-8-13 - 21:10
 * Created by Salmon
 */
public class Main1020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] need = bufferedReader.readLine().split("\\s+");
        String[] store = bufferedReader.readLine().split("\\s+");
        String[] value = bufferedReader.readLine().split("\\s+");
        bufferedReader.close();
        ArrayList<Judge> arrayList = new ArrayList();
        double result = 0;

        for (int i = 0; i < Integer.parseInt(need[0]); i++) {
            Judge judge = new Judge();
            if(Double.parseDouble(store[i]) == 0){
                judge.singleValue = 0;
            }else {
                judge.singleValue = Double.parseDouble(value[i]) / Double.parseDouble(store[i]);
            }
            judge.index = i;
            arrayList.add(judge);
        }

        Collections.sort(arrayList, new Comparator<Judge>() {
            @Override
            public int compare(Judge o1, Judge o2) {
                return (int)((o2.singleValue - o1.singleValue)*10);
            }
        });
        Double temp = Double.parseDouble(need[1]);
        for (int i = 0; i < Integer.parseInt(need[0]); i++) {
            if(temp == 0){
                break;
            }
            Judge judge = arrayList.get(i);
            if(temp >= Double.parseDouble(store[judge.index])){
                result = result + Double.parseDouble(value[judge.index]);
                temp = temp - Double.parseDouble(store[judge.index]);
            }else{
                result = result + temp * judge.singleValue;
                temp = 0.00;
            }
        }
        System.out.printf("%.2f",result);

    }

    static class Judge{
        double singleValue;
        int index;
    }
}
