/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class connection {
    String jbdcDriver = "com.mysql.cj.jdbc.Driver";
    String dbURL = "jdbc.mysql://localhost/mamyukss";
    String user = "root";
    String pass = "";
    
    Connection con;
    Statement stmt;
    ResultSet st;
    
    public void koneksi(String jdbcDriver){
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Error");
        }
        
        try {
            con = (Connection) DriverManager.getConnection(dbURL,user,pass);
        } catch (SQLException ex) {
            System.out.println("Koneksi Error");
        }
    }

    private void koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



