import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_2021_spring_5 { //这题不需要怎么关心何时进入，要关心何时出去
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        List<Schedule> list = new ArrayList<Schedule>();
        for (int i = 0; i < N; i++) {
            String[] array = in.readLine().split(" ");
            String[] startTime = array[0].split(":");
            String[] endTime = array[1].split(":");
            // 开始时间和结束时间都转换为秒数方便计算
            int start = Integer.parseInt(startTime[0]) * 3600 + Integer.parseInt(startTime[1]) * 60
                    + Integer.parseInt(startTime[0]);
            int end = Integer.parseInt(endTime[0]) * 3600 + Integer.parseInt(endTime[1]) * 60
                    + Integer.parseInt(endTime[0]);
            list.add(new Schedule(start, end, i + 1));
        }
        Collections.sort(list);
        // 默认最早开始的那一个排入档期
        int cnt = 1;
        int lastEndTime = list.get(0).end;
        int size = list.size();
        for (int i = 1; i < size; i++) {
            Schedule x = list.get(i);
            // 如果上一次的结束时间小于等于当前的开始时间就排入档期
            if (lastEndTime <= x.start) {
                cnt++;
                lastEndTime = x.end;
            }
        }
        System.out.println(cnt);
    }
    static class Schedule implements Comparable<Schedule> {
        public int start;
        public int end;
        int data;

        public Schedule(int start, int end, int data) {
            super();
            this.start = start;
            this.end = end;
            this.data = data;
        }

        // 按结束时间升序
        @Override
        public int compareTo(Schedule o) {
            return this.end - o.end;
        }
    }
}

