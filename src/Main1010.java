import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split("\\s+");
        String result = "";

        for (int i = 0; i < strings.length; i = i + 2) {
            int first = Integer.parseInt(strings[i]);
            int second = Integer.parseInt(strings[i + 1]);
            if (first == 0 && second == 0) {
                result += "0 0 ";
            } else if (first != 0 && second == 0) {

            } else {
                result += (first * second) + " " + (second - 1) + " ";
            }
        }
        if (result.equals("")) {
            result = "0 0";
        }
        System.out.println(result.trim());
    }
}