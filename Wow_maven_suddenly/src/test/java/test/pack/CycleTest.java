package test.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CycleTest {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "| ");

            for (int j = 1; j <= 10; j++) {
                int multitab = i * j;
                System.out.print(multitab + " ");
            }
            System.out.println();
        }
    }
}
//    Введи с клавиатуры три числа, выведи на экран среднее из них. Т.е. не самое большое и не самое маленькое.
//        Если все числа равны, выведи любое из них.
//
//        Требования:
//        •	Программа должна считывать числа c клавиатуры.
//        •	Программа должна выводить число на экран.
//        •	Программа должна выводить среднее из трех чисел.
//        •	Если все числа равны, вывести любое из них.
//        •	Если два числа из трех равны, вывести любое из двух.