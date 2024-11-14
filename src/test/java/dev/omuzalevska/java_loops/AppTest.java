package dev.omuzalevska.java_loops;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
 
public class AppTest {

    @Test
    public void testMain() {
        
        String input = "5\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(new String[]{});

        String[] expectedLines = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };

        for (String expectedLine : expectedLines) {
            assertThat(outContent.toString(), containsString(expectedLine));
        }
        // String expectedOutputPart1 = "5 x 1 = 5";
        // String expectedOutputPart2 = "5 x 10 = 50";
        // assertThat(outContent.toString(), containsString(expectedOutputPart1));
        // assertThat(outContent.toString(), containsString(expectedOutputPart2));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}