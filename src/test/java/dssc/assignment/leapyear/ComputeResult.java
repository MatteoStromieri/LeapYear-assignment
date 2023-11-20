package dssc.assignment.leapyear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeResult {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    void given_1_prints_false(){
        new LeapYear().print(1);
        assertEquals("False",outputStreamCaptor.toString().replaceAll("[\\n\\r]", ""));
    }
}
