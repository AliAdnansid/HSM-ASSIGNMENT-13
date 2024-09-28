/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class DTO_hms implements DAO_hms {

    @Override
    public void insertStoredProcedureIntoPatient() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call inputDataInPatient(?,?,?,?);");
            System.out.println("Enter name of the Pateint : ");
            String name = scanner.next();
            System.out.println("Enter age of the Patient : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Medical Issue of the Patient : ");
            String issue = scanner.nextLine();
            System.out.println("Enter Personal Information of the Patient e.g(Phone no,Residence Address...) : ");
            String info = scanner.nextLine();
            scanner.nextLine();
            scanner.close();
            cs.setString(1, name);
            cs.setInt(2, age);
            cs.setString(3, issue);
            cs.setString(4, info);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Patient Added Into Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void deleteStoredProcedureIntoPatient() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call deletePatient(?);");
            System.out.println("Enter Patient ID Whose data you want to delete: ");
            int id = scanner.nextInt();
            cs.setInt(1, id);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Patient Delted From Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void showAllStoredProcedureIntoPatient() throws SQLException {
        try{
            
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call showPateint();");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println("Patient ID: "+rs.getInt("pid"));
                System.out.println("Patient Name: "+rs.getString("name"));
                System.out.println("Patient Age: "+rs.getInt("age"));
                System.out.println("Patient Medical Issue: "+rs.getString("diagnose"));
                System.out.println("Patient Information: "+rs.getString("personalInfo"));
                System.out.println("---------------------------------------------------");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void updateInfoStoredProcedureIntoPatient() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call updateDataInPatient(?,?,?,?,?);");
  
         
            System.out.println("Enter  NEW name of the Pateint : ");
            String name = scanner.next();
            System.out.println("Enter NEW age of the Patient : ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter NEW Medical Issue of the Patient : ");
            String issue = scanner.nextLine();
            System.out.println("Enter NEW Personal Information of the Patient e.g(Phone no,Residence Address...) : ");
            String info = scanner.nextLine();
            System.out.println("Enter PatientID whose information you wan to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
            cs.setInt(1,id);
            cs.setString(2, name);
            cs.setInt(3, age);
            cs.setString(4, issue);
            cs.setString(5, info);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Patient Updated Into Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void insertStoredProcedureIntoDoctor() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call inputDataInDoctor(?,?,?,?);");
            System.out.println("Enter name of the Doctor : ");
            String name = scanner.nextLine();
            System.out.println("Enter Salary of the Doctor : ");
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Doctor Type (Permanent/Visiting) : ");
            String type = scanner.nextLine();
            System.out.println("Enter Personal Information of the Doctor e.g(Phone no,Residence Address...) : ");
            String info = scanner.nextLine();
            scanner.nextLine();
            cs.setString(1, name);
            cs.setString(2, type);
            cs.setInt(3, salary);
            cs.setString(4, info);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Doctor Added Into Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void deleteStoredProcedureIntoDoctor() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call deleteDoctor(?);");
            System.out.println("Enter Doctor ID Whose data you want to delete: ");
            int id = scanner.nextInt();
            cs.setInt(1, id);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Doctor Deleted From Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void showAllStoredProcedureIntoDoctor() throws SQLException {
        try{
            
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call showDoctor();");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println("Doctor ID: "+rs.getInt("did"));
                System.out.println("Doctor Name: "+rs.getString("name"));
                System.out.println("Doctro Salary: "+rs.getInt("salary"));
                System.out.println("Doctor Type: "+rs.getString("doctype"));
                System.out.println("Doctor Information: "+rs.getString("personalInfo"));
                System.out.println("---------------------------------------------------");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
   }

    @Override
    public void updateInfoStoredProcedureIntoDoctor() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call updateDateInDoctor(?,?,?,?,?);");
  
         
            System.out.println("Enter  NEW name of the Doctor : ");
            String name = scanner.next();
            System.out.println("Enter NEW salary of the Doctor : ");
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter NEW type of the Doctor : ");
            String type = scanner.nextLine();
            System.out.println("Enter NEW Personal Information of the Doctor e.g(Phone no,Residence Address...) : ");
            String info = scanner.nextLine();
            System.out.println("Enter DoctorID whose information you wan to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
            cs.setInt(1,id);
            cs.setString(2, name);
            cs.setString(3, type);
            cs.setInt(4, salary);
            cs.setString(5, info);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Doctor Updated Into Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void insertStoredProcedureIntoAppointment() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call insertDataInAppointment(?,?,?,?);");
            System.out.println("Enter Doctor ID: ");
            int did = scanner.nextInt();
            System.out.println("Enter Patient ID : ");
            int pid = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Date of Appointment in formate (YYYY-MM-DD) : ");
            String date = scanner.nextLine();
            System.out.println("Enter Charges of Appointment : ");
            int fee = scanner.nextInt();
            scanner.nextLine();
            scanner.close();
            cs.setInt(1, did);
            cs.setInt(2, pid);
            cs.setString(3, date);
            cs.setInt(4, fee);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Appointment Added Into Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void deleteStoredProcedureIntoAppointment() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call deleteAppointmentByAID(?);");
            System.out.println("Enter Appointment ID Whose data you want to delete: ");
            int id = scanner.nextInt();
            cs.setInt(1, id);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Appointment Deleted From Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void insertStoredProcedureIntoBill() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call insertDataInAppointment(?,?,?,?,?);");
            System.out.println("Enter Doctor ID: ");
            int did = scanner.nextInt();
            System.out.println("Enter Patient ID : ");
            int pid = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Date of Paying Bill (YYYY-MM-DD) : ");
            String date = scanner.nextLine();
            System.out.println("Enter Charges  : ");
            int fee = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter name of the payer : ");
            String name = scanner.nextLine();
            scanner.close();
            cs.setInt(1, fee);
            cs.setString(2, name);
            cs.setInt(3, pid);
            cs.setInt(4, did);
            cs.setString(5, date);
            int row = cs.executeUpdate();
            if(row>0){
                System.out.println("Bill Added Into Datebase!");
            }
            else{
                System.out.println("Something Went Wrong!");
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void showAllStoredProcedureIntoBill() throws SQLException {
        try{
            
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call showBill();");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println("Bill ID : "+rs.getInt("bid"));
                System.out.println("Patient ID : "+rs.getInt("pid"));
                System.out.println("Doctor ID : "+rs.getInt("did"));
                System.out.println("Payment : "+rs.getInt("payment"));
                System.out.println("Name of Payer : "+rs.getString("name"));
                System.out.println("Date of Bill : "+rs.getDate("date"));
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void searchAppointmentByDoctorId() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call searchAppointmentByDid(?);");
            System.out.println("Enter Doctor Id : ");
            int id = scanner.nextInt();
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println("Appointment ID : "+rs.getInt("aid"));
                System.out.println("Patient ID : "+rs.getInt("patientid"));
                System.out.println("Doctor ID : "+rs.getInt("doctorid"));
                System.out.println("Payment : "+rs.getInt("fee"));
                System.out.println("Date of Bill : "+rs.getDate("date"));
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void searchBillByName() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call searchBillByPatient(?);");
            System.out.println("Enter Payer Name : ");
            String name = scanner.nextLine();
            cs.setString(1, name);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println("Bill ID : "+rs.getInt("bid"));
                System.out.println("Patient ID : "+rs.getInt("pid"));
                System.out.println("Doctor ID : "+rs.getInt("did"));
                System.out.println("Payment : "+rs.getInt("payment"));
                System.out.println("Name of Payer : "+rs.getString("name"));
                System.out.println("Date of Bill : "+rs.getDate("date"));
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void searchBillByDate() throws SQLException {
        try{
            
            Scanner scanner = new Scanner(System.in);
            Connection con = database.getConnection();
            CallableStatement cs = con.prepareCall("call searchBillByDate(?);");
            System.out.println("Enter Date (YYYY-MM-DD) : ");
            String date = scanner.nextLine();
            cs.setString(1, date);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                System.out.println("Bill ID : "+rs.getInt("bid"));
                System.out.println("Patient ID : "+rs.getInt("pid"));
                System.out.println("Doctor ID : "+rs.getInt("did"));
                System.out.println("Payment : "+rs.getInt("payment"));
                System.out.println("Name of Payer : "+rs.getString("name"));
                System.out.println("Date of Bill : "+rs.getDate("date"));
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());        
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
