package meetengroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {

    MeetingRoom mr = new MeetingRoom("room", 10,10);

    @Test
    void getArea() {
        assertEquals(100,mr.getArea());
    }
}