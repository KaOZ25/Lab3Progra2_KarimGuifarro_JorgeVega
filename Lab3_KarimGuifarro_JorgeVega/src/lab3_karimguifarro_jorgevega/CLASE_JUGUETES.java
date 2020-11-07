/*
TIPO DE DATOS JUGUETES
 */
package lab3_karimguifarro_jorgevega;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class CLASE_JUGUETES extends PRODUCTOS{
     public CLASE_JUGUETES() {
    }

    public CLASE_JUGUETES(String nombre, double precio, String descripcion, int cantidad) {
        super(nombre, precio, descripcion, cantidad);
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

    @Override
    public String toString() {
        return super.toString();
    }
}
