package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunWayLengthTest {

    @Test

    void runWayLength(){
        RunWayLength length = new RunWayLength();
        length.getVelocitySquare(5);
        assertEquals(25,length.velocitySquare);
    }

    @Test

    void accelerationWay(){
        RunWayLength length = new RunWayLength();
        length.acceleration(5);
    }

    @Test
    void VelocityAcceleration(){
        RunWayLength length = new RunWayLength();
        int calLength = length.velocityAcceleration(4,4 );
        assertEquals(1, calLength);
    }
}
