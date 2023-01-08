package test.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOnEqualsNumElseIf {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число");
        int num3 = Integer.parseInt(reader.readLine());

        if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) System.out.println(num1);
        else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) System.out.println(num2);
        else if ((num2 < num3 && num3 < num1) || (num1 < num3 && num3 < num2)) System.out.println(num3);
        else if (num1 == num2 && num2 == num3) System.out.println("Все числа равны:  " + num1 + " " + num2 + " " + num3);
        else if (num1 == num2 || num1 == num3) System.out.println("Равное из двух чисел " + num1);
        else if (num2 == num1 || num2 == num3) System.out.println("Равное из двух чисел - " + num2);
        else if (num2 == num1 || num2 == num3) System.out.println("Равное из двух чисел - " + num3);
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