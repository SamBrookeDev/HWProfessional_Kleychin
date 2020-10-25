package HW_02.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*** Удваивание слов ***");
        System.out.println("Требуется ввести пять слов");
        System.out.print("Введите слово №1: ");
        String word1 = in.next();
        System.out.print("Введите слово №2: ");
        String word2 = in.next();
        System.out.print("Введите слово №3: ");
        String word3 = in.next();
        System.out.print("Введите слово №4: ");
        String word4 = in.next();
        System.out.print("Введите слово №5: ");
        String word5 = in.next();

        List<String> list = new ArrayList<>();
        list.add(0, word1);
        list.add(1, word2);
        list.add(2, word3);
        list.add(3, word4);
        list.add(4, word5);

        DoubleWords newList = new DoubleWords();
        newList.doubleValues(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));



    }
}
