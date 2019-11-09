/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LEONARDO
 */
public class conexion {
 private String USERNAME="root";  
 private String PASSWORD="leonardo"; 
 private String MOST="localhost"; 
 private String PORT="3306"; 
 private String DATABASE="probando"; 
 private String CLASSNAME="com.mysql.jdbc.Driver"; 
 private String URL="jdbc:mysql://"+MOST+":"+PORT+"/"+DATABASE;
 static Connection con;
 
 
 public conexion(){
 
     try {
         Class.forName(CLASSNAME);
         con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
     } catch (ClassNotFoundException e) {
         System.out.println("error"+e);
     }catch (SQLException e ){
     System.err.println("error" +e);
     }
 }
 public static Connection getconexion(){
 return con;
 }
}
