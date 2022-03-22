import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @date 2021-9-6 - 16:17
 * Created by Salmon
 */
public class Main1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        String start = strings[0];
        int n = Integer.parseInt(strings[1]);
        int K = Integer.parseInt(strings[2]);
        List<Node> list1 = new ArrayList<>(); // <K
        List<Node> list2 = new ArrayList<>(); // >k
        List<Node> list3 = new ArrayList<>(); // <0
        List<Node> list = new ArrayList<>();
        HashMap<String,Node> hashMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split("\\s+");
            Node node = new Node();
            node.adress = s[0];
            node.Data = Integer.parseInt(s[1]);
            node.next = s[2];
            hashMap.put(s[0],node);
        }
        bufferedReader.close();

        while (true) {
            list.add(hashMap.get(start));
            start = hashMap.get(start).next;
            if(start.equals("-1")){
                break;
            }
        }

        for (Node node : list){
            if(node.Data > K){
                list2.add(node);
            }else if(node.Data < 0){
                list3.add(node);
            }else {
                list1.add(node);
            }
        }

        List<Node> res = new ArrayList<>();
        for (Node node : list3) {
            res.add(node);
        }
        for (Node node : list1) {
            res.add(node);
        }
        for (Node node : list2) {
            res.add(node);
        }

        for (int i = 0; ; i++) {
            if(i == res.size() - 1){
                res.get(i).next = "-1";
                System.out.println(res.get(i));
                break;
            }
            res.get(i).next = res.get(i + 1).adress;
            System.out.println(res.get(i));
        }




    }

    static class Node{
        String adress;
        int Data;
        String next;

        @Override
        public String toString() {
            return  adress + " " + Data + " " + next;
        }
    }
}
