package ru.geekbrains.lesson1;

public class Main {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        System.out.println(calculateVal(1, 2, 10, 5));
        System.out.println(checkSumm(5,2));
        System.out.println(checkPosNum(-12));
        System.out.println(checkNegNum(-12));
        sayHello("Виталий");
        checkYear(2000);
    }
    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    byte byteA = 12;
    short shortB = 1200;
    int intC = 12000000;
    long longD = -1200000000L;
    float floatE = -12.12f;
    double doubleF = 12.1212;
    char charG = 'B';
    boolean booleanH = true;


    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int calculateVal (int a, int b, int c, int d) {

        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean checkSumm (int a, int b) {

        boolean checker;

        if (( a+b > 10) && (a + b <= 20)) {
            checker = true;
            return checker;
        }
        else {
            checker = false;
            return checker;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static String checkPosNum (int a) {

        String num;

        if (a > 0) {
            num = "Положительное";
            return num;
        }
        else {
            num = "Отрицательное";
            return num;
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean checkNegNum (int a) {

        boolean num;

        if (a < 0) {
            num = true;
            return num;
        }
        else {
            num = false;
            return num;
        }
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void sayHello (String name) {

        System.out.println("Привет, " + name + "!");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkYear (int year) {

        if (year%400 == 0) {
            System.out.println(year + " год - високосный!");
        }
        else if (year%100 == 0) {
            System.out.println(year + " год - невисокосный!");
        }
        else if (year%4 == 0) {
            System.out.println(year + " год - високосный!");
        }
        else {
            System.out.println(year + " год - невисокосный!");
        }
    }



}



