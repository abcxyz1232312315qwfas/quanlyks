/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Account;
import model.Role;
import repository.Query;
import util.MySqlConnectionUtil;

/**
 *
 * @author ADMIN
 */
public class QueryImpl{

    public void findAll(DefaultTableModel myModel) {
        ResultSet resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("select * from TaiKhoan");
        Connection connection = new MySqlConnectionUtil().getConnection();
        List<Account> accounts= new ArrayList<>();
        try {
            while (resultSet.next()) {
                Account account = new Account();
                account.setTenTK(resultSet.getString(1));
                account.setMaNV(resultSet.getString(2));
                account.setPassword(resultSet.getString(3));
                account.setMaQuyen(resultSet.getString(4));
                accounts.add(account);
                
                Vector vector = new Vector();
                vector.add(account.getMaNV());
                vector.add(account.getTenTK());
                vector.add(account.getPassword());
                vector.add(account.getMaQuyen());
                
                myModel.addRow(vector);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Vector> findAllPlus() {
        ResultSet resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("select * from TaiKhoan");
        Connection connection = new MySqlConnectionUtil().getConnection();
        List<Vector> accounts= new ArrayList<>();
  
        try {
            while (resultSet.next()) {
                Account account = new Account();
                account.setTenTK(resultSet.getString(1));
                account.setMaNV(resultSet.getString(2));
                account.setPassword(resultSet.getString(3));
                account.setMaQuyen(resultSet.getString(4));
               
                Vector vector = new Vector();
                vector.add(account.getMaNV());
                vector.add(account.getTenTK());
                vector.add(account.getPassword());
                vector.add(account.getMaQuyen());
                
                 accounts.add(vector);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
         return accounts;
    }
    
    public List<String> findAllArr() {
        ResultSet resultSet = new MySqlConnectionUtil().chonDuLieuTuDTB("select * from Quyen");
        Connection connection = new MySqlConnectionUtil().getConnection();
        List<String> strings= new ArrayList<>();
        try {
            while (resultSet.next()) {
                strings.add(resultSet.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strings;
    }
 
    
}
