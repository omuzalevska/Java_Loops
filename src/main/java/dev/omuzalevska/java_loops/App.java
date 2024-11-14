package dev.omuzalevska.java_loops;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int: ");
        int n = scanner.nextInt();

        List<String> table = Table.generateTable(n);

        table.forEach(System.out::println);

        scanner.close();
    }
}
