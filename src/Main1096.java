import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * @date 2021-9-7 - 18:50
 * Created by Salmon
 */
public class Main1096 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int a, b;
        while(in.nextToken() != StreamTokenizer.TT_EOF)
        {
            a = (int)in.nval;
            in.nextToken();
            b = (int)in.nval;
            //out.println(a + b);
            System.out.println("a + b = "+(a+b));
            ArrayList list = new ArrayList();
            Collections.binarySearch(list, 1);
        }
        System.out.println("  sb   ");
        out.flush();
    }
}
