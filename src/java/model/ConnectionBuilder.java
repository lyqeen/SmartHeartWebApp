/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class ConnectionBuilder {
    
    public static Connection getMySqlConnServer() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://10.4.56.4:3306/SmartHeart4Project", "sirisakpks", "Ojo.sirisak123");
      
        return conn;
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.getMySqlConnServer();
        List<Patient> dh = null;
        String query = "select * from DataHealths";
        //Patients where doc_id =10001 ";
        PreparedStatement pstm = con.prepareStatement(query);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("pat_id"));
           // System.out.println(rs.getString("pat_lname"));
           // System.out.println(rs.getString("pat_fname"));
        }

    }
}
