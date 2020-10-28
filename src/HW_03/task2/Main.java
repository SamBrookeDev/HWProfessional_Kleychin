package HW_03.task2;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<City, String> adress = new EnumMap<City, String>(City.class);
        adress.put(City.MOSCOW, "Ivanov's");
        adress.put(City.KIEV, "Petrov's");
        adress.put(City.LONDON, "Abramovich's");

        adress.forEach((k, v) ->
                System.out.println("Город: " + k + ", семья: " + v));

        // Создание HashTable
        Enumeration city;
        Enum tmp;
        Hashtable<City, String> sht = new Hashtable<>(Map.copyOf(adress));
        city = sht.keys();

        while (city.hasMoreElements()) {
            tmp = (Enum) city.nextElement();
            System.out.println(tmp + ": " + sht.get(tmp));

        }


    }
}
