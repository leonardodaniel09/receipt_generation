/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

//import com.mysql.jdbc.PreparedStatement;
import Controlador.Recibo;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LEONARDO
 */
public class Consultas extends conexion {

    public boolean atentificacion(String usuario, String contraseña) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String consulta = "select * from trabajadores where Nombre_Usuario = ? and Contraseña = ?";
            //pst = (PreparedStatement) getconexion().prepareStatement(consulta);
            pst = getconexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("error" + e);
        } finally {
            try {
                if (getconexion() != null) {
                    getconexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("error" + e);
            }
        }
        return false;


    }

    public boolean registrar(String nombre, String apellidoP, String apellidom, String sexo, String edad, String tel, String direcc, String cargo, String nombreuser, String contraseña) {
        PreparedStatement pst = null;

        try {
            String consulta = "insert into trabajadores (Nombre, Apellido_Paterno, Apellido_Materno, Sexo, Edad, Telefono, Direccion, Cargo, Nombre_Usuario, Contraseña) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = getconexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellidoP);
            pst.setString(3, apellidom);
            pst.setString(4, sexo);
            pst.setString(5, edad);
            pst.setString(6, tel);
            pst.setString(7, direcc);
            pst.setString(8, cargo);
            pst.setString(9, nombreuser);
            pst.setString(10, contraseña);



            if (pst.executeUpdate() == 1) {

                return true;
            }
        } catch (Exception e) {
            System.err.println("error" + e);
        } finally {
            try {
                if (getconexion() != null) {
                    getconexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.err.println("error" + ex);
            }

        }
        return false;
    }
    
 
    //metodo de ventas
    public boolean ventas(String folio, String fecha, String apellidos, String nombre,String monto, String curso, String modulos, String instructor, String clave, String deposito, String correo, String telefono, String comentario){
    PreparedStatement pst = null;

        try {
            String consulta = "insert into recibos (Folio,Fecha,Apellidos,Nombre,Monto,Curso,Modulos,Nom_Instructor,Clave_del_Curso_o_Diplomado,Deposito_Referencia,Correo,Telefono,Comentario) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = getconexion().prepareStatement(consulta);
            pst.setString(1, folio);
            pst.setString(2, fecha);
            pst.setString(3, apellidos);
            pst.setString(4, nombre);
            pst.setString(5, monto);
            pst.setString(6, curso);
            pst.setString(7, modulos);
            pst.setString(8, instructor);
            pst.setString(9, clave);
            pst.setString(10, deposito);
            pst.setString(11, correo);
            pst.setString(12, telefono);
            pst.setString(13, comentario);
            
            if (pst.executeUpdate() == 1) {

                return true;
            }
        } catch (Exception e) {
            System.err.println("error" + e);
        } finally {
            try {
                if (getconexion() != null) {
                    getconexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                System.err.println("error" + ex);
            }

        }
        return false;
    
    }
    public static List<Recibo> Mostar(){
        ResultSet rs = null;
        PreparedStatement pst=null;
         
        List<Recibo> recibo=new ArrayList<Recibo>();
        try {
        
            
            
       
            String consulta="SELECT idRecibos,Folio,Fecha,Apellidos,Nombre,Monto,Curso,Modulos,Nom_Instructor,Clave_del_Curso_o_Diplomado,Deposito_Referencia,Correo,Telefono,Comentario FROM recibos";
            pst=getconexion().prepareStatement(consulta);
            rs=pst.executeQuery();    
         //Statement stmt1 = getconexion().createStatement();
        //rs = stmt1.executeQuery("select id_Matricula,marca,modelo,FechaDeRegistro FROM vehiculos");
        while(rs.next()){
            //System.out.println("npmbre " + rs.getString(1)+rs.getString(2));
            Recibo us=new Recibo(rs.getInt("id_Recibos"), rs.getString("Folio"), rs.getString("Fecha"), rs.getString("Apellidos"), rs.getString("Nombre"), rs.getString("Monto"), rs.getString("Curso"), rs.getString("Modulos"), rs.getString("Nom_Instructor"), rs.getString("Clave_del_Curso_o_Diplomado"), rs.getString("Deposito_Referencia"), rs.getString("Correo"), rs.getString("Telefono"), rs.getString("Comentario"));
            recibo.add(us);
        }
        pst.close();
        return recibo;
        } catch (Exception e) {
            return null;
        }
        
    } 
    public static boolean Actualizar(Recibo recibo){
        boolean respuesta=false;
        PreparedStatement pst=null;
        //ResultSet rs=null;
        String consulta="update recibos set Folio='"+recibo.getFolio()+"', Fecha='"+recibo.getFecha()+"', Apellidos='"+recibo.getApellidos()+"', Nombre='"+recibo.getNombre()+"', Monto='"+recibo.getMonto()+"', Curso='"+recibo.getCurso()+"', Modulos='"+recibo.getModulos()+"', Nom_Instructor='"+recibo.getNominstructor()+"', Clave_del_Curso_o_Diplomado='"+recibo.getClavecurso()+"', Deposito_Referencia='"+recibo.getDeposito()+"', Correo='"+recibo.getCorreo()+"', Telefono='"+recibo.getTelefono()+"', Comentario='"+recibo.getComentario()+"' where idRecibos="+recibo.getId_Recibos()+"";
        try {
           pst=getconexion().prepareStatement(consulta);
            pst.executeUpdate(); 
            respuesta=true;
        } catch (Exception e) {
            respuesta=false;
        }
 
        
        
            
            return respuesta;
    
    }
    
      
}
