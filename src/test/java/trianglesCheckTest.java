import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class trianglesCheckTest {


    // 1. Testing - floatCheck()

    @Test
    @DisplayName("Valid Inputs Should Return True")
    void testInputCheckValidInputs() {
        assertTrue(trianglesCheck.inputCheck(3, 4, 5));
        assertTrue(trianglesCheck.inputCheck(2.5, 3.5, 5.5));
    }

    @Test
    @DisplayName("Invalid Inputs Should Return False")
    void testInputCheckInValidInputs() {
//        assertFalse(trianglesCheck.inputCheck(0, 3, 4));
        assertFalse(trianglesCheck.inputCheck(0, -3, 4));
    }




    //2. Testing - isValidTriangle()

    @Test
    @DisplayName("Valid Triangle")
    void testValidTriangle() {
        assertTrue(trianglesCheck.isValidTriangle(3, 4, 5));
        assertTrue(trianglesCheck.isValidTriangle(3, 3, 5));
        assertTrue(trianglesCheck.isValidTriangle(3, 3, 3));
        assertTrue(trianglesCheck.isValidTriangle(1000, 2000, 2500));
    }

    @Test
    @DisplayName("InValid Triangle")
    void testInValidTriangle() {
        assertFalse(trianglesCheck.isValidTriangle(0, 0, 0));
        assertFalse(trianglesCheck.isValidTriangle(-3, 5, 7));
        assertFalse(trianglesCheck.isValidTriangle(1, 2, 3));
        assertFalse(trianglesCheck.isValidTriangle(1, 1, 2));
    }

    @Test
    @DisplayName("Valid Scalene Triangle - All Orders")
    void testValidScaleneTriangleAllOrders() {
        assertTrue(trianglesCheck.isValidTriangle(3, 4, 5));
        assertTrue(trianglesCheck.isValidTriangle(3, 5, 4));
        assertTrue(trianglesCheck.isValidTriangle(4, 3, 5));
        assertTrue(trianglesCheck.isValidTriangle(4, 5, 3));
        assertTrue(trianglesCheck.isValidTriangle(5, 3, 4));
        assertTrue(trianglesCheck.isValidTriangle(5, 4, 3));
    }




    //3. Testing - typeofTriangle()

    @Test
    @DisplayName("Identify Scalene Triangle")
    void testTriangleTypeScalene() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        trianglesCheck.typeofTriangle(3, 4, 5);

        String output = outContent.toString().trim();
        assertTrue(output.contains("Scalene Triangle"));
    }
}