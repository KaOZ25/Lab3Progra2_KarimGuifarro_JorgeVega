/*
QUIOSCOS
 */
package lab3_karimguifarro_jorgevega;

import java.util.ArrayList;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class LOCAL_QUIOSCO extends LOCALES {
    public LOCAL_QUIOSCO() {
    }

    public LOCAL_QUIOSCO(String nombre, CLASE_EMPLEADO jefe) {
        super(nombre, jefe);
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

    public void setEmpleadosQuiosco(ArrayList<CLASE_EMPLEADO> empleados) {
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
        return super.toString();
    }
    
    
}
