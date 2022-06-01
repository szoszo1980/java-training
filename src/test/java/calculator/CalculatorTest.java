package calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Teszt osztály
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void Init(){
        calculator = new Calculator();
    }

//teszteset
    @Test
    void add() {
        // BDD: behaviour driven design
        // given - when  - then (assert)
        //GIVEN
        //Calculator calculator = new Calculator();//GIVEN
        // WHEN
        int result = calculator.add(5,6);
        // then
        assertEquals(11,result);
        assertEquals(11,new Calculator().add(5,6));
    }

    @Test
    void test_add_negative_numbers(){
        assertEquals(-3,new Calculator().add(-5,-6));
    }

    @Test
    void test_mul() {
        assertEquals(0.3,new Calculator().mul(0.1,3), 0.005);
    }
}