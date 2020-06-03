/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import repository.impl.QueryImpl;
import sun.applet.Main;

public class MySqlConnectionUtil {

    private Connection connection;

    public MySqlConnectionUtil() {
    }
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/BaiTapLon", "root", "123456");
        } catch (Exception e) {
        }
        return null;
    }

    public void thucThiCauLenhSQL(String sql) {
        Connection connect = getConnection();
        try {
            Statement stmt = connect.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet chonDuLieuTuDTB(String sql) {
        try {
            Connection connect = getConnection();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
  
}
