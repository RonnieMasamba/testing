package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookingManagerTest {

    private HotelDao dao;
    private BookingManager bookingManager;

    @Before
     public void setUp(){
        dao = mock(HotelDao.class);
        bookingManager= new BookingManager(dao);
    }

    @Test
    public void checkRoomsAvailable() throws SQLException {
        List<String>roomsAvailable = Arrays.asList("A");
        when(dao.fetchAvailableRooms()).thenReturn(roomsAvailable);
     Assertions.assertTrue(bookingManager.checkAvailbility("A"));
    }
}
