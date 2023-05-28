package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Task1");
        int a = 47;
        int b = 13;
        System.out.println("47/13 равно " + a/b + " и " + a%b + " в остатке");
    }

    public static void task2() {
        System.out.println("Task2");
        int a = 99;
        int b = a / 10;
        int c = a % 10;
        System.out.println(b + c);
    }
    public static void task3() {
        System.out.println("Task3");
        int a = 999;
        int b = a / 100;
        int c = (a - b * 100) / 10;
        int d = (a - b * 100 - c * 10) % 10;
        System.out.println(b + c + d);
    }
    public static void task4() {
        System.out.println("Task 4");
        int flowers = 4899;
        int postcard = 157;
        double sale = (flowers+postcard)*0.1;
        System.out.println("Стоимость покупки " + (flowers + postcard - sale) + ", скидка составила " + sale);
    }

    public static void task5() {
        System.out.println("Task5");
        int orangePrise = 73;
        double orangeSale = 15;
        int bananaPrise = 95;
        int champagnePrise = 2870;
        double champagneSale = 50;
        int breadPrise = 27;
        int champignonPrise = 436;
        int whiteMushroomsPrise = 578;
        double whiteMushroomsSale = 5;

        System.out.println("a) " + ((orangePrise - orangePrise * orangeSale / 100) * 10 + 2 * bananaPrise) + " рублей стоимость покупки со скидкой!");
        System.out.println("б) " + ((champagnePrise - champagnePrise * champagneSale / 100) * 7 + breadPrise) + " рублей стоимость покупки со скидкой!");
        System.out.println("в) " + ((whiteMushroomsPrise - whiteMushroomsPrise * whiteMushroomsSale / 100) * 3.75 + 2.5 * champignonPrise) + " рублей стоимость покупки со скидкой!");
    }

    public static void task6() {
        System.out.println("Task6");
        double x = 0.40;
        double y = 0.87;
        System.out.println("11*x+y = " + (11 * x + y));
        System.out.println("(x+10*y)-15*(x/y)= " + ((x + 10 * y) - 15 * (x / y)));
    }
}
