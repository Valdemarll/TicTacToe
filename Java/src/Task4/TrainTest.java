package Task4;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrainTest {
    @Test
    public void testTrain(){
        Locomotive locomotive = new Locomotive(4);
        BuffetWagon buffetWagon = new BuffetWagon();
        CoupeWagon coupeWagon = new CoupeWagon(20);
        Plackart plackart = new Plackart(40);

        assertEquals(4, locomotive.passengerCount);
        assertEquals(20, coupeWagon.passengerCount);
        assertEquals(40, plackart.passengerCount);

        Wagon[] wagons = {locomotive, buffetWagon, coupeWagon, coupeWagon, plackart, plackart};
        Train train = new Train(wagons);

        assertEquals(124, train.allPassengerCount());
        assertEquals(120, train.trainPassengerCount());
        assertEquals(40, train.coupePassengerCount());
        assertEquals(80, train.plackartPassengerCount());
        assertEquals(4, train.staffPassengerCount());
    }
}