/*
TIPO DE DATO ROPA
 */
package lab3_karimguifarro_jorgevega;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class CLASE_ROPA extends PRODUCTOS {
      private String talla;
    private String sexo;

    public CLASE_ROPA() {
    }

    public CLASE_ROPA(String talla, String sexo, String nombre, double precio, String descripcion, int cantidad) {
        super(nombre, precio, descripcion, cantidad);
        this.talla = talla;
        this.sexo = sexo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        return super.toString() + "SIZE:" + talla + ", GENERO:" + sexo + '}';
    }

    
}
