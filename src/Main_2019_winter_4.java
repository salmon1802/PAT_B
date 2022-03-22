import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2021-9-9 - 23:10
 * Created by Salmon
 */
public class Main_2019_winter_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> list = new LinkedList<>();
        for (int x = 0; x < 26; x++) { //字母数
            String[] strings = new String[7]; //7行
            for (int y = 0; y < 7; y++) { //行数
                strings[y] = bufferedReader.readLine();
            }
            list.add(strings);
        }
        char[] cs = bufferedReader.readLine().toCharArray();
        int length = cs.length;
        int[] order = new int[length]; //字母顺序
        int count = 0;
        for (int i = 0; i < length; i++) {
            if(Character.isAlphabetic(cs[i]) && Character.isUpperCase(cs[i])){
                order[i] = cs[i] - 'A';
            }else {
                order[i] = -1;//表示非大写字母
                count++;
            }
        }
        StringBuilder res = new StringBuilder();

        int flag = 0;
        int temp = 0;
        while (count != 0) {
            for (int i = 0; i < 7; i++) { //行数
                for (int j = temp; j != 12; j++) { //列块数
                    if (order[j] == -1) {
                        int index = res.lastIndexOf(" ");
                        if(index != -1){
                            res.deleteCharAt(index);
                        }
                        if(i == 0){
                            flag++;
                        }
                        res.append("\n");
                        break;
                    }
                    String s = list.get(order[j])[i];
                    res.append(s);
                    res.append(" ");
                    if(i == 0){
                        flag++;
                    }
                }
            }
            temp = flag;
            flag = 0;
            if(count != 1){
                res.append("\n");
                count--;
            }else {
                count--;
            }
        }
        res.deleteCharAt(res.lastIndexOf("\n"));
        System.out.println(res);
    }
}
