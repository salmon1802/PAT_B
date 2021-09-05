import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

/**
 * @date 2021-9-5 - 22:29
 * Created by Salmon
 */
public class Main1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        int n1 = Integer.parseInt(strings[0]);
        int n2 = Integer.parseInt(strings[1]);
        int n3 = Integer.parseInt(strings[2]);
        HashMap<String,Student> hashMap = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            String[] strings1 = bufferedReader.readLine().split("\\s+");
            Student student = new Student();
            student.studyNum = strings1[0];
            student.Gp += Integer.parseInt(strings1[1]);
            hashMap.put(strings1[0],student);
        }
        for (int i = 0; i < n2; i++) {
            String[] strings2 = bufferedReader.readLine().split("\\s+");
            if(hashMap.containsKey(strings2[0])){
                Student student = hashMap.get(strings2[0]);
                student.Gmid_term += Integer.parseInt(strings2[1]);
                hashMap.put(strings2[0],student);
            }else {
                Student student = new Student();
                student.studyNum = strings2[0];
                student.Gmid_term += Integer.parseInt(strings2[1]);
                hashMap.put(strings2[0],student);
            }

        }
        for (int i = 0; i < n3; i++) {
            String[] strings3 = bufferedReader.readLine().split("\\s+");
            if(hashMap.containsKey(strings3[0])){
                Student student = hashMap.get(strings3[0]);
                student.Gfinal += Integer.parseInt(strings3[1]);
                hashMap.put(strings3[0],student);
            }else {
                Student student = new Student();
                student.studyNum = strings3[0];
                student.Gfinal += Integer.parseInt(strings3[1]);
                hashMap.put(strings3[0],student);
            }
        }
        bufferedReader.close();
        List<Student> list = new ArrayList<>();
        for (String key : hashMap.keySet()){
            list.add(hashMap.get(key));
        }

        List<Student> res = new ArrayList<>();
        for (Student student : list){
            if(student.Gp < 200){
                continue;
            }else if(student.Gmid_term > student.Gfinal){
                student.G = BigDecimal.valueOf(student.Gmid_term * 0.4 + student.Gfinal * 0.6).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
            }else {
                student.G = student.Gfinal;
            }

            if (student.Gmid_term == 0){
                student.Gmid_term = -1;
            }

            if(student.G >= 60){
                res.add(student);
            }
        }

        Collections.sort(res, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.G - o1.G > 0){
                    return 1;
                }else if(o2.G - o1.G < 0){
                    return -1;
                }else {
                    int n1 = 0;
                    int n2 = 0;
                    for (int i = 0; i < o1.studyNum.length(); i++) {
                        n1 += o1.studyNum.charAt(i) - '0';
                    }
                    for (int i = 0; i < o2.studyNum.length(); i++) {
                        n2 += o2.studyNum.charAt(i) - '0';
                    }
                    return Integer.compare(n1, n2);
                }
            }
        });

        for (Student student : res) {
            System.out.println(student);
        }


    }

    static class Student{
        String studyNum;
        int Gp = 0;
        int Gmid_term = 0;
        int Gfinal = 0;
        int G = 0;

        @Override
        public String toString() {
            return studyNum + " " + Gp + " " + Gmid_term + " " + Gfinal + " " + G;
        }
    }
}
