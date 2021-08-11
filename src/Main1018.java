import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-8-11 - 21:57
 * Created by Salmon
 */
public class Main1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int Awin = 0;
        int Alose = 0;
        int Aequal = 0;
        int Bwin = 0;
        int Blose = 0;
        int Bequal = 0;
        for (int i = 0; i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            if(aIsWin(strings[0],strings[1]) == 1){
                Awin++;
                Blose++;
                if(strings[0].equals("C")){
                    AwinWithC++;
                }else if(strings[0].equals("B")){
                    AwinWithB++;
                }else if(strings[0].equals("J")){
                    AwinWithJ++;
                }
            }else if(aIsWin(strings[0],strings[1]) == -1){
                Alose++;
                Bwin++;
                if(strings[1].equals("C")){
                    BwinWithC++;
                }else if(strings[1].equals("B")){
                    BwinWithB++;
                }else if(strings[1].equals("J")){
                    BwinWithJ++;
                }
            }else {
                Aequal++;
                Bequal++;
            }
        }

        System.out.println(Awin + " " + Aequal + " " + Alose);
        System.out.println(Bwin + " " + Bequal + " " + Blose);
        print(AwinWithB, AwinWithC, AwinWithJ);
        print(BwinWithB, BwinWithC, BwinWithJ);
        System.out.println(println.toString().trim());
    }

    static int AwinWithC = 0;
    static int AwinWithJ = 0;
    static int AwinWithB = 0;
    static int BwinWithC = 0;
    static int BwinWithJ = 0;
    static int BwinWithB = 0;
    static StringBuffer println = new StringBuffer();
    public static void print(int B,int C,int J){
        if(C > B && C > J){
            println.append("C").append(" ");
        }else if(B > C && B > J){
            println.append("B").append(" ");
        }else if(J > B && J > C){
            println.append("J").append(" ");
        }else if(B == C || B == J){
            println.append("B").append(" ");
        }else if(C == J){
            println.append("C").append(" ");
        }
    }
    public static int aIsWin(String s1,String s2){
        if(s1.equals("C") && s2.equals("J")){
            return 1;
        }else if(s1.equals("J") && s2.equals("B")){
            return 1;
        }else if(s1.equals("B") && s2.equals("C")){
            return 1;
        }else if(s1.equals("B") && s2.equals("B")){
            return 0;
        }else if(s1.equals("J") && s2.equals("J")){
            return 0;
        }else if(s1.equals("C") && s2.equals("C")){
            return 0;
        }
        return -1;
    }
}
