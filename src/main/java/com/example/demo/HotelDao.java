package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDao {
    public List<String> fetchAvailableRooms() throws SQLException {
        List<String> availableRooms = new ArrayList<>();
        Connection conn = DriverManager.getConnection("Database");
        Statement statement = conn.createStatement();
        ResultSet result = null;
        while (result.next()) {
            availableRooms.add(result.getString("Room name"));


        }
        return availableRooms;
    }
}
