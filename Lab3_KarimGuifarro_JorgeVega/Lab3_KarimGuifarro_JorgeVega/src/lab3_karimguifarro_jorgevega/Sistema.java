/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_karimguifarro_jorgevega;

import java.util.ArrayList;

public class Sistema {

    private String usuario;
    private String SUDO;
    private String local;
    private ArrayList<String> empleados;
    private ArrayList<Object> cliente;
    private ArrayList<Object> productos;

    public Sistema() {
    }

    public Sistema(String usuario, String SUDO, String local, ArrayList<String> empleados, ArrayList<Object> cliente, ArrayList<Object> productos) {
        this.usuario = usuario;
        this.SUDO = SUDO;
        this.local = local;
        this.empleados = empleados;
        this.cliente = cliente;
        this.productos = productos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSUDO() {
        return SUDO;
    }

    public void setSUDO(String SUDO) {
        this.SUDO = SUDO;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<String> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<String> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Object> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Object> cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Object> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Object> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Sistema{" + "usuario=" + usuario + ", SUDO=" + SUDO + ", local=" + local + ", empleados=" + empleados + ", cliente=" + cliente + ", productos=" + productos + '}';
    }
    
}
