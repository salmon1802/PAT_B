import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

/**
 * @date 2021-8-15 - 21:18
 * Created by Salmon
 */
public class Main1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        String nowAdress = s[0];
        int n = Integer.parseInt(s[1]);
        int revNum = Integer.parseInt(s[2]);
        //v1
//        ArrayList<Node> list = new ArrayList();
//        for (int i = 0; i < n; i++) { //读取结点
//            String[] strings = bufferedReader.readLine().split("\\s+");
//            Node node = new Node();
//            node.adress = strings[0];
//            node.Data = Long.parseLong(strings[1]);
//            node.next = strings[2];
//            list.add(node);
//        }
//        bufferedReader.close();
//
//        ArrayList<Node> list2 = new ArrayList(); //排序好的结点
//        for (int i = 0; i < list.size(); i++) {
//            int isFind = 0;
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(j).adress.equals(nowAdress)){
//                    list.get(j).order = i + 1;
//                    list2.add(list.get(j));
//                    nowAdress = list.get(j).next;
//                    isFind++;
//                    break;
//                }
//            }
//            if(isFind != 1){
//                break;
//            }
//        }
    //v2
        HashMap<String, Node> hashMap = new HashMap<String, Node>();
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            Node node = new Node();
            node.adress = strings[0];
            node.Data = Long.parseLong(strings[1]);
            node.next = strings[2];
            hashMap.put(node.adress,node);
        }
        ArrayList<Node> list2 = new ArrayList();
        while (!nowAdress.equals("-1")){
            Node node = hashMap.get(nowAdress);
            list2.add(node);
            nowAdress = node.next;
        }


        if(n / revNum == 0){
            for(Node node : list2){
                System.out.println(node.toString());
            }
        }else {
            ArrayList<Node> list1 = new ArrayList<>();
            for(int i = 0; i < (list2.size() / revNum) *revNum; i = i + revNum) {
                for(int j = i + revNum - 1; j >= i; j--) {
                    list1.add(list2.get(j));
                }
            }

            for(int i = (list2.size() / revNum) *revNum; i < list2.size(); i++){
                list1.add(list2.get(i));
            }
            if(n % revNum == 0){
                for(int i = 0; i < list2.size() - 1; i++){
                    list1.get(i).next = list1.get(i + 1).adress;
                }
            }else{
                for(int i = 0; i < (list2.size() / revNum) *revNum; i++){
                    list1.get(i).next = list1.get(i + 1).adress;
                }
            }

            for(Node node : list1){
                System.out.println(node.toString());
            }
        }

    }
}

class Node{
    String adress;
    long Data;
    long order;
    String next;

    @Override
    public String toString() {
        return  adress + " " + Data + " " + next;
    }
}
