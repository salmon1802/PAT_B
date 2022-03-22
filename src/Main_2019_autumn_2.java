import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021-9-9 - 14:20
 * Created by Salmon
 */
public class Main_2019_autumn_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int indexOfMaxSale = 0;
        int MaxSale = 0;
        int indexOfMaxPeopleNum = 0;
        int MaxPeopleNum = 0;
        List<PTA> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split("\\s+");
            PTA pta = new PTA(s[0],Integer.parseInt(s[1]),Integer.parseInt(s[2]));
            int sale = pta.price * pta.peopleNum;
            if(MaxPeopleNum < pta.peopleNum){
                MaxPeopleNum = pta.peopleNum;
                indexOfMaxPeopleNum = i;
            }
            if(MaxSale < sale){
                MaxSale = sale;
                indexOfMaxSale = i;
            }
            list.add(pta);
        }

        System.out.println(list.get(indexOfMaxPeopleNum).ID + " " + MaxPeopleNum);
        System.out.println(list.get(indexOfMaxSale).ID + " " + MaxSale);
    }

    static class PTA{
        PTA(String ID,int price,int peopleNum){
            this.ID = ID;
            this.price = price;
            this.peopleNum = peopleNum;
        }
        String ID;
        int price;
        int peopleNum;
    }
}
