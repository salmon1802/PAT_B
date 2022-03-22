//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;

/**
 * @date 2021-9-6 - 14:42
 * Created by Salmon
 * 这题极度恶心人！！！
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1073 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strs=br.readLine().split(" ");
        int n=Integer.parseInt(strs[0]);
        int m=Integer.parseInt(strs[1]);
        String[] exams=new String[m]; //题目信息
        double[] scores=new double[n];//各个学生的分数
        String[] wrongs=new String[m];//各个题目错误答案集合
        Map<String,Integer> results=new HashMap<>();
        List<String> output=new ArrayList<>();
        for(int i=0;i<wrongs.length;i++) {
            wrongs[i]="";
        }
        for(int i=0;i<m;i++) {
            exams[i]=br.readLine();
        }
        for(int i=0;i<n;i++) {
            String str=br.readLine();
            String[] datas=str.substring(1, str.length()-1).split("\\)\\s+\\(");
            for(int j=0;j<datas.length;j++) {
                String[] exam=exams[j].split(" ");
                String[] data=datas[j].split(" ");
//        		不包含
                if(exams[j].indexOf(datas[j])==-1) {
                    String a="",b="";
                    for(int k=3;k<exam.length;k++) {
                        a+=exam[k];
                    }
                    for(int l=1;l<data.length;l++) {
                        b+=data[l];
                    }
//        			半对
                    if(abDeal(b,a).equals("")) {
                        scores[i]+=Integer.parseInt(exam[0])/2.0;
                    }
                    wrongs[j]+=abDeal(a,b);
                    wrongs[j]+=abDeal(b,a);
                }else {
                    scores[i]+=Integer.parseInt(exam[0]);
                }
            }
            System.out.println(scores[i]);
        }
        for(int i=0;i<wrongs.length;i++) {
            Map<String,Integer> result=getAllCounts(wrongs[i],i+1);
            results.putAll(result);
        }
        int max=0;//最大的value
        for(Integer value:results.values()) {
            if(value>max) {
                max=value;
            }
        }
//        遍历Map集合输出最大value对应的内容
        if(max==0) {
            System.out.println("Too simple");
        }else {
            for(Map.Entry<String, Integer> entry:results.entrySet()) {
                if(entry.getValue()==max) {
                    output.add(entry.getValue()+" "+entry.getKey());
                }
            }
        }
        Collections.sort(output);
        for(int i=0;i<output.size();i++) {
            System.out.println(output.get(i));
        }
    }
    //    获得字符串a中b不存在的字符
    public static String abDeal(String a,String b) {
        String str="";
        for(int i=0;i<a.length();i++) {
            int flag=0;
            for(int j=0;j<b.length();j++) {
                if(b.charAt(j)==a.charAt(i)) {
                    flag=1;
                }
            }
            if(flag==0) {
                str+=a.charAt(i);
            }
        }
        return str;
    }
    //    获得字符串中所有字符的次数
    public static Map<String,Integer> getAllCounts(String str,int index){
        Map<String,Integer> counts=new HashMap<String,Integer>();
        for(int i=0;i<str.length();i++){
            String string=index+"-"+str.charAt(i);
            if(counts.containsKey(string)) {
                counts.put(string, counts.get(string)+1);
            }else {
                counts.put(string, 1);
            }
        }
        return counts;
    }
}

//public class Main1073 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = bufferedReader.readLine().split("\\s+");
//        int n1 = Integer.parseInt(s[0]);
//        int n2 = Integer.parseInt(s[1]);
//        List<Qustion> list = new ArrayList<>();
//        for (int i = 0; i < n2; i++) {
//            HashMap<String,Qustion> hashMap = new HashMap<>();
//            String[] strings = bufferedReader.readLine().split("\\s+");
//            Qustion qustion = new Qustion();
//            qustion.point = Integer.parseInt(strings[0]);
//            qustion.rightNum = Integer.parseInt(strings[2]);
//            qustion.codeNum = i + 1;
//            for (int j = 3; j < strings.length; j++) {
//                qustion.hashMap.put(strings[j],1);
//                qustion.rightChoice += strings[j];
//            }
//            list.add(qustion);
//        }
//
//        List<Mistake> mistakeList = new ArrayList<>();
//        for (int i = 0; i < n2; i++) {
//            Mistake mistake = new Mistake();
//            mistakeList.add(mistake);
//        }
//
//        for (int i = 0; i < n1; i++) { //处理一行
//            double point = 0;
//            String[] strings = bufferedReader.readLine().split("\\) \\(");
//            for (int j = 0; j < strings.length; j++){ //处理一题
//                if(j == 0){
//                    String[] strings1 = strings[j].substring(1).split("\\s+");
//                }else if(j == strings.length - 1){
//                    String[] strings1 = strings[j].substring(0, strings.length).split("\\s+");
//                }
//                String[] strings1 = strings[j].split("\\s+");
//                int rightCount = 0;
//                if(Integer.parseInt(strings1[0]) > list.get(j).rightNum){ //必错
//                    mistakeList.get(j).count++;
//                    mistakeList.get(j).codeNum = list.get(j).codeNum;
//                    mistakeList.get(j).choice = strings1.toString().replace(list.get(j).rightChoice, "");
//                }else { //可能对
//                    for (int x = 1; x < strings1.length; x++) {
//                        if(list.get(j).hashMap.containsKey(strings1[x])){
//                            rightCount++;
//                        }else { //必错
//                            mistakeList.get(j).count++;
//                            mistakeList.get(j).codeNum = list.get(j).codeNum;
//                            mistakeList.get(j).choice = strings1.toString().replace(list.get(j).rightChoice, "");
//                        }
//                    }
//                    if(rightCount == list.get(j).rightNum){ //全对
//                        point += list.get(j).point;
//                    }else { //半对
//                        point += list.get(j).point / 2;
//                        mistakeList.get(j).count++;
//                        mistakeList.get(j).codeNum = list.get(j).codeNum;
//                        mistakeList.get(j).choice = strings1.toString().replace(list.get(j).rightChoice, "");
//                    }
//                }
//            }
//
//            System.out.println(point);
//            for (Mistake mistake: mistakeList){
//                System.out.println(mistake);
//            }
//        }
//
//
//
//    }
//
//
//
//    static class Qustion{
//        int point;
//        int rightNum;
//        int codeNum;
//        String rightChoice;
//        HashMap<String,Integer> hashMap = new HashMap<>();
//    }
//
//    static class Mistake{
//        int count = 0;
//        int codeNum;
//        String choice;
//        @Override
//        public String toString(){
//            return count + " " + codeNum + "-" + choice;
//        }
//    }
//}
