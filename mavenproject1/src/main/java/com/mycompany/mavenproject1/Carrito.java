/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Carrito 
{
    private String usuarioId;
    private List<String> productos;
    private double total;

    public Carrito(String usuarioId) {
        this.usuarioId = usuarioId;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public boolean añadirProducto(String productoId, double precio) 
    {
        productos.add(productoId);
        total += precio;
        return true;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

 
}
