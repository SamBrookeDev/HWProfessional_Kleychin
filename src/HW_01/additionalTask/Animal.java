package HW_01.additionalTask;

public class Animal implements Comparable { // <Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {              //    public int compareTo(Animal o) {
        int tmp = this.speed - ((Animal) o).speed; //    int tmp = this.speed - o.speed;
        int tmp1 = this.price - ((Animal) o).price;
        int tmp2 = this.weight - ((Animal) o).weight;
        int tmp3 = this.speed - ((Animal) o).speed;
        int tmp4 = this.breed.compareTo(((Animal)o).breed);


        if (tmp == 0) {
            if (tmp1 == 0) {
                if (tmp2 == 0) {
                    if (tmp3 == 0) {
                        return tmp4;
                    }else {return tmp3;}
                } else {return tmp2;}
            } else {return tmp1;}
        } else {return tmp;}


}}

// Сравнение 2-х строковых значений
// return this.breed.compareTo(((Animal)o).breed);
