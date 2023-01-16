package com.example.demo;

import java.sql.SQLException;
import java.util.List;

public class BookingManager {

    private HotelDao hotelDao;

    public BookingManager(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }
    public boolean checkAvailbility(String roomName)throws SQLException{
        List<String>roomsAvailable =hotelDao.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }
}
