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

/**
 *
 * @author User
 */
public class Patient {

    private int patId;
    private String patFname;
    private String patLname;
    private int patAge;
    private String patSex;
    private int patTel;
    private String underlying;
    private Timestamp infoDate;

    public Patient() {
    }

    public Patient(int patId, String patFname, String patLname, int patAge, String patSex, int patTel, String underlying, Timestamp infoDate) {
        this.patId = patId;
        this.patFname = patFname;
        this.patLname = patLname;
        this.patAge = patAge;
        this.patSex = patSex;
        this.patTel = patTel;
        this.underlying = underlying;
        this.infoDate = infoDate;
    }

    public int getPatId() {
        return patId;
    }

    public void setPatId(int patId) {
        this.patId = patId;
    }

    public String getPatFname() {
        return patFname;
    }

    public void setPatFname(String patFname) {
        this.patFname = patFname;
    }

    public String getPatLname() {
        return patLname;
    }

    public void setPatLname(String patLname) {
        this.patLname = patLname;
    }

    public int getPatAge() {
        return patAge;
    }

    public void setPatAge(int patAge) {
        this.patAge = patAge;
    }

    public String getPatSex() {
        return patSex;
    }

    public void setPatSex(String patSex) {
        this.patSex = patSex;
    }

    public int getPatTel() {
        return patTel;
    }

    public void setPatTel(int patTel) {
        this.patTel = patTel;
    }

    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

    public Timestamp getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(Timestamp infoDate) {
        this.infoDate = infoDate;
    }

    /*static public void CoompareDateTime(ArrayList a) {
        ArrayList<Patient> plist = new ArrayList<Patient>(a);

        for (int i = 0; i < plist.size(); i++) {
            
            if (i!=plist.size()-1) {
                if (plist.get(i).getPatFname().compareTo(plist.get(i + 1).getPatFname()) == 0) {
                    if ((plist.get(i).getPatLname().compareTo(plist.get(i + 1).getPatLname())) == 0) {
                        System.out.println(plist.get(i).getPatLname());
                    } else {
                        System.out.println("Lastname not match");
                    }
                } else {
                    System.out.println("Firstname and Lastname not match");
                }

            }else {
                if (plist.get(i).getPatFname().compareTo(plist.get(0).getPatFname()) == 0){
                    if ((plist.get(i).getPatLname().compareTo(plist.get(0).getPatLname())) == 0) {
                        System.out.println("Name and last name match");
                    }
                    System.out.println("name not  match!!!!!!");
                }
            }
        }
        //return plist;
    }*/
    static public Patient showInfo(int patID) throws ClassNotFoundException, SQLException {
        Patient pa = new Patient();
        Connection con = ConnectionBuilder.getMySqlConnServer();
        String query = "select * from Patients where pat_id=?";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, patID);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            pa.setPatFname(rs.getString("pat_fname"));
            pa.setPatLname(rs.getString("pat_lname"));
            pa.setPatAge(rs.getInt("pat_age"));
            pa.setPatSex(rs.getString("pat_sex"));
            pa.setPatTel(rs.getInt("pat_tel"));
            pa.setUnderlying(rs.getString("underlying_disease"));
        }
        return pa;
    }

    static public List<Patient> doReadPatientName() throws SQLException, ClassNotFoundException {
        Connection con = ConnectionBuilder.getMySqlConnServer();
        List<Patient> plist = null;
        String query = "select p.*,d.Maxtime from "
                + "(select pat_id, Max(infoDate) as Maxtime from DataHealths Group by pat_id )d "
                + "INNER JOIN Patients p on p.pat_id = d.pat_id order by Maxtime DESC";
        //
        PreparedStatement pstm = con.prepareStatement(query);
        ResultSet rs = pstm.executeQuery();
        Patient pa = null;
        while (rs.next()) {
            if (plist == null) {
                plist = new ArrayList<Patient>();
            }
            pa = new Patient();
            pa.setPatId(rs.getInt("p.pat_id"));
            pa.setPatFname(rs.getString("p.pat_fname"));
            pa.setPatLname(rs.getString("p.pat_lname"));
            pa.setPatAge(rs.getInt("p.pat_age"));
            pa.setPatSex(rs.getString("p.pat_sex"));
            pa.setPatTel(rs.getInt("p.pat_tel"));
            pa.setUnderlying(rs.getString("p.underlying_disease"));
            pa.setInfoDate(rs.getTimestamp("d.Maxtime"));
            plist.add(pa);
        }
        return plist;
    }

    @Override
    public String toString() {
        return "Patient" + "patId=" + patId + ", "
                + "patFname=" + patFname + ", "
                + "patLname=" + patLname + ", "
                + "infoDate=" + infoDate + '}' + "\n";
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

       // ArrayList<Patient> p = null;
        Patient pl = new Patient();
       // p = (ArrayList<Patient>) Patient.doReadPatientName();
        //System.out.println(p);
        pl = Patient.showInfo(2);
        System.out.println(pl);
        

        /* String[] colors = {"Red", "Blue", "Pink", "Yellow", "Orange"};
        //for ธรรมดา
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        //for -each 
        for (String c : colors) {
            System.out.println(c);
        }
        //plist.get(0).getPatFname();
         */
    }

}
