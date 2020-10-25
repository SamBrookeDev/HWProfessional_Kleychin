package HW_01.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Один");
        list.add(1, "Два");
        list.add(2, "Три");
        list.add(3, "Четыре");
        list.add(4, "Пять");
        list.add(5, "Шесть");
        list.add(6, "Семь");
        list.add(7, "Восемь");
        list.add(8, "Девять");
        list.add(9, "Десять");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
