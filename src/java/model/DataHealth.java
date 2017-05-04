/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DataHealth {

    private int daId;
    private Timestamp infoDate;
    private int weight;
    private int systolic;
    private int diastolic;
    private int heartRate;
    private String ECG;

    public DataHealth() {
    }

    public DataHealth(int daId, Timestamp infoDate, int weight, int systolic, int diastolic, int heartRate, String ECG) {
        this.daId = daId;
        this.infoDate = infoDate;
        this.weight = weight;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.heartRate = heartRate;
        this.ECG = ECG;
    }

    public int getDaId() {
        return daId;
    }

    public void setDaId(int daId) {
        this.daId = daId;
    }

    public Timestamp getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(Timestamp infoDate) {
        this.infoDate = infoDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getECG() {
        return ECG;
    }

    public void setECG(String ECG) {
        this.ECG = ECG;
    }
    
    static public DataHealth showDataHealth(int dhId) throws ClassNotFoundException, SQLException {
        DataHealth dh = new DataHealth();
        Connection con = ConnectionBuilder.getMySqlConnServer();
        String query = "select * from DataHealths where dh_id=?";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, dhId);
        ResultSet rs = pstm.executeQuery();
       if(rs.next()){
        dh.setInfoDate(rs.getTimestamp("infoDate"));
        dh.setSystolic(rs.getInt("systolic"));
        dh.setDiastolic(rs.getInt("diastolic"));
        dh.setHeartRate(rs.getInt("heart_rate"));
        dh.setWeight(rs.getInt("weight"));
        dh.setECG(rs.getString("ecg"));
       }
        return dh;
    }

    static public List<DataHealth> doReadListData(int patID) throws SQLException, ClassNotFoundException {
        List<DataHealth> dhList = null;

        Connection con = ConnectionBuilder.getMySqlConnServer();

        String query = "select * from DataHealths where pat_id=? order by infoDate DESC";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, patID);
        ResultSet rs = pstm.executeQuery();
        DataHealth dh = null;
        while (rs.next()) {
            if (dhList == null) {
                dhList = new ArrayList<>();
            }
            dh = new DataHealth();
            dh.setDaId(rs.getInt("dh_id"));
            dh.setInfoDate(rs.getTimestamp("infoDate"));
            dh.setSystolic(rs.getInt("systolic"));
            dh.setDiastolic(rs.getInt("diastolic"));
            dh.setHeartRate(rs.getInt("heart_rate"));
            dh.setWeight(rs.getInt("weight"));
            dh.setECG(rs.getString("ecg"));
            dhList.add(dh);
        }

        return dhList;
    }
    
    static public boolean checkData(int diastolic){
        boolean check = false;
        if(diastolic<80){
            check=true;
        }
        return check;
    }
    
    
    

    @Override
    public String toString() {
        return "DataHealth{" + "daId=" + daId + ", infoDate=" + infoDate + ", weight=" + weight + ", systolic=" + systolic + ", diastolic=" + diastolic + ", heartRate=" + heartRate + ", ECG=" + ECG + '}'+"\n";
    }
    
    
    

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<DataHealth> dhList = null;
        dhList = DataHealth.doReadListData(1);
        System.out.println(dhList);
       //p = DataHealth.showDataHealth(2);
       // System.out.println(p);
        
        
    }
}
