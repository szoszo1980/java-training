package meetengroom;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {

    MeetingRoom mr = new MeetingRoom("room",10,10);
    Office office = new Office();


    @Test
    void addMeetingRoom() {
          MeetingRoom m = mr;
          assertEquals(m,mr);
    }

    @Test
    void getNames() {

        office.addMeetingRoom(new MeetingRoom("room1",10,10));
        office.addMeetingRoom(new MeetingRoom("room2",10,10));

        assertEquals(List.of("room1","room2"),office.getNames());
    }

    @Test
    void getNamesReseverd() {

        office.addMeetingRoom(new MeetingRoom("room1",10,10));
        office.addMeetingRoom(new MeetingRoom("room2",10,10));
        office.addMeetingRoom(new MeetingRoom("room3",10,10));

        assertEquals(List.of("room3","room2","room1"),office.getNamesReseverd());
    }

    @Test
    void getEvenNames() {
    }

    @Test
    void findbyName(){
        var result = office.findbyName("room");
        assertEquals(6,result.get().getName());
    }

    @Test
    void notFound(){
        var result = office.findbyName("Rubik ernő");
        assertTrue(result.isEmpty());
    }

    @Test
    void findByPart(){
        var result = office.findbyNamePart("l");
        assertEquals(2,result.size());

        //assertEquals();
    }
}