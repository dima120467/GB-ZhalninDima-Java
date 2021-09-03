public class HomeWorkApp {

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

    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Положительный результат");
        } else {
            System.out.println("Отрицательный результат");
        }
    }

    public static void printColor() {
        int a = 28;

        if (a <= 0) {
            System.out.println("Красный");
        }
        else if (a >= 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        int a = 28;
        int b = 15;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
