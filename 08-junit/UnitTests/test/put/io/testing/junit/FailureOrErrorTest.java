package put.io.testing.junit;

//import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    private Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @org.junit.jupiter.api.Test
    void test1(){   //failure - krzyzyk na zoltym
        int x=2,y=5;
        org.junit.jupiter.api.Assertions.assertEquals(calculator.multiply(x,y),x+y);
    }

    @org.junit.jupiter.api.Test
    void test2(){ //error wykrzyknik na czerwonym
        int x1=6,y1=-5;
        org.junit.jupiter.api.Assertions.assertEquals(calculator.addPositiveNumbers(x1,y1),x1+y1);
    }
    @org.junit.jupiter.api.Test
    void test3(){
        int x=2,y=5;
        try{
            org.junit.jupiter.api.Assertions.assertEquals(calculator.multiply(x,y),x+y);
        }
        catch(Throwable e) {
            e.printStackTrace(System.out);
        }
    }
}