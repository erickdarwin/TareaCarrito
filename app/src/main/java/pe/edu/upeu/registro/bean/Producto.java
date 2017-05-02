package pe.edu.upeu.registro.bean;

/**
 * Created by Alumnos on 02/05/2017.
 */

public class Producto {
    private Long id;
    private int codProducto;
    private String desProducto;
    private int cantidad;
    private Double precioReal;
    private Double total;

    public Producto(){

    }
    public Producto(Long id, int codProducto, String desProducto, int cantidad, Double precioReal, Double total) {
        this.id = id;
        this.codProducto = codProducto;
        this.desProducto = desProducto;
        this.cantidad = cantidad;
        this.precioReal = precioReal;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDesProducto() {
        return desProducto;
    }

    public void setDesProducto(String desProducto) {
        this.desProducto = desProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioReal() {
        return precioReal;
    }

    public void setPrecioReal(Double precioReal) {
        this.precioReal = precioReal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}