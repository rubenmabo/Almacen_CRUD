package Ejercicio_Almacen;
import java.util.*;

/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author Ruben Marin Bodas 
 * @version 26/04/2019
 */

public class ModeloHashMap extends ModeloAbs {
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap(){
       lista = new HashMap  <Integer,Producto>();
    }

    
    public boolean insertarProducto (Producto pr) {
  	  boolean result = false;
  	 if (pr!=null) {
  		 lista.put(pr.getCodigo(),pr);
  		 result= true;
  	 }
  	  return result;
    }
      
      public boolean borrarProducto (int cod){
      	 boolean result= false;
      	 if(lista.containsKey(cod)){
      		 lista.remove(cod);
      		 result = true;
      	 }
      	 return result;
       }
      
       public Producto buscarProducto (int cod){
      	 Producto result = null;
      	 if(lista.containsKey(cod)){
      		 result=lista.get(cod);
      	 }
      	 return result;
       }
      
       public void listarProductos (){
      	 for(int i=0; i<lista.size(); i++) {
      		 System.out.println(lista.get(i));
      	 }
       }
      
       public void listarPocoStock() {
      	 for (int i=0;i<lista.size();i++) {
       		if(lista.get(i).getStock_min()>=lista.get(i).getStock()) {
       			System.out.println(lista.get(i));
       		}
       	}
       }
      
       public boolean modificarProducto (Producto nuevo) {
      	 return true;
       }
    
}
