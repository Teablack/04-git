package put.io.testing.junit;

//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.fail;

class FailureOrErrorTest {

    private Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @org.junit.jupiter.api.Test
    void test1(){   //failure - krzyzyk na zoltym
        fail();
    }

    @org.junit.jupiter.api.Test
    void test2() throws Exception { //error wykrzyknik na czerwonym
        throw new Exception("wyjatek");
    }
    @org.junit.jupiter.api.Test
    void test3(){
        try{
            fail();        }
        catch(Throwable e) {
            e.printStackTrace(System.out);
        }
    }
}