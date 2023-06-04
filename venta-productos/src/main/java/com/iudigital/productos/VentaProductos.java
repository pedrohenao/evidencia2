
package com.iudigital.productos;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Pedro
 */
public class VentaProductos {

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Cliente 1",productos);
        
        ClienteProducto cliente2 = new ClienteProducto ("cliente 2",productos);
        
        long initialTime = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("cajera 1");
        CajeraProducto cajera2 = new CajeraProducto("cajera 2");
        
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        
        } 
        private static void setProductos(List<Producto> productos){
            
            Producto producto1 = new Producto ("arroz",20, 3);
            Producto producto2 = new Producto ("azucar",10, 1);
            Producto producto3 = new Producto ("cafe",5, 5);
            
            productos.add(producto1);
            productos.add(producto2);
            productos.add(producto3);
        }  
    }

