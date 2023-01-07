package test.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CycleTestFor {
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
