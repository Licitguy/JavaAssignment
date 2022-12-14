package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class BabyTest {

     @Test
     public void requiredArgsConstructorTest(){
         Baby babym = new Baby( 7);
         assertEquals(7, babym.getWeightInkg());
         assertEquals(0, babym.getAge());
         assertEquals(null, babym.getName());

         Baby neddyBaby = new Baby();
         assertEquals(0, neddyBaby.getWeightInkg());
         assertEquals(0, neddyBaby.getAge());
         assertEquals(null, neddyBaby.getName());

         Baby davidJnr = new Baby ("David Junior");
         Baby legendSnr = new Baby( "Legend of the seker",  9);
     }

}