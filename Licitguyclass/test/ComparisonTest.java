import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {
    Comparison comparison;


    @BeforeEach()
        void startAllTestWith(){
        comparison = new Comparison();
    }
    @Test
    void addThreeIntegers(){
        int sum = comparison.addThreeIntegers(2,3,5);
        assertEquals(10,sum);
    }

    @Test
    void findMinimumOfThreeIntegers(){
        assertEquals(3, comparison.findMinimum(3,5,10) );
    }
       @Test
       void findProductofThreeIntegers(){
          assertEquals(24, comparison.findProduct(2,3,4));
       }
       @Test
        void findAverageOfThreeIntegers(){
        assertEquals(4, comparison.findAverage(4,2,3) );
       }
}

