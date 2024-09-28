/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms;
import java.sql.*;
public interface DAO_hms {
    void insertStoredProcedureIntoPatient() throws SQLException;
    void deleteStoredProcedureIntoPatient() throws SQLException;
    void showAllStoredProcedureIntoPatient() throws SQLException;      //CRUD COMPLETED FOR PATIENT
    void updateInfoStoredProcedureIntoPatient() throws SQLException;
    void insertStoredProcedureIntoDoctor() throws SQLException;
    void deleteStoredProcedureIntoDoctor() throws SQLException;
    void showAllStoredProcedureIntoDoctor() throws SQLException;       //CRUD COMPLETED FOR DOCTOR
    void updateInfoStoredProcedureIntoDoctor() throws SQLException;
    void insertStoredProcedureIntoAppointment() throws SQLException;
    void deleteStoredProcedureIntoAppointment() throws SQLException;   //CD COMPLETED FOR APPOINTMENT
    void insertStoredProcedureIntoBill() throws SQLException;
    void showAllStoredProcedureIntoBill() throws SQLException;         //CR COMPLETED FOR BILL
}
