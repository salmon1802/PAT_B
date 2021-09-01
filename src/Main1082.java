import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @date 2021-9-1 - 22:35
 * Created by Salmon
 */
public class Main1082 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<People> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split("\\s+");
            String ID = s[0];
            int x = Integer.parseInt(s[1]);
            int y = Integer.parseInt(s[2]);
            People people = new People();
            people.ID = ID;
            people.score =  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            list.add(people);
        }
        bufferedReader.close();
        Collections.sort(list, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Double.compare(o2.score, o1.score);
            }
        });
        System.out.print(list.get(n - 1).ID + " ");
        System.out.println(list.get(0).ID);
    }

    static class People{
        String ID;
        double score;
    }
}
