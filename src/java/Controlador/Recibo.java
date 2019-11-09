/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author trabajo
 */
public class Recibo {
    private int id_Recibos;
    private String folio;
    private String fecha;
    private String apellidos;
    private String nombre;
    private String monto;
    private String curso;
    private String modulos;
    private String nominstructor;
    private String clavecurso;
    private String deposito;
    private String correo;
    private String telefono;
    private String comentario;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClavecurso() {
        return clavecurso;
    }

    public void setClavecurso(String clavecurso) {
        this.clavecurso = clavecurso;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getId_Recibos() {
        return id_Recibos;
    }

    public void setId_Recibos(int id_Recibos) {
        this.id_Recibos = id_Recibos;
    }

    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNominstructor() {
        return nominstructor;
    }

    public void setNominstructor(String nominstructor) {
        this.nominstructor = nominstructor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Recibo(int id_Recibos, String folio, String fecha, String apellidos, String nombre, String monto, String curso, String modulos, String nominstructor, String clavecurso, String deposito, String correo, String telefono, String comentario) {
        this.id_Recibos = id_Recibos;
        this.folio = folio;
        this.fecha = fecha;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.monto = monto;
        this.curso = curso;
        this.modulos = modulos;
        this.nominstructor = nominstructor;
        this.clavecurso = clavecurso;
        this.deposito = deposito;
        this.correo = correo;
        this.telefono = telefono;
        this.comentario = comentario;
    }

  
    
}
