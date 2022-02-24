package com.server.reboot;

import java.sql.*;

public class Server {

    private static Connection conn;
    private static PreparedStatement pr;
    private static ResultSet rs;

    public static Balance getBalanceCard(String cardNum) {
        int ammount = 0;
        try {
            String url = "jdbc:mysql://localhost:3307/client";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connection to DB succesfull!");
                pr = conn.prepareStatement("select ammount from card where card_num=?");
                pr.setString(1, cardNum);
                rs = pr.executeQuery();
                while (rs.next()) {
                    ammount = rs.getInt(1);
                }
            } catch (SQLException ex) {
                System.out.println("Connection failed...");
                System.out.println(ex);
            } finally {
                conn.close();
                pr.close();
                rs.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new Balance(ammount, Cur.RUR.toString());
    }
}
