/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author yashpatel
 */
public class DatabaseConnector {

    // data memebers 
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/medicaldb?useSSL=True";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "yash";

    //CRUD OPERATION
    // CREATE
    public static void addPatient(Patient p1) throws SQLException {

        String query = "INSERT INTO patient(firstname , 'lastname' , 'age', gender ,  patient_type) VALUES(?,?,?,?,?)";
        try { //Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getName());
            stmt.setString(2, p1.getLname());
            stmt.setInt(3, p1.getAge());
            stmt.setString(4, p1.getGender());
            stmt.setString(5, p1.getPaitientType());
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted" + rows);
        } catch (SQLException sqle) {
            System.out.println("Sql Exception Occured");
            System.out.println(sqle);
        }
    }

    // READ
    public static ArrayList<Patient> getPatient() {
        ArrayList<Patient> patients = new ArrayList();
        String query = "SELECT * FROM patient";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Patient p1 = new Patient();
                p1.setName(rs.getString("firstname"));
//                p1.setLname(rs.getString("lastname"));
//                p1.setAge(rs.getInt("age"));
                p1.setId(rs.getInt("id"));
                p1.setGender(rs.getString("gender"));
                p1.setPaitientType(rs.getString("patient_type"));
                patients.add(p1);
                
            }
            rs.close();
            conn.close();

        } catch (SQLException sqle) {
            System.out.println("Sql Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return patients;
    }

    public static void getPatientName() {
        
        
    }

    // UPDATE
    public static void updatePatient(Patient oldPatient, Patient newPatient) {
        String query = "UPDATE patient SET firstname = ?, lastname = ? , age = ? , gender = ? , patient_type = ? WHERE id = ? ";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1 , newPatient.getName());
//            stmt.setString(2, newPatient.getLname());
//            stmt.setInt(3, newPatient.getAge());
            stmt.setString(2, newPatient.getGender());
            stmt.setString(3, newPatient.getPaitientType());
//            stmt.setInt(6, newPatient.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows Updated" + rows);
            
        } catch (SQLException sqle) {
            System.out.println("Sql Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }

    // DELETE
    public static void deletePatient(Patient p1) {
        String query = "DELETE FROM patient WHERE id=?";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1 , p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows Deleted" + rows);
            conn.close();
        }
        catch (SQLException sqle) {
            System.out.println("Sql Exception Occured");
            System.out.println(sqle);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
