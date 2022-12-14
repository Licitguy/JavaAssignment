package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class AirConditionerTest {
       @Test
 public void ProductName() {
           //given that i have an Ac
           AirConditioner ac = new AirConditioner();
           //what's the name of the Ac
           ac.setProductName("gogo");
           //check name
           assertEquals("gogo",ac.getProductName());

       }
}