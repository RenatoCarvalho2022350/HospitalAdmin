package hospitaladmin;

import static hospitaladmin.DataBase.DB_BASE_URL;
import static hospitaladmin.DataBase.PASSWORD;
import static hospitaladmin.DataBase.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renato
 */
public class DataBaseWriter extends DataBase {
    public boolean addPatient(Patient patient) throws SQLException{
        
         try(
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();  
            ){
        String sql = String.format("INSERT INTO " + TABLE_NAME + " VALUES ("
                  +"'%s', '%s' , '%s', %d);",
               patient.getName(), patient.getBirthD(), patient.getBloodType(), patient.getPatientID());
               stmt.execute(sql);
               return true;       
                }catch (Exception e) {
                     e.printStackTrace();
            return false;
        }
    
        
}

  
    public boolean addALLPatients(List<Patient>patientList){
        return true;
    }
    }
        