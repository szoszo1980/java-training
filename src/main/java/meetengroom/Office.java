package meetengroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Office {

    private List<MeetingRoom> meetingRooms;

    public Office() {
        meetingRooms = new ArrayList<>();
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public List<String> getNames() {

        var tmp = new ArrayList<String>();

        for (MeetingRoom m : meetingRooms) {
            //System.out.println("Names: " + m.getName());
            tmp.add(m.getName());
        }

        return tmp;
    }

    public List<String> getNamesReseverd() {

        var tmp = new ArrayList<String>();

        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            //System.out.println("Names reserved: " + MeetingRooms.get(i).getName());
            tmp.add(meetingRooms.get(i).getName());
        }

        return tmp;
    }

    public List<String> getEvenNames() {

        var tmp = new ArrayList<String>();

        for (int i = 0; i < meetingRooms.size(); i++) {
            //System.out.println("Names reserved: " + MeetingRooms.get(i).getName());
            if ((i % 2) == 0) {
                tmp.add(meetingRooms.get(i).getName());
            }
        }

        return tmp;
    }

    public Optional<MeetingRoom> findbyName(String name) {
        for (var meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                return Optional.of(meetingRoom);
            }
        }
        return Optional.empty();
    }

    public List<MeetingRoom> findbyNamePart(String part) {

        var result = new ArrayList<MeetingRoom>();

        for (var meetingRoom : meetingRooms) {
            if (meetingRoom.getName().contains(part)) {
                result.add(meetingRoom);
            }
        }
        return result;
    }

}
