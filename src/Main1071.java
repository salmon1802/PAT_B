import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @date 2021-9-6 - 14:09
 * Created by Salmon
 */
public class Main1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split("\\s+");
        int money = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        for (int i = 0;i < n; i++) {
            String[] strings = bufferedReader.readLine().split("\\s+");
            int firstNum = Integer.parseInt(strings[0]);
            int playerNum = Integer.parseInt(strings[1]);
            int payMoney = Integer.parseInt(strings[2]);
            int finalNum = Integer.parseInt(strings[3]);
            if(money < payMoney){
                System.out.println("Not enough tokens.  Total = " + money + ".");
                continue;
            }

            if(isWin(firstNum, playerNum, finalNum)){
                money += payMoney;
                System.out.println("Win " + payMoney + "!  Total = " + money + ".");
            }else {
                money -= payMoney;
                System.out.println("Lose " + payMoney + ".  Total = " + money + ".");
            }

            if(money <= 0) {
                System.out.println("Game Over.");
                break;
            }

        }

    }

    public static boolean isWin(int firstNum,int playerNum,int finalNum){
        if(playerNum == 0){
            if(firstNum > finalNum){
                return true;
            }else {
                return false;
            }
        }else {
            if(firstNum < finalNum){
                return true;
            }else {
                return false;
            }
        }
    }
}
