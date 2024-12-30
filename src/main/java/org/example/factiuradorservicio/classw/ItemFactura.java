package org.example.factiuradorservicio.classw;

import jakarta.persistence.*;

@Entity
public class ItemFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItemFactura;

    @ManyToOne
    @JoinColumn(name = "id_factura") // Clave foránea en la tabla ItemFactura
    private Factura factura;

    private int idProducto;
    private int cantidad;
    private double precio;
    private double subtotal;

    // Getters and Setters

    public int getIdItemFactura() {
        return idItemFactura;
    }

    public void setIdItemFactura(int idItemFactura) {
        this.idItemFactura = idItemFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
