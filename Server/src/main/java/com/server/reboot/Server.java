package com.server.reboot;

import java.sql.*;

public class Server {
    public static Balance getBalanceCard(String cardNum){
        int ammount=0;
        try{
            String url = "jdbc:mysql://localhost:3307/client";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                System.out.println("Connection to DB succesfull!");
                PreparedStatement pr = conn.prepareStatement("select ammount from card where card_num=?");
                pr.setString(1,cardNum);
                ResultSet rs=pr.executeQuery();
                while (rs.next()) {
                    ammount = rs.getInt(1);
                }
                rs.close();
                pr.close();
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
        return new Balance(ammount,Cur.RUR.toString());
    }
}
