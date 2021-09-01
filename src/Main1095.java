import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @date 2021-8-20 - 19:51
 * Created by Salmon
 */
public class Main1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        streamTokenizer.nextToken();
        int N = (int) streamTokenizer.nval; //人数
        streamTokenizer.nextToken();
        int M = (int) streamTokenizer.nval; //指令个数
        for (int i = 0; i < N; i++) {
            Student student = new Student();
            streamTokenizer.nextToken();
            String string = streamTokenizer.sval;
            student.firstWordId = string.substring(0, 1);
            student.roomNum = string.substring(1, 4);
            student.Date = string.substring(4,10);
            student.ID = string.substring(1);
            streamTokenizer.nextToken();
            student.grade = (int) streamTokenizer.nval;
            list.add(student);
        }

        for (int i = 1 ; i <= M; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            int type = Integer.parseInt(strings[0]);
            String s = strings[1];
            System.out.println("Case " + i + ": " + type + " " + s);
            if(type == 1){
                Case_1(s);
            }else if(type == 2){
                Case_2(s);
            }else if(type == 3){
                Case_3(s);
            }
        }

        bufferedReader.close();


    }

    static ArrayList<Student> list = new ArrayList();

    static public void Case_1(String s){
        ArrayList<Student> list1 = new ArrayList<>();
        for (Student student : list){
            if(student.firstWordId.equals(s)){
                list1.add(student);
            }
        }
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               if(o2.grade > o1.grade){
                   return 1;
               }else if(o2.grade < o1.grade){
                   return -1;
               }else {
                   return (int) (Long.parseLong(o1.ID) - Long.parseLong(o2.ID));
               }
            }
        });

        if(list1.isEmpty()){
            System.out.println("NA");
        }else{
            for (Student student : list1){
                System.out.println(student);
            }
        }
    }
    static public void Case_2(String s){
        int i = 0,sum = 0;
        for (Student student : list){
            if(student.roomNum.equals(s)){
                i++;
                sum = sum + student.grade;
            }
        }
        if(i == 0){
            System.out.println("NA");
        }else{
            System.out.println(i + " " + sum);
        }
    }

    static public void Case_3(String s){
        ArrayList<roomAndCount> roomAndCounts = new ArrayList<>();
        int i = 0;
        for (Student student : list){
            int flag = 0;
            if(student.Date.equals(s)){ //符合考试日期一致的条件
                for(int j = 0; j < roomAndCounts.size(); j++){
                    if(roomAndCounts.get(j).room.equals(student.roomNum)){ //还符合考试教室一致的条件
                        roomAndCounts.get(j).count++;
                        flag++;
                        break;
                    }
                }
                if(flag == 0){ //没有找到
                    roomAndCount roomAndCount = new roomAndCount();
                    roomAndCount.room = student.roomNum;
                    roomAndCount.count = 1;
                    roomAndCounts.add(roomAndCount);
                }
            }
        }

        if(roomAndCounts.isEmpty()){
            System.out.println("NA");
        }else{
            Collections.sort(roomAndCounts, new Comparator<roomAndCount>() {
                @Override
                public int compare(roomAndCount o1, roomAndCount o2) {
                    if(o2.count > o1.count){
                        return 1;
                    }else if(o2.count < o1.count){
                        return -1;
                    }else {
                        return Integer.parseInt(o1.room) - Integer.parseInt(o2.room);
                    }
                }
            });

            for (roomAndCount roomAndCount : roomAndCounts){
                System.out.println(roomAndCount.room + " " + roomAndCount.count);
            }
        }
    }

    static class roomAndCount{
        String room;
        int count;
    }
    static class Student{
        String firstWordId;
        String roomNum;
        String Date;
        String ID;
        int grade;

        @Override
        public String toString() {
            return firstWordId + ID + " " + grade;
        }
    }
}


