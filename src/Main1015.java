import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @date 2021-8-10 - 21:38
 * Created by Salmon
 * 2,3,4测试点怎么都过不了
 * 我是傻逼
 */
public class Main1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int low = Integer.parseInt(strings[1]);
        int high = Integer.parseInt(strings[2]);
        int n = 0;
        ArrayList<Student> student1 = new ArrayList<>();
        ArrayList<Student> student2 = new ArrayList<>();
        ArrayList<Student> student3 = new ArrayList<>();
        ArrayList<Student> student4 = new ArrayList<>();
        for(int i = 0; i < Integer.parseInt(strings[0]); i++){
            String[] s = bufferedReader.readLine().split("\\s+");
            int morality = Integer.parseInt(s[1]);
            int intell = Integer.parseInt(s[2]);
//            Student student = new Student();
//            student.setNumber(Integer.parseInt(s[0]));
//            student.setMorality(Integer.parseInt(s[1]));
//            student.setIntell(Integer.parseInt(s[2]));
//            student.setTotal(Integer.parseInt(s[1]) + Integer.parseInt(s[2]));

//            if(student.morality >= low && student.intell >= low){
            if(morality >= low && intell >= low){
                if(morality >= high && intell >= high){
                    Student student = new Student();
                    student.setNumber(Integer.parseInt(s[0]));
                    student.setMorality(Integer.parseInt(s[1]));
                    student.setIntell(Integer.parseInt(s[2]));
                    student.setTotal(Integer.parseInt(s[1]) + Integer.parseInt(s[2]));
                    student1.add(student);
                    n++;
                }else if(morality >= high && intell < high ){
                    Student student = new Student();
                    student.setNumber(Integer.parseInt(s[0]));
                    student.setMorality(Integer.parseInt(s[1]));
                    student.setIntell(Integer.parseInt(s[2]));
                    student.setTotal(Integer.parseInt(s[1]) + Integer.parseInt(s[2]));
                    student2.add(student);
                    n++;
                }else if((morality < high && intell < high) && (morality > intell)){
                    Student student = new Student();
                    student.setNumber(Integer.parseInt(s[0]));
                    student.setMorality(Integer.parseInt(s[1]));
                    student.setIntell(Integer.parseInt(s[2]));
                    student.setTotal(Integer.parseInt(s[1]) + Integer.parseInt(s[2]));
                    student3.add(student);
                    n++;
                }else {
                    Student student = new Student();
                    student.setNumber(Integer.parseInt(s[0]));
                    student.setMorality(Integer.parseInt(s[1]));
                    student.setIntell(Integer.parseInt(s[2]));
                    student.setTotal(Integer.parseInt(s[1]) + Integer.parseInt(s[2]));
                    student4.add(student);
                    n++;
                }
            }

        }


        Collections.sort(student1,new StudentCompare());
        Collections.sort(student2,new StudentCompare());
        Collections.sort(student3,new StudentCompare());
        Collections.sort(student4,new StudentCompare());



        pw.println(n);
        pw.flush();
        for(Student student : student1){
            //    System.out.println(student.number + " " + student.morality + " " + student.intell);
            pw.println(student.number + " " + student.morality + " " + student.intell);
            pw.flush();
        }
        for(Student student : student2){
            //    System.out.println(student.number + " " + student.morality + " " + student.intell);
            pw.println(student.number + " " + student.morality + " " + student.intell);
            pw.flush();
        }
        for(Student student : student3){
            //    System.out.println(student.number + " " + student.morality + " " + student.intell);
            pw.println(student.number + " " + student.morality + " " + student.intell);
            pw.flush();
        }
        for(Student student : student4){
            //    System.out.println(student.number + " " + student.morality + " " + student.intell);
            pw.println(student.number + " " + student.morality + " " + student.intell);
            pw.flush();
        }

    }

   static class Student{
        int number;
        int morality;
        int intell;
        int total;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getMorality() {
            return morality;
        }

        public void setMorality(int morality) {
            this.morality = morality;
        }

        public int getIntell() {
            return intell;
        }

        public void setIntell(int intell) {
            this.intell = intell;
        }
    }

   static class StudentCompare implements Comparator<Student>{

        public int compare(Student o1, Student o2) {
            if(o1.getTotal() == o2.getTotal()){
                if(o1.getMorality() == o2.getMorality()){
                    return o1.getNumber() - o2.getNumber();
                }else {
                    return o2.getMorality() - o1.getMorality();
                }
            }
            return o2.getTotal() - o1.getTotal();
        }
    }

}





