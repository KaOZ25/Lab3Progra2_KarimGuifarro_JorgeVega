/*
TIPO DE DATO EMPLEADO
 */
package lab3_karimguifarro_jorgevega;
import java.util.Date;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class CLASE_EMPLEADO extends CLASE_PERSONAS {
    
     private String horario;
    private int productoVendido;

    public CLASE_EMPLEADO() {
    }

    public CLASE_EMPLEADO(String username, int ID, String contraseña, String correo, String nombre, Date nacimiento, String horario, int productoVendido) {
        super(username, ID, contraseña, correo, nombre, nacimiento);
        this.horario = horario;
        this.productoVendido = productoVendido;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(int productoVendido) {
        this.productoVendido = productoVendido;
    }

    public String getUsernameEmpleado() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return super.toString()+ "HORA:" + horario + ", SE VENDIO:" + productoVendido + '}';
    }
    
}
