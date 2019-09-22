package task2;

import java.util.ArrayList;
import java.util.List;

public class Skew {
    public static void countSkew(String text) {
        String[] counters = new String[text.length()];
        Integer countG = 0;
        Integer countC = 0;
        String prefix = "";
        for (int i = 1; i < text.length(); i++) {
            prefix = text.substring(0, i);
            char tmp = 'L';
            for (int j = 0; j < i; j++) {
                tmp = prefix.charAt(j);
                switch (tmp) {
                    case 'G':
                        countG = countG + 1;
                        System.out.println(countG);
                        break;
                    case 'C':
                        countC = countC + 1;
                        break;
                    default:
                        break;
                }
            }
            int a = countG - countC;
            String ab = a + "/" + i;
            counters[i] = ab;
            countG = countC = 0;
            System.out.println(counters[i]);
        }
        int tmp = 10000;
        int tmp0 = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < text.length(); i++) {
            String l = counters[i];
            String k = l.split("/")[0];
            String m = l.split("/")[1];
            tmp1 = Integer.parseInt(k);
            tmp2 = Integer.parseInt(m);
            if (tmp1 <= tmp) {
                tmp = tmp1;
                tmp0 = tmp2;
            }
        }
        System.out.println(tmp + " " + tmp0);
    }
}
