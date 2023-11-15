/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




/**
 *
 * @author Renato
 */
public class DatabaseSetup extends DataBase{
    
 
    
    public static boolean setupDB() throws SQLException {
        try(
                Connection conn = DriverManager.getConnection(DB_BASE_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();  
            ){
            stmt.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
            stmt.execute("USE" + DB_NAME +";");
            String sql = 
                   "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ("
                    + "name VARCHAR(255),"
                    + "birthdate DATE,"
                    + "bloodType VARCHAR(2),"
                    + "id INT(10)"
                    + ");";
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
}
