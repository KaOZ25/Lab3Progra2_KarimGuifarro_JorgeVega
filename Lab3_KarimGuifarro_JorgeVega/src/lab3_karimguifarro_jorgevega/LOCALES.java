/*
CLASE LOCALES
 */
package lab3_karimguifarro_jorgevega;

import java.util.ArrayList;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class LOCALES {
     protected String nombre;
    protected ArrayList<CLASE_EMPLEADO> empleados = new ArrayList();
    protected ArrayList<PRODUCTOS> productos = new ArrayList();
    protected CLASE_EMPLEADO jefe;

    public LOCALES() {
    }

    public LOCALES(String nombre, CLASE_EMPLEADO jefe) {
        this.nombre = nombre;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<CLASE_EMPLEADO> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<CLASE_EMPLEADO> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<PRODUCTOS> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<PRODUCTOS> productos) {
        this.productos = productos;
    }

    public CLASE_EMPLEADO getJefe() {
        return jefe;
    }

    public void setJefe(CLASE_EMPLEADO jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "NOMBRE_LOCAL:" + nombre + ", EMPLEADOS_LOCAL" + empleados + ", PRODUCTOS:" + productos + ", GERENTE=" + jefe;
    }
}
