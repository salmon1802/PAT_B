import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @date 2021-9-8 - 14:21
 * Created by Salmon
 */
public class Main_2021_spring_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Horse> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            Horse horse = new Horse();
            horse.ID = Integer.parseInt(strings[0]);
            horse.distance = Integer.parseInt(strings[1]);
            horse.speed = Integer.parseInt(strings[2]);
            horse.finishTime = horse.distance / horse.speed;
            list.add(horse);
        }
        bufferedReader.close();
        Collections.sort(list, new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                if(o1.finishTime > o2.finishTime){
                    return 1;
                }else if(o1.finishTime < o2.finishTime){
                    return -1;
                }else {
                    return o1.ID - o2.ID;
                }
            }
        });

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            res.append(list.get(i).ID);
            res.append(" ");
        }
        System.out.println(res.toString().trim());
    }

    static class Horse{
        int ID;
        int distance;
        int speed;
        double finishTime;

    }
}
