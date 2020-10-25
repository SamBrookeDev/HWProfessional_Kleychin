package HW_01.additionalTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 11, 25, 5000);
        Animal dog = new Animal("Labrador", 11, 25, 5000);
        Animal bird = new Animal("King Penguin", 11, 25, 5000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
