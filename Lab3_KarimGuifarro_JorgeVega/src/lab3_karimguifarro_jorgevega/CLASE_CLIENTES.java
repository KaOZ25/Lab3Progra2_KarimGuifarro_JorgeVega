/*
TIPO DE DATO CLIENTE
 */
package lab3_karimguifarro_jorgevega;
import java.util.ArrayList;
import java.util.Date;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class CLASE_CLIENTES extends CLASE_PERSONAS {
    private double DINERO;
    private ArrayList COMPRADO = new ArrayList();

    public CLASE_CLIENTES() {
    }

    public CLASE_CLIENTES(int IDENTIDAD, String PASS, String EMAIL, String NOM, Date NATA, double DINERO, String USUARIO) {
        super(USUARIO, IDENTIDAD, PASS, EMAIL, NOM, NATA);
        this.DINERO = DINERO;
    }

    public double getDINERO() {
        return DINERO;
    }

    public void setDINERO(double DINERO) {
        this.DINERO = DINERO;
    }

    public ArrayList getSALE() {
        return COMPRADO;
    }

    public void setSALE(ArrayList SALES) {
        this.COMPRADO = SALES;
    }

    public String getUSUARIO() {
        return username;
    }

    public void setUSUARIO(String USUARIO) {
        this.username = USUARIO;
    }

    public int getIDENTIDAD() {
        return ID;
    }

    public void setIDENTIDAD(int IDENTIDAD) {
        this.ID = IDENTIDAD;
    }

    public String getPASS() {
        return contraseña;
    }

    public void setPASS(String PASS) {
        this.contraseña = PASS;
    }

    public String getEMAIL() {
        return correo;
    }

    public void setEMAIL(String EMAIL) {
        this.correo = EMAIL;
    }

    public String getNOM() {
        return nombre;
    }

    public void setNOM(String NOM) {
        this.nombre = NOM;
    }

    public Date getNATA() {
        return nacimiento;
    }

    public void setNATA(Date NATA) {
        this.nacimiento = NATA;
    }

    @Override
    public String toString() {
        return super.toString() + "DINERO:" + DINERO + ", COMPRAS:" + COMPRADO + '}';
    }
    
}
