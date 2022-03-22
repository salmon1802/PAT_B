    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    /**
     * @date 2021-9-9 - 22:11
     * Created by Salmon
     */
    public class Main_2019_winter_1 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine());
            int[] ints = new int[n];
            ints[0] = 2;
            ints[1] = 0;
            ints[2] = 1;
            ints[3] = 9;
            for (int i = 4; i < n; i++) {
               create(ints, i);
            }
            for (int i : ints){
                System.out.print(i);
            }

        }
        static void create(int nums[],int index){
            int startIndex = index - 4;
            int sum = 0;
            for (int i = startIndex ; i < index; i++) {
                sum += nums[i];
            }
            String s = String.valueOf(sum);
            int sLength = s.length();
            nums[index] = s.charAt(sLength - 1) - '0';
        }

    }
