package HW_02.task3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Поиск минимального значения ***");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int size = in.nextInt();
        Methods newMethods = new Methods();
        for (int i = 1; i <= size; i++) {
            System.out.print("Введите число №" + i + " : ");
            newMethods.getInteger(in.nextInt());

        }

        newMethods.getMinimum();
    }
}
