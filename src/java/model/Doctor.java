/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Doctor {
    private String doc_fname;
    private int doc_Id;

    public Doctor() {
    }

    public Doctor(String doc_fname, int doc_Id) {
        this.doc_fname = doc_fname;
        this.doc_Id = doc_Id;
    }

    
    
    
    public String getDoc_fname() {
        return doc_fname;
    }

    public void setDoc_fname(String doc_fname) {
        this.doc_fname = doc_fname;
    }

    public int getDoc_Id() {
        return doc_Id;
    }

    public void setDoc_Id(int doc_Id) {
        this.doc_Id = doc_Id;
    }
    
    
    public static Doctor validate(int userName , String password){
        Doctor u = null;
        try{
            Connection con = ConnectionBuilder.getMySqlConnServer();
            String sqlCmd = "SELECT * FROM Doctors WHERE doc_id = ? and doc_fname = ?";
            PreparedStatement pstm = con.prepareStatement(sqlCmd);
            pstm.setInt(1, userName);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                u = new Doctor();
                u.setDoc_Id(rs.getInt("doc_id"));
                u.setDoc_fname(rs.getString("doc_fname"));
       
            }
        }catch(Exception e ){
            System.out.println(e);
        }
        return u;
    }
}
