package HW_02.task3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Methods {
    List<Integer> arrayList = new ArrayList<>();

    public void getInteger(int value) {
        arrayList.add(value);
    }

    public void getMinimum() {
        System.out.println("Минимальное значение равно: " + (Collections.min(arrayList)));

    }
}
