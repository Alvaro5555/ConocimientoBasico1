package edu.upc.dsa;
import java.util.*;
import org.apache.log4j.Logger;
import java.util.Comparator;
import edu.upc.dsa.Productos;
import edu.upc.dsa.usuario;
public class AccionesImpl extends Acciones {
List<usuario> listausuarios;

    static final Logger logger = Logger.getLogger(AccionesImpl.class);
    public AccionesImpl(){}
    private String idUsuarioActual;
 List<Productos> listaProductos = new LinkedList<>();
    public static AccionesImpl getInstance(){
        if(manager==null){
            manager=new AccionesImpl();
        }
        return manager;
    }
    public static AccionesImpl manager;
@Override
public void Logging(String Correo, String contraseña){
    int i = 0;
    while (i < listausuarios.size()){
        if (listausuarios.get(i).getCorreo() == Correo){
            if(listausuarios.get(i).getcontraseña() == contraseña){
            idUsuarioActual = listausuarios.get(i).getId();
        }
            else {
            logger.info("Contraseña mal Introducida");
            }

        }
        else {
            logger.info("Este usuario no existe");
            i++;
        }

    }


    }
    @Override
    public void añadirProducto(String nombre, String descripcion, int precio){
    Productos productos = new Productos(nombre, precio, descripcion);
    listaProductos.add(productos);
    }
    @Override
    public void nuevousuario()
}




