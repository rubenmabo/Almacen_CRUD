package Ejercicio_Almacen;

/**
 * Abstract class ModeloAbs - Clase de acceso a Modelo de DATOS
 * 
 * @author: Ruben Marin Bodas
 * Date: 24/04/2018
 */
public abstract class ModeloAbs{
    public ModeloAbs() {
    }
    
    abstract public boolean insertarProducto ( Producto p);
    
    abstract boolean borrarProducto ( int codigo );
    
    abstract public Producto buscarProducto ( int codigo);
    
    abstract void listarProductos ();
    
    abstract void listarPocoStock ();
    
    abstract boolean modificarProducto (Producto nuevo);
    
    
}
