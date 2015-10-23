package za.ac.cput.hms.services;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.hms.domain.Room;
import za.ac.cput.hms.services.room.RoomService;
import za.ac.cput.hms.services.room.impl.RoomServiceImpl;

import java.util.List;

/**
 * Created by Andies on 2015-10-23.
 */
public class RoomTest extends TestCase {

    RoomService roomService = new RoomServiceImpl();

    @Test
    public void testReadAll() throws Exception{
        List<Room> rooms = roomService.findAll();
        System.out.println(rooms.get(0).getType());
        Assert.assertNotNull(rooms);
    }

    @Test
    public void testFindOne() throws Exception{
        Room room = roomService.find("2");
        System.out.println(room.getType());
        Assert.assertEquals(room.getType(), "Double");
    }
}
