import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @date 2021-8-17 - 18:32
 * Created by Salmon
 */
public class Main1028 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        double maxLiveDay = 2014*365 + 9*30 + 6;
        ArrayList<People> peoples = new ArrayList();
        int isVaild = 0;

        for(int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            People people = new People();
            people.name = strings[0];
            String[] split = strings[1].split("/");
            people.liveDay = maxLiveDay - (Double.parseDouble(split[0])*365 + Double.parseDouble(split[1])*30 + Double.parseDouble(split[2]));
            if(people.liveDay > 200*365 || people.liveDay < 0){

            }else {
                peoples.add(people);
                isVaild++;
            }
        }

        Collections.sort(peoples, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return (int) (o2.liveDay - o1.liveDay);
            }
        });

        if(!peoples.isEmpty()){
            System.out.print(isVaild + " " + peoples.get(0).name + " " + peoples.get(isVaild - 1).name);
        }else {
            System.out.println(isVaild);
        }
    }

    static class People{
        String name;
        double liveDay;
    }
}


