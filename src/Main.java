public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int inMonth = 15000;
        int total = 0;
        int month = 1;
        while (total<2_459_000){
            total = total + total/100;
            total = total + inMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month = month + 1;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (; i>0; i--){
            System.out.print(i+" ");
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
    }

    public static void task4 () {
        System.out.println("Задача 4");
    }
    public static void task5 () {
        System.out.println("Задача 5");
    }

    public static void task6 () {
        System.out.println("Задача 6");
    }
    public static void task7 () {
        System.out.println("Задача 7");
    }

    public static void task8 () {
        System.out.println("Задача 8");
    }
}