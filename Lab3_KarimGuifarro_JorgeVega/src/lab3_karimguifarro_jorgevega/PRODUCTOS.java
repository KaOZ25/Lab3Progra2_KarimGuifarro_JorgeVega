/*
CLASE_PRODUCTOS
 */
package lab3_karimguifarro_jorgevega;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class PRODUCTOS {
     protected String nombre;
    protected double precio;
    protected String descripcion;
    protected int cantidad;

    public PRODUCTOS() {
    }

    public PRODUCTOS(String nombre, double precio, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ARTICULO: \n" + "NOMBRE: " + nombre + ", VALOR: " + precio + ", DESCRIP.: " + descripcion + ", UNIDADES: " + cantidad;
    }


}
