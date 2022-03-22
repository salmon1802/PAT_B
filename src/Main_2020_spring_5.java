import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

/**
 * @date 2021-9-8 - 21:28
 * Created by Salmon
 */
public class Main_2020_spring_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[1]);
        String[] s1 = bufferedReader.readLine().split("\\s+");
        int peopleNum = Integer.parseInt(s1[0]);
        int round = Integer.parseInt(s1[1]);
        hashMap2.put(n1, 1);
        hashMap2.put(n2, 1);
        hashMap1.put(Math.abs(n1 - n2),1);
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        int[][] nums = new int[peopleNum][round];
        for (int i = 0; i < peopleNum; i++) {
            for (int j = 0; j < round; j++) {
                streamTokenizer.nextToken();
                nums[i][j] = (int) streamTokenizer.nval;
            }
        }
        bufferedReader.close();

        boolean[] people = new boolean[peopleNum];
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < peopleNum; j++) {
                if(people[j] == true){ //淘汰的人直接跳过
                    continue;
                }
                if(hashMap2.containsKey(nums[j][i]) || !hashMap1.containsKey(nums[j][i])){
                    System.out.println("Round #" + (i + 1) + ": " + (j + 1) + " is out.");
                    people[j] = true; //淘汰此人;
                }else {
                    createNums(nums[j][i]);
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < peopleNum; i++) {
            if(people[i] == false){
                res.append(" ");
                res.append(i + 1);
            }
        }
        if(!(res.length() == 0)){
            System.out.println("Winner(s):" + res);
        }else {
            System.out.println("No winner.");
        }

    }

    static HashMap<Integer,Integer> hashMap1 = new HashMap<>(); // 差值
    static HashMap<Integer,Integer> hashMap2 = new HashMap<>(); // 已经有过的值
    public static void createNums(int num){
//        List<Integer> list = new ArrayList<>();
//        for (int temp1 : hashMap2.keySet()){
//            list.add(temp1);
//        }
//        for (int key : list) {
//            int temp = Math.abs(key - num);
//            if(!hashMap1.containsKey(temp)){
//                hashMap1.put(temp,1);
//            }
//        }

        Integer[] integers = hashMap2.keySet().toArray(new Integer[0]);

        for (int key : integers) {
            int temp = Math.abs(key - num);
            if(!hashMap1.containsKey(temp)){
                hashMap1.put(temp,1);
            }
        }
        if(!hashMap2.containsKey(num)){
            hashMap2.put(num, 1);
        }
    }
}
