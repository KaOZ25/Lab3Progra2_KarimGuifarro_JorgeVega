/*
TIPO DE DATO COMIDAS
 */
package lab3_karimguifarro_jorgevega;
import java.util.Date;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class CLASE_COMIDAS extends PRODUCTOS {
     private String tipo;
    private Date vencimiento;

    public CLASE_COMIDAS() {
    }

    public CLASE_COMIDAS(String tipo, Date vencimiento, String nombre, double precio, String descripcion, int cantidad) {
        super(nombre, precio, descripcion, cantidad);
        this.tipo = tipo;
        this.vencimiento = vencimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
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
        return super.toString() + "TIPO: " + tipo + ", CADUCIDAD: " + vencimiento;
    }
}
