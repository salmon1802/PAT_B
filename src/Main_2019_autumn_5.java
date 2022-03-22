import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @date 2021-9-9 - 16:02
 * Created by Salmon
 */
public class Main_2019_autumn_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        String L1_Head = s[0];
        String L2_Head = s[1];
        int n = Integer.parseInt(s[2]);
        HashMap<String,Node> nodeHashMap = new HashMap<>();
        List<Node> list1 = new ArrayList<>();
        List<Node> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            Node node = new Node(strings[0],strings[1],strings[2]);
            nodeHashMap.put(node.adress, node);
        }
        bufferedReader.close();

        int list1Length = 0;
        int list2Length = 0;
        for (int i = 0; i < n; i++) {
            Node node1 = nodeHashMap.get(L1_Head);
            Node node2 = nodeHashMap.get(L2_Head);
            if(node1 != null){
                list1.add(node1);
                nodeHashMap.remove(L1_Head);
                L1_Head = node1.next;
                list1Length++;
            }
            if(node2 != null){
                list2.add(node2);
                nodeHashMap.remove(L2_Head);
                L2_Head = node2.next;
                list2Length++;
            }

        }

        List<Node> res = new ArrayList<>();
        if(list1Length > list2Length){
            res = merge(list1, list2, list1Length, list2Length);
        }else {
            res = merge(list2,list1,list2Length, list1Length);
        }

        for (Node node : res) {
            System.out.println(node);
        }


    }

    public static List<Node> merge(List<Node> list1 ,List<Node> list2,int list1Length,int list2Length){
        List<Node> res = new ArrayList<>();
        int sign = 1;
        int index = list2Length - 1;
        for (int i = 0; i < list1Length; i++) {
            if(i == sign && index >= 0){
                sign = sign + 2;
                res.add(list1.get(i));
                Node node = list2.get(index);
                list1.get(i).next = node.adress;
                node.next = i != list1Length - 1 ? list1.get(i + 1).adress : "-1";
                res.add(node);
                index--;
            }else {
                res.add(list1.get(i));
            }
        }
        return res;
    }
    static class Node{
        public Node(String adress, String data, String next) {
            this.adress = adress;
            this.Data = data;
            this.next = next;
        }

        public String toString(){
            return adress + " " + Data + " " + next;
        }

        String adress;
        String Data;
        String next;
    }
}
