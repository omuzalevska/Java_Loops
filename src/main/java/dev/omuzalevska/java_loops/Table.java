package dev.omuzalevska.java_loops;

import java.util.ArrayList;
import java.util.List;


public class Table {

    public static List<String> generateTable(int n) {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String line = n + " x " + i + " = " + (n * i);
            table.add(line);
        }
        return table;
    }

}
