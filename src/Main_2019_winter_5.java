import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2021-9-10 - 01:03
 * Created by Salmon
 */
public class Main_2019_winter_5 {
    /**
     * 关于链表题就是
     * 1.首先要把散结点读取到hashmap里
     * 2.以首结点地址为根据查找结点一直到-1，顺序存储到list里;
     * 3.根据题目情况选择新的list，链表或者可变数组，扫描时注意要改变结点地址
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Node> hashMap = new HashMap<>();
        String[] strings = bufferedReader.readLine().split("\\s+");
        String start = strings[0];
        int n = Integer.parseInt(strings[1]);
        int block = Integer.parseInt(strings[2]);
        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split("\\s+");
            Node node = new Node();
            node.adress = s[0];
            node.next = s[2];
            node.data = Integer.parseInt(s[1]);
            hashMap.put(node.adress, node);
        }
        bufferedReader.close();

        List<Node> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Node node = hashMap.get(start);
            list.add(node);
            start = node.next;
            if(start.equals("-1")){
                break;
            }
        }

        int length = list.size();
        List<Node> res = new LinkedList<>();
        String temp = new String();
        for (int i = 0; i < length; i = i + block) { //左指针
            for (int j = i + block - 1; j >= i ; j--) { //右指针
                j = j > (length - 1) ? length - 1 : j;
                Node node = list.get(j);
                if (j == block - 1){
                    node.next = "-1";
                    temp = node.adress;
                }else {
                    node.next = temp;
                    temp = node.adress;
                }
                res.add(0, node);
            }
        }

        for (Node node : res) {
            System.out.println(node);
        }

    }
    static class Node{
        String adress;
        int data;
        String next;

        public String toString(){
            return adress + " " + data + " " + next;
        }
    }
}
