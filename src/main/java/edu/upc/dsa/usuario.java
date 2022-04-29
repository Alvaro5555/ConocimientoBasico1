package edu.upc.dsa;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class usuario {
    private String id;
    private String Nombre;

    private String Apellido1;

    private String Apellido2;

    private String Fecha;

    private String correo;

    private String contraseña;

    public int Saldo;

    public List<Productos> ProductosCompList = new ArrayList<>();

    public usuario(String id, String nombre, String Apell1, String Apell2, String Fecha, String Correo, String Contraseña, int Saldo,List<Productos> list) {
        this.id = id;
        this.Nombre = nombre;
        this.Apellido1 = Apell1;
        this.Apellido2 = Apell2;
        this.Fecha = Fecha;
        this.correo = Correo;
        this.contraseña = Contraseña;
        this.Saldo = Saldo;
        this.ProductosCompList=list;
    }

    public usuario() {
    }

    ;

    public String getId() {
        return id;
    }

    public void SetId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }
    public void setApellido1( String Apellido1) {
        this.Apellido1 = Apellido1;
    }
    public String getApellido2(){
        return Apellido2;
    }
    public void setApellido2(String Apellido2){
        this.Apellido2 = Apellido2;
}
    public String Fecha(){
        return Fecha;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo( String correo){
        this.correo = correo;
    }
    public String getcontraseña(){
        return contraseña;
    }
    public void setcontraseña( String contraseña){
        this.contraseña = contraseña;
    }
    public int getSaldo(){
        return Saldo;
    }
    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }
    public List<Productos> getProductosCompList() {
        return ProductosCompList;
    }

    public void setProductosCompList(List<Productos> ProductosComplist) {
        this.ProductosCompList = ProductosComplist;
    }

}
