package dev.omuzalevska.java_loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {

    public static List<String> generateTable(int n) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String line = n + " x " + i + " = " + (n * i);
            table.add(line);
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int: ");
        int n = scanner.nextInt();

        List<String> table = generateTable(n);

        table.forEach(System.out::println);

        scanner.close();
    }
}
