/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitaladmin;

import java.sql.SQLException;

/**
 *
 * @author Renato
 */
public class HospitalAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Patient p1 = new Patient("SAM", "23-11-10", "O+");
        Patient p2 = new Patient("Renato", "1998-03-14", "D+");
        
       System.out.println(p1.getPatientID());
       System.out.println(p2.getPatientID()); 
            

       System.out.println(Patient.getCurrentID()); 

          
        System.out.println(Patient.getCurrentID());
        
        
        
        if (DatabaseSetup.setupDB()) {
            System.out.println("Database and table created");
        } else {
            System.out.println("Oh no! There was a database creation problem...");
        }
    
       
    DataBaseWriter DTW = new DataBaseWriter();
         
      if (DTW.addPatient(p2)) {
            System.out.println("p2 added");
        }
    }
 
     }