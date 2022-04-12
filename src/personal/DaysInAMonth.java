package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DaysInAMonth {
    public static int getDup(String[] r) {

        ArrayList<String> list = new ArrayList<>();

        int count = 0;

        list.addAll(Arrays.asList(r));

        for (int i = 0; i < r.length; i++){

            for (int j = 0; j < list.size(); j++){

                if (r[i] == list.get(j)){
                    count++;
                }

            }

        }

        System.out.println(list);

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));


    }
}
