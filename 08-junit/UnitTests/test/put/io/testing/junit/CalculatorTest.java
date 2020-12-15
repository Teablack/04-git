package put.io.testing.junit;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    private Calculator calculator;

    @org.junit.jupiter.api.BeforeEach //BeforeAll nie powiedzie się , chodzi o statyczność tego new ? ?
    void setup(){
        calculator = new Calculator();
    }
    @org.junit.jupiter.api.Test
    void testAdd(){
        int x=0,y=1,x1=2,y1=3;

        org.junit.jupiter.api.Assertions.assertEquals(calculator.add(x,y),x+y);
        org.junit.jupiter.api.Assertions.assertEquals(calculator.add(x1,y1),x1+y1);
    }
    @org.junit.jupiter.api.Test
    void testMultiply(){
        int x=0,y=1,x1=2,y1=3;

        org.junit.jupiter.api.Assertions.assertEquals(calculator.multiply(x,y),x*y);
        org.junit.jupiter.api.Assertions.assertEquals(calculator.multiply(x1,y1),x1*y1);
    }
    @org.junit.jupiter.api.Test
    void testAddPositiveNumbers(){
        int x=0,y=1,x1=-2,y1=3;

        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, ()->{calculator.addPositiveNumbers(x,y);});
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, ()->{calculator.addPositiveNumbers(x1,y1);});
    }
}