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
        int mortality = 8;
        int birthRate = 17;
        int differenceOfThousandInYear = birthRate - mortality;
        int onYear = 1000;
        int total = 12_000_000;
        int numberX = total / onYear;
        int totalInYear = differenceOfThousandInYear * numberX;
        for (int i = 2023; i<2034; i++){
            total = total + totalInYear;
            System.out.println("Год " + i + ", численность населения составляет " + total);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int total = 0;
        int contribution = 15000;
        double procent = 0.07;
        int month = 0;
        while (total<12_000_000) {
            month++;
            total = (int) (total * procent + total + contribution);
                System.out.println("в " + month + " месяце сумма = " + total);
        }
        System.out.println("Василию потребуется "+month+" месяцев");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int total = 0;
        int contribution = 15000;
        double procent = 0.07;
        int month = 0;
        while (total<12_000_000) {
            month++;
            total = (int) (total * procent + total + contribution);
            if (month % 6 == 0) {
                System.out.println("в " + month + " месяце сумма = " + total);
            }
        }
        System.out.println("Василию потребуется "+month+" месяцев");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int total = 0;
        int contribution = 15000;
        double procent = 0.07;
        int month = 0;
        int monthPerYear = 12;
        int numberOfYear = 9;
        int numberOfMonth = monthPerYear*numberOfYear;
        while (month<numberOfMonth) {
            month++;
            total = (int) (total * procent + total + contribution);
            if (month % 6 == 0) {
                System.out.println("в " + month + " месяце сумма = " + total);
            }
        }
        System.out.println("За "+ numberOfYear + " лет Василий накопит "+ total);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 3;
        int daysInMonth = 31;
        System.out.println("сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет.");
        while (firstFriday<daysInMonth){
            firstFriday = firstFriday+7;
            System.out.println("сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет.");
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
    }
}