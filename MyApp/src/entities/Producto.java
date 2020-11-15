package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Producto {

    private int id;
    private String nombre;
    private String detalle;
    private Double precio;
    private Date fecha_ven;
    
    public String toString() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public void setPrecio(Double precio)
    {
        this.precio = precio;
    }
    
    public Double getPrecio()
    {
        return precio;
    }

    public Date getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(Date fecha_ven) {
        this.fecha_ven = fecha_ven;
    }
    
    public String convertirFechaString(Date date)
    {	
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);	
    }
}
