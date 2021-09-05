import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigDecimal;

/**
 * @date 2021-9-4 - 21:50
 * Created by Salmon
 */
public class Main1077 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int fullScore = Integer.parseInt(s[1]);
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int StudentPoint = 0;
            int vaildNum = 0;
            int PointOfTeacher = 0;

            for (int j = 0; j < n; j++) {
                if(j == 0){
                    streamTokenizer.nextToken();
                    PointOfTeacher = (int) streamTokenizer.nval;
                }else {
                    streamTokenizer.nextToken();
                    int temp = (int) streamTokenizer.nval;
                    if(temp < 0 || temp > fullScore){
                        continue;
                    }

                    if(temp > max){
                        max = temp;
                    }
                    if(temp < min){
                        min = temp;
                    }
                    vaildNum++;
                    StudentPoint = StudentPoint + temp;
                }
            }
            double studentPointAverage = (double) (StudentPoint - max - min) / (vaildNum - 2);
            System.out.println(BigDecimal.valueOf((double) (studentPointAverage + PointOfTeacher) / 2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue());
        }
    }
}
