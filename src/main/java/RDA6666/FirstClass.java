package RDA6666;

import java.util.List;

public class FirstClass {

    public static void main(String... args) {
        // Целочисленные типы
        // byte aByte = 0; // 8b   -128 + 127
        // short aShort = 0; // 16b -32768 + 32767
        // int aInt = 0; // 32b   (-2^31) .. (+2^31 -1)
        // Integer intWrapper = 0;
        // long aLong = 0L; // 64b

        // Типы с плавающей точкой
        // float aFloat = 0.0F;
        // double aDouble = 0.0;
        // Double doubleWrapper = 9.1;

        // Символьный
        // char aChar = 'a';
        // Character charWrapper = 'a';

        // Логически тип
        // boolean aBoolean = true;
        // Boolean booleanWrapper = true;

        boolean boleanA = true;
        boolean boleanB = false;
        System.out.println("true && false = " + (boleanA && boleanB) );
        System.out.println("true || false = " + (boleanA || boleanB) );
        System.out.println("!true = " + (!boleanA) );

        byte byteA = -127;
        byte byteN = (byte)(byteA - 2); //переполнене byte
        System.out.println(byteN);

        int intA = (int) pow(2,32);
        System.out.println(intA);
        int intN = (int)(intA + 1); //переполнене int
        System.out.println(intN);

        // Строка (и бесконечность других объектных/ссылочных типов)
        // String toBePrint = "Hello world!";
        // List<Integer> teachers = List.of(10, 20);

        // Оператор присвоения =
        // String nameFirst = "Dmitrii";
        // int age = 34;

        // Арифметические операторы + - / * % ++ --
        System.out.println("Упражнения с математическими операторами");
        int numb1 = 3;
        int numb2 = 5;
        System.out.println("3 + 5 = " + (numb1 + numb2) );
        System.out.println("3 - 5 = " + (numb1 - numb2) );
        System.out.println("3 / 5 = " + (numb1 / numb2) );
        System.out.println("3 * 5 = " + (numb1 * numb2) );
        System.out.println("3 % 5 = " + (numb1 % numb2) );
        numb1++;
        System.out.println("3++ = " + (numb1) );
        numb1--;
        System.out.println("4-- = " + (numb1) );

        // Операторы сравнения <, >, >=, <=, !=, ==

        // Логические операторы &, |, &&, ||, !
        System.out.println("Упражнения с логическими операторами");
        System.out.println("true && false = " + (true && false) );
        System.out.println("5 & 3 = " + (5 & 3) );
        System.out.println("true && false = " + (true || false) );
        System.out.println("5 & 3 = " + (5 | 3) );
        System.out.println("!true = " + (!true) );

        // Оператор instanceof
        // System.out.println(nameFirst instanceof String);

        // Тернарный оператор
        char sex = 'm';
        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";

        /* Управляющая конструкция if
        if (sex == 'm') {
            childName = "Valentin";
        } else if (sex == 'w') {
            childName = "Valentina";
        } else {
            System.out.println("((");
        }*/

        /* ключевое слово new
        String name = new String("Dima");*/

    }
}