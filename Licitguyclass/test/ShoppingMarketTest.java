
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.SuperMarket;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShoppingMarketTest {

    @Test
    public void CheckResult() {
        //given that i a pounds value of 5
        double pounds = 5;

        //when i want to convert pounds to kilogram
        double kilogram = pounds * 0.454;

        //check that result is 2.27
        assertEquals(2.27, kilogram);
    }









//    @BeforeEach

//    @Test
//    public void CheckResult(){
//       //given that i have supermarket
//        SuperMarket market = new SuperMarket();
//       //when user buy something
//       //check that


//




    }
}

