import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

/**
 * @date 2021-9-3 - 21:31
 * Created by Salmon
 */
public class Main1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        HashMap<String,Student> hashMap = new HashMap<>();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            char grade = strings[0].charAt(0);
            int point = Integer.parseInt(strings[1]);
            String school = strings[2].toLowerCase();

            if(!hashMap.containsKey(school)){
                Student student = new Student();
                student.school = school;
                student.peopleNum++;
                calculate(student, grade, point);
                hashMap.put(school, student);
            }else {
                Student student = hashMap.get(school);
                student.peopleNum++;
                calculate(student, grade, point);
                hashMap.put(school, student);
            }

        }
        bufferedReader.close();

        for (String key : hashMap.keySet()){
            list.add(hashMap.get(key));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.finalPoint - o1.finalPoint > 0){
                    return 1;
                }else if(o2.finalPoint - o1.finalPoint < 0){
                    return -1;
                }else {
                    if(o1.peopleNum - o2.peopleNum > 0){
                        return 1;
                    }else if(o1.peopleNum - o2.peopleNum < 0){
                        return -1;
                    }else {
                        int o2X = 0;
                        int o1X = 0;
                        for (int i = 0; i < o1.school.length(); i++){
                            o1X = o1.school.charAt(i) - 'a';
                        }
                        for (int i = 0; i < o2.school.length(); i++){
                            o2X = o2.school.charAt(i) - 'a';
                        }
                        if(o1X - o2X > 0){
                            return 1;
                        }else if(o1X - o2X < 0){
                            return -1;
                        }else {
                            return 0;
                        }
                    }
                }
            }
        });

        int max = -1,i = 1,temp = 0;
        for (Student student : list) {
            if(max == -1){
                max = student.finalPoint;
            }

            if(max == student.finalPoint){
                student.rank = i;
                temp++;
            }else {
                max = student.finalPoint;
                i = i + temp;
                temp = 1;
                student.rank = i;
            }
        }

        System.out.println(list.size());
        for (Student student : list) {
            System.out.println(student);
        }

    }

    static class Student{
        int rank;
        String school;
        int finalPoint = 0;
        int peopleNum = 0;

        @Override
        public String toString() {
            return rank + " " + school + " " + finalPoint + " " + peopleNum;
        }
    }

    static void calculate(Student student, char grade,int point){
        if(grade == 'A'){
            student.finalPoint += point;
        }else if(grade == 'B'){
            student.finalPoint += BigDecimal.valueOf((double)point / 1.5).setScale(0, BigDecimal.ROUND_DOWN).intValue();
        }else {
            student.finalPoint += BigDecimal.valueOf((double)point * 1.5).setScale(0, BigDecimal.ROUND_DOWN).intValue();
        }
    }
}
