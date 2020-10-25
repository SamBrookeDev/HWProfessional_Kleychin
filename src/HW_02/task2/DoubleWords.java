package HW_02.task2;

import java.util.ArrayList;
import java.util.List;

public class DoubleWords {

    public void doubleValues(String a, String b, String c, String d, String e) {
        List<String> listOfDouble = new ArrayList<>();
        listOfDouble.add(0, (a + ", " + a));
        listOfDouble.add(1, (b + ", " + b));
        listOfDouble.add(2, (c + ", " + c));
        listOfDouble.add(3, (d + ", " + d));
        listOfDouble.add(4, (e + ", " + e));

        for (int i = 0; i < listOfDouble.size() ; i++) {
            System.out.println(listOfDouble.get(i));
        }

    }
}
