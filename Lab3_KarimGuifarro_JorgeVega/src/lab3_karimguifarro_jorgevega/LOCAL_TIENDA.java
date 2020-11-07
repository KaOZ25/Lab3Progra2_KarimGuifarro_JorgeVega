/*
TIENDAS
 */
package lab3_karimguifarro_jorgevega;

import java.util.ArrayList;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class LOCAL_TIENDA extends LOCALES {
    
     public LOCAL_TIENDA() {
    }

    public LOCAL_TIENDA(String nombre, CLASE_EMPLEADO jefe) {
        super(nombre, jefe);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
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
        return super.toString();
    }

    
}
