package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        rover = new Rover();
    }

    @Test
    public void shouldFaceNorthAndBeAtZeroZero_WhenReceivingTHeInstructions() {
        assertEquals("0:0:N", rover.execute(""));
    }

    @Test
    public void shouldFaceEast_WhenReceivingOneRAsCommand() {
        assertEquals("0:0:E", rover.execute("R"));
    }

    @Test
    public void shouldFaceSouth_WhenReceivingTwoRsAsCommand() {
        assertEquals("0:0:S", rover.execute("RR"));
    }

    @Test
    public void shouldFaceSouth_WhenReceivingThreeRsAsCommand() {
        assertEquals("0:0:W", rover.execute("RRR"));
    }

    @Test
    public void shouldFaceNorth_WhenReceivingFourRsAsCommand() {
        assertEquals("0:0:N", rover.execute("RRRR"));
    }

    @Test
    public void shouldFaceWest_WhenReceivingOneLAsCommand() {
        assertEquals("0:0:W", rover.execute("L"));
    }

    @Test
    public void shouldFaceSouth_WhenReceivingTwoLAsCommand() {
        assertEquals("0:0:S", rover.execute("LL"));
    }

    @Test
    public void shouldFaceEast_WhenReceivingThreeLAsCommand() {
        assertEquals("0:0:E", rover.execute("LLL"));
    }

    @Test
    public void shouldFaceNorth_WhenReceivingFourLAsCommand() {
        assertEquals("0:0:N", rover.execute("LLLL"));
    }
}
