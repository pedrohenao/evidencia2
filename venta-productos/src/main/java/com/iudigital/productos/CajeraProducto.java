/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iudigital.productos;

import com.iudigital.productos.cliente.producto.ClienteProducto;
import com.iudigital.productos.cliente.producto.Producto;

/**
 *
 * @author Pedro
 */
public class CajeraProducto {
    
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre ;
    }
    public void procesarCompra(ClienteProducto cliente, long timeStamp){
        
        System.out.println("La cajera " + this.nombre + 
                "Comienza a procesar la compra del cliente " + cliente.getNombre()
                + "en el tiempo: " + (System.currentTimeMillis() - timeStamp) /1000
                + "seg");
        
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()){
            
                this.esperarXsegundos();
                
                System.out.println("procesado el producto"+ contCliente 
                        + "nombre producto" + producto.getNombre()
                        + "precio producto" +  producto.getPrecio()
                        + "cantidad de productos" + producto.getCantidad()
                        + "costo total de producto"
                        + producto.getCantidad() * producto.getPrecio()
                        + "Tiempo:" + (System.currentTimeMillis()- timeStamp ) /1000
                        + " seg");
                        
                
                
        }
        
        System.out.print("la cajera"+ this.nombre + "ha terminado de procesar" 
                + cliente.getNombre()+"en el tiempo: ");
        
    } 
        private void esperarXsegundos() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                
                Thread.currentThread().interrupt();
            }
        }
        
}
