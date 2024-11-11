package dev.omuzalevska.java_loops;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TableTest {
   
    @Test
    void testGenerateTableFor3() {      
        List<String> expectedOutput = List.of(
                "3 x 1 = 3",
                "3 x 2 = 6",
                "3 x 3 = 9",
                "3 x 4 = 12",
                "3 x 5 = 15",
                "3 x 6 = 18",
                "3 x 7 = 21",
                "3 x 8 = 24",
                "3 x 9 = 27",
                "3 x 10 = 30"
        );
        List<String> actualOutput = Table.generateTable(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testGenerateTableNegative() {
        
        List<String> expectedOutput = List.of(
                "-3 x 1 = -3",
                "-3 x 2 = -6",
                "-3 x 3 = -9",
                "-3 x 4 = -12",
                "-3 x 5 = -15",
                "-3 x 6 = -18",
                "-3 x 7 = -21",
                "-3 x 8 = -24",
                "-3 x 9 = -27",
                "-3 x 10 = -30"
        );
        List<String> actualOutput = Table.generateTable(-3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testGenerateTableZero() {     
        List<String> expectedOutput = List.of(
                "0 x 1 = 0",
                "0 x 2 = 0",
                "0 x 3 = 0",
                "0 x 4 = 0",
                "0 x 5 = 0",
                "0 x 6 = 0",
                "0 x 7 = 0",
                "0 x 8 = 0",
                "0 x 9 = 0",
                "0 x 10 = 0"
        );
        List<String> actualOutput = Table.generateTable(0);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testGenerateTable() {
       
        List<String> result = Table.generateTable(2);
        assertEquals(10, result.size(), "The table should contain 10 rows");
        
        assertEquals("2 x 1 = 2", result.get(0), "Invalid table row for 2 x 1");
        assertEquals("2 x 10 = 20", result.get(9), "Invalid table row for 2 x 10");
        
        result = Table.generateTable(5);
        assertEquals("5 x 1 = 5", result.get(0), "Invalid table row for 5 x 1");
        assertEquals("5 x 10 = 50", result.get(9), "Invalid table row for 5 x 10");
    }
}  
