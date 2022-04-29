package edu.upc.dsa;
import java.util.List;
import java.util.ArrayList;
public class Productos {
    private String NombreP;

    private int Precio;

    private String Descripcion;
 public Productos(String NombreP, int Prec, String Descripcion){
     this.NombreP=NombreP;
     this.Precio=Prec;
     this.Descripcion= Descripcion;
 }
    public Productos(){}
    public String getNombreP(){
     return NombreP;
    }

    public void setNombreP(String nombreP) {
        this.NombreP = nombreP;
    }
    public String getDescripcion(){
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.NombreP = Descripcion;
    }
    public int getPrecio(){
     return Precio;
    }
    public void setPrecio(int Precio){
     this.Precio= Precio;
    }
}
