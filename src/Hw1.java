public class Hw1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign( ){
        int b = 6;
        int a = 5;
        int sum =a+b;
        if (sum <=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная1");
        }
    }

    public static void printColor() {
        int value =580;
        if (value <= 0){
            System.out.println("Красны");
        }
        else if (value >= 0 && value<=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 53;
        int b = 43;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
