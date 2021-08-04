import java.io.*;
import java.util.*;

/**
 * @date 2021-8-4 - 18:43
 * Created by Salmon
 */
public class Main1004 {
    static class Student{
        String name;
        String number;
        int grade;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Student> list = new ArrayList<>();
        Student MaxGradeStudent = new Student();
        Student MinGradeStudent = new Student();
        for(int i = 0; i < n; i++) {
            String []strings = bufferedReader.readLine().split(" ");
            Student student = new Student();
            student.setName(strings[0]);
            student.setNumber(strings[1]);
            student.setGrade(Integer.parseInt(strings[2]));
            list.add(student);
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGrade() > o2.getGrade()){
                    return -1;
                }else if(o1.getGrade() < o2.getGrade()){
                    return 1;
                }else{
                    return 0;
                }
            }
        });

        System.out.println(list.get(0).getName() + " " + list.get(0).getNumber());
        System.out.println(list.get(list.size() - 1).getName() + " " + list.get(list.size() - 1).getNumber());
    }
}
