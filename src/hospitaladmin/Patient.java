/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitaladmin;

/**
 *
 * @author Renato
 */
public class Patient {
    /*
    Name
    Date bith
    blood type
    ID
    */
    
    private String name;
    private String birthD;
    private String bloodType;
    private int patientID;
    /*
    Static means it is a class variable/ it is shared by all the objec of this class
    */
    private static int currentID = 1;

    public Patient(String name, String birthD, String bloodType) {
        this.name = name;
        this.birthD = birthD;
        this.bloodType = bloodType;
        this.patientID = currentID;
        System.out.println(name + " has birthday " + birthD + ", Blood Type " + bloodType);
        currentID++;
        
    }

    
    
    public static int getCurrentID() {
        return currentID;
    }
          

    public String getName() {
        return name;
    }

    public String getBirthD() {
        return birthD;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getPatientID() {
        return patientID;
    }

    
    /*
    only this one use SET 
    */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
