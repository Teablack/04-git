package put.io.testing.audiobooks;

import put.io.testing.audiobooks.Customer;
import put.io.testing.junit.Calculator;

import static org.junit.jupiter.api.Assertions.*;


class AudiobookPriceCalculatorTest {    // it's White Box testing
    private AudiobookPriceCalculator calculator;
    private Audiobook audiobook;

    @org.junit.jupiter.api.BeforeEach
    void setup(){
        audiobook = new Audiobook("Alice in Wonderland", 35.50);
        calculator = new AudiobookPriceCalculator();
    }

//    @org.junit.jupiter.api.Test
//    void test1(){
//        Customer customer = new Customer ("Daria",Customer.LoyaltyLevel.STANDARD, true);
//        org.junit.jupiter.api.Assertions.assertEquals(calculator.calculate(customer,audiobook),0.0);
//    }
//
//    @org.junit.jupiter.api.Test
//    void test2(){
//        Customer customer = new Customer ("Daria",Customer.LoyaltyLevel.GOLD, true);
//        org.junit.jupiter.api.Assertions.assertEquals(calculator.calculate(customer,audiobook),0.0);
//    }

    @org.junit.jupiter.api.Test
    void testCalculateForSubscriber(){
        Customer customer = new Customer ("Daria",Customer.LoyaltyLevel.SILVER, true);
        org.junit.jupiter.api.Assertions.assertEquals(calculator.calculate(customer,audiobook),0.0);
    }

    @org.junit.jupiter.api.Test
    void testCalculateForSilver(){
        Customer customer = new Customer ("Daria",Customer.LoyaltyLevel.SILVER, false);
        org.junit.jupiter.api.Assertions.assertEquals(calculator.calculate(customer,audiobook),0.9 * audiobook.getStartingPrice());
    }
    @org.junit.jupiter.api.Test
    void testCalculateForGold(){
        Customer customer = new Customer ("Daria",Customer.LoyaltyLevel.GOLD, false);
        org.junit.jupiter.api.Assertions.assertEquals(calculator.calculate(customer,audiobook),0.8 * audiobook.getStartingPrice());
    }
    @org.junit.jupiter.api.Test
    void testCalculateForStandard(){
        Customer customer = new Customer ("Daria",Customer.LoyaltyLevel.STANDARD, false);
        org.junit.jupiter.api.Assertions.assertEquals(calculator.calculate(customer,audiobook), audiobook.getStartingPrice());
    }
}