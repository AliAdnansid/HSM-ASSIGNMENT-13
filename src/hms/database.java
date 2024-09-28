/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ali
 */
public class database {
    private static Connection con;
    private static String connection = "jdbc:mysql://127.0.0.1:3306/hospitalmanagementsystem";
    private static String user = "root";
    private static String pass = "";
    
    public static Connection getConnection(){
        try {
            if(con == null){
                con = DriverManager.getConnection(connection,user,pass);
            }
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());;
            return con;
        }
    }
    public static void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
