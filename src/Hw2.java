public class Hw2 {
    public static void main(String[] args) {
        System.out.println(summ(5, 5));
        integer(5);
        System.out.println(integer1(25));
        strnum("Katia", 8);
        System.out.println(highyear(2020));
        System.out.println(hyear(2020));
    }

    public static boolean summ(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void integer(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean integer1(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    public static void strnum(String y, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("[" + i + "]" + " " + y);
        }
    }

            public static boolean highyear(int x) {
                if (x % 4 != 0) {
                    return false;
                } else if (x % 400 == 0) {
                    return true;
                } else if (x % 100 == 0) {
                    return false;
                } else {
                    return true;
                }
    }
    public static boolean hyear(int x) {
        if ((x % 4 != 0)&&(x % 400 == 0)&&(x % 100 == 0)) {
            return false;
        } else
            return true;
        }

}
        //Написать метод, который определяет, является ли год високосным,
        //и возвращает boolean (високосный - true, не високосный - false).
        // Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.











