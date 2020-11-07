/*
CLASE PRINCIPAL
 */
package lab3_karimguifarro_jorgevega;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *KarimFigueroa
 *Jorge Vega
 */
public class Lab3_KarimGuifarro_JorgeVega {

    static Scanner sc = new Scanner(System.in);
 
    static ArrayList PRO_VENDI = new ArrayList();
    static ArrayList EMPLE_VENDI = new ArrayList();
    static ArrayList VENTAS_DAYLE = new ArrayList();
    static ArrayList PRECIOS = new ArrayList();
    static ArrayList<Integer> ID_TODOS = new ArrayList();
    static ArrayList<String> USUARIOS = new ArrayList();
    static ArrayList<String> PASSWORDS = new ArrayList();
    static ArrayList<LOCALES> LOCALES = new ArrayList();
    static ArrayList<CLASE_PERSONAS> PERSONAS = new ArrayList();
    static ArrayList<CLASE_PERSONAS> COMPRADORES = new ArrayList();
    static ArrayList<CLASE_PERSONAS> TRABAJADORES = new ArrayList();
    static ArrayList<PRODUCTOS> PRODU = new ArrayList();

    static Random R = new Random();

    public static void main(String[] args) throws ParseException {
        char r = 's';
        while (r == 's' || r == 'S') {
            System.out.println(" 1. LOGIN  ");
            System.out.println(" 2. SINGIN ");
            System.out.println(" 3. SALIR  ");
            System.out.println("                    ");
            System.out.println(" INGRESE LA OPCION: ");
            int OP1 = sc.nextInt();
            switch (OP1) {
                case 1:
                    System.out.println(" 1. ADMINISTRADOR  ");
                    System.out.println(" 2. CLIENTE        ");
                    System.out.println(" 3. SALIR       ");
                    System.out.println("COMO QUIERE ENTRAR?, ELIJA SU OPCION");
                    int OP2 = sc.nextInt();
                    switch (OP2) {
                       
                        
                        
                        
                        
                        
                        
                        
                        case 1:
                            System.out.println("INGRESE NOMBRE DE USUARIO:");
                            String user = sc.next();
                            System.out.println("INGRESE CONTRASENA DE ACCESO TOTAL:");
                            String CONT = sc.next();
                            System.out.println("                         ");
                            if (user.equalsIgnoreCase("SUDO") && CONT.equalsIgnoreCase("beatifulclao")) {
                            System.out.println(" ");
                            System.out.println("                         ");
                            System.out.println("   1. AGREGAR     ");
                            System.out.println("   2. MODIFICAR   ");
                            System.out.println("   3. ELIMINAR   ");
                            System.out.println("   4. FACTURAR           ");
                            System.out.println("   5. REGRESAR          ");
                            System.out.println("   INGRESE LA OPERACION: ");
                            int OP3 = sc.nextInt();
                            switch (OP3) {
                                case 1:
                                    System.out.println("1. AGREGAR LOCALES");
                                    System.out.println("2. AGREGAR EMPLEADOS");
                                    System.out.println("3. AGREGAR PRODUCTOS");
                                    System.out.println("4. REGRESAR");
                                    System.out.print("ELIJA LA OPCION: ");
                                    int OP4 = sc.nextInt();
                                    switch (OP4) {
                                        case 1:
                                            System.out.println("NOMBRE DEL LOCAL A AGREGAR:");
                                            String L = sc.next();
                                            String string = "";
                                            for (int i = 0; i < TRABAJADORES.size(); i++) {
                                                string += "[" + i + "]" + TRABAJADORES.get(i);
                                                string += "\n";
                                            }System.out.println(string);
                                            System.out.println(" ");
                                            System.out.println("INGRESE INDICE DE EMPLEADO CON CARGO DE GERENTE");
                                            int posi = sc.nextInt();
                                            CLASE_PERSONAS BOSS = TRABAJADORES.get(posi);
                                            System.out.println("1. TIENDA ");
                                            System.out.println("2. QUIOSCO ");
                                            System.out.println("3. RESTAURANTE");
                                            System.out.println("4. REGRESAR");
                                            System.out.println("INGRESE EL TIPO DE LOCAL");
                                            int TIPE = sc.nextInt();
                                            while (TIPE < 1 || TIPE > 3) {
                                                System.out.println("LA OPCION NO ES VALIDA");
                                                TIPE = sc.nextInt();
                                            }switch (TIPE) {
                                                case 1:
                                                    LOCAL_TIENDA A = new LOCAL_TIENDA(L, (CLASE_EMPLEADO) (BOSS));
                                                    LOCALES.add(A);
                                                    break;
                                                case 2:
                                                    LOCAL_QUIOSCO B = new LOCAL_QUIOSCO(L, (CLASE_EMPLEADO) (BOSS));
                                                    LOCALES.add(B);
                                                    break;
                                                case 3:
                                                    LOCAL_RESTAURANTES C = new LOCAL_RESTAURANTES(L, (CLASE_EMPLEADO) (BOSS));
                                                    LOCALES.add(C);
                                                    break;
                                                case 4:
                                                    break;
                                                default:
                                                  System.out.println("La opcion no es valida");  
                                            }
                                            
                                            break;
                                        case 2:
                                            int IDENTIFICACION = 10000 + R.nextInt(10000001);
                                            while (IDENTIFICA(IDENTIFICACION) == true) {
                                                IDENTIFICACION = 10000 + R.nextInt(100000);
                                            }ID_TODOS.add(IDENTIFICACION);
                                            System.out.print("NOMBRE DE USUARIO: ");
                                            String USUARI = sc.next();
                                            while (USUAR(USUARI) == true) {
                                                System.out.println("ESTE USUARIO YA EXISTE");
                                                System.out.print("NOMBRE DE USUARIO: ");
                                                USUARI = sc.next();
                                            }System.out.print("INGRESE PASWORD: ");
                                            String PASS = sc.next();
                                            System.out.print("INGRESE E-MAIL: ");
                                            String emaill = sc.next();
                                            System.out.print("NOMBRE COMPLETO: ");
                                            String name = sc.nextLine();
                                            sc.nextLine();
                                            System.out.print("FECHA DE NACIMIENTO (dd/MM/yyyy): ");
                                            String date = sc.next();
                                            System.out.print("HORARIO LABORAL: ");
                                            String h_atention = sc.nextLine();
                                            sc.nextLine();
                                            System.out.println("EMPLEADO HA SIDO AGREGADO CON EXITO");
                                            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                                            CLASE_EMPLEADO e = new CLASE_EMPLEADO(USUARI, IDENTIFICACION, PASS, emaill, name, f.parse(date), h_atention, 0);
                                            TRABAJADORES.add(e);
                                            PERSONAS.add(e);
                                            break;
                                        case 3:
                                            System.out.println("NOMBRE DE PRODUCTO ");
                                            String articulo = sc.next();
                                            sc = new Scanner(System.in);
                                            System.out.println("INGRESE EL VALOR POR PRODUCTO: ");
                                            double VALOR = sc.nextDouble();
                                            sc = new Scanner(System.in);
                                            System.out.println(" ALGUN COMENTARIO DEL PRODUCTO: ");
                                            String COMEN = sc.nextLine();
                                            sc.nextLine();
                                            System.out.println("CANTIDAD DE ARTICULOS: ");
                                            int UNIDADES = sc.nextInt();
                                            sc.nextInt();
                                            sc = new Scanner(System.in);
                                            System.out.println("1. ROPA");
                                            System.out.println("2. JUGUETES");
                                            System.out.println("3. PRODUCTOS ALIMENTICIOS");
                                            System.out.println("4. REGRESAR");
                                            System.out.println("INGRESE EL TIPO DE PRODUCTO: ");
                                            int TIPO = sc.nextInt();
                                            switch (TIPO) {
                                                case 1:
                                                    System.out.println("ELIJA LA TALLA");
                                                    System.out.println("1. S ");
                                                    System.out.println("2. M ");
                                                    System.out.println("3. L ");
                                                    int D = sc.nextInt();
                                                    while (D < 1 || D > 3) {
                                                        System.out.println("LA OPCION NO ES VALIDA");
                                                        D = sc.nextInt();
                                                    }String SZ = "",
                                                     SX = "";
                                                    switch (D) {
                                                        case 1:
                                                            SZ = "S";
                                                            break;
                                                        case 2:
                                                            SZ = "M";
                                                            break;
                                                        case 3:
                                                            SZ = "L";
                                                            break;
                                                        default:
                                                            break;
                                                    }System.out.println("1. HOMBRE");
                                                    System.out.println("2. MUJER");
                                                    System.out.println("INGRESE EEL GENERO");
                                                    int E = sc.nextInt();
                                                    while (E < 1 || E > 2) {
                                                        System.out.println("LA OPCION NO ES VALIDA");
                                                       E = sc.nextInt();
                                                    }switch (D) {
                                                        case 1:
                                                            SX = "MASCULINO";
                                                            break;
                                                        case 2:
                                                            SX = "FEMENINO";
                                                            break;
                                                        default:
                                                            break;
                                                    }CLASE_ROPA rr = new CLASE_ROPA(SZ, SX, articulo, VALOR, COMEN, UNIDADES);
                                                    PRODU.add(rr);
                                                    System.out.println("LISTA DE TIENDAS DISPONIBLES");
                                                    for (Object F : LOCALES) {
                                                        if (F instanceof LOCAL_TIENDA) {
                                                            System.out.println(LOCALES.indexOf(F) + " = " + F);
                                                        }}System.out.println("QUIERE ADICIONAR PRODUCTO?...ELIJA LA TIENDA: ");
                                                    int G = sc.nextInt();
                                                    LOCALES.get(G).getProductos().add(rr);
                                                    break;
                                                case 2:
                                                    CLASE_JUGUETES j = new CLASE_JUGUETES(articulo, VALOR, COMEN, UNIDADES);
                                                    PRODU.add(j);
                                                    System.out.println("LISTA DE TIENDAS DISPONIBLES");
                                                    for (Object F : LOCALES) {
                                                        if (F instanceof LOCAL_TIENDA) {
                                                            System.out.println(LOCALES.indexOf(F) + " = " + F);
                                                        }}System.out.println("QUIERE ADICIONAR PRODUCTO?...ELIJA LA TIENDA: ");
                                                    G = sc.nextInt();
                                                    LOCALES.get(G).getProductos().add(j);
                                                    break;
                                                case 3:
                                                    System.out.println("1. BEBIDAS 2. COMIDA");
                                                    System.out.println("ELIJA LA OPCION");
                                                    int OP5 = sc.nextInt();
                                                    String CLASI = "";
                                                    switch (OP5) {
                                                        case 1:
                                                            CLASI = "BEBIDA";
                                                            break;
                                                        case 2:
                                                            CLASI = "COMIDA";
                                                            break;
                                                        default:
                                                            break;
                                                    }SimpleDateFormat FF = new SimpleDateFormat("dd/MM/yyyy");
                                                    System.out.println("INGRESE FECHA DE VENCIMIENTO dd/MM/yyyy");
                                                    String DATES = sc.next();
                                                    Date d = FF.parse(DATES);
                                                    CLASE_COMIDAS H = new CLASE_COMIDAS(CLASI, d, articulo, VALOR, COMEN, UNIDADES);
                                                    PRODU.add(H);
                                                    System.out.println("LISTA DE TIENDAS DISPONIBLES");
                                                    for (Object o : LOCALES) {
                                                        if (o instanceof LOCAL_TIENDA) {
                                                            System.out.println(LOCALES.indexOf(o) + " = " + o);
                                                        }}
                                                    System.out.println("QUIERE ADICIONAR PRODUCTO?...ELIJA LA TIENDA: ");
                                                    G = sc.nextInt();
                                                    LOCALES.get(G).getProductos().add(H);
                                                    break;
                                                    case 4:
                                                        break;
                                                        
                                                default:
                                                    System.out.println("LA OPCION NO ES VALIDA");
                                                    break;
                                            }
                                            break;
                                        case 4:
                                        break;
                                        default:
                                            System.out.println("LA OPCION NO ES VALIDA");
                                    }break;
                                case 2:
                                    System.out.println("1) MODIFICAR LOCAL");
                                    System.out.println("2) MODIFICAR PRODUCTO");
                                    System.out.println("3) MODIFICAR PERSONA");
                                    System.out.println("4) REGRESAR");
                                    System.out.print("INGRESE LA OPCION: ");
                                    int OP6 = sc.nextInt();
                                    switch (OP6) {
                                        case 1:
                                            System.out.println("LOCALES EN LA LISTA: ");
                                            for (Object o : LOCALES) {
                                                System.out.println(LOCALES.indexOf(o) + " = " + o);
                                            } 
                                            System.out.print("INGRESE LOCAL QUE DESEA MODIFICAR: ");
                                            int INDICE = sc.nextInt();
                                            System.out.println("1) NOMBRE");
                                            System.out.println("2) GERENTE");
                                            System.out.print("INGRESE LA OPCION QUE DESEA MODIFICAR: ");
                                            int OP7 = sc.nextInt();
                                            switch (OP7) {
                                                case 1:
                                                    System.out.print("INGRESE NUEVO NOMBRE: ");
                                                    String NOM = sc.nextLine();
                                                    LOCALES.get(INDICE).setNombre(NOM);
                                                    break;
                                                case 2:
                                                    System.out.println("LISTA DE EMPLEADOS");
                                                    System.out.println(LOCALES.get(INDICE).getEmpleados());
                                                    System.out.print("INGRESA EL INDICE DE EMPLEADO QUE QUIERE ASCENDER A GERENTE: ");
                                                    int INDI = sc.nextInt();
                                                    CLASE_EMPLEADO GERENTE = ((CLASE_EMPLEADO) (TRABAJADORES.get(INDI)));
                                                    LOCALES.get(INDICE).setJefe(GERENTE);
                                                    break;
                                                default:
                                                    System.out.println("LA OPCION ES INVALIDA");
                                            } 
                                            break;
                                        case 2:
                                            System.out.println("LISTA DE PRODUCTOS: ");
                                            for (Object o : PRODU) {
                                                System.out.println(PRODU.indexOf(o) + " = " + o);
                                            } 
                                            System.out.print("INGRESE PRODUCTO A MODIFICAR: ");
                                            int POSIS = sc.nextInt();
                                            System.out.println("1. MODIFICAR DESCRIPCION ");
                                            System.out.println("2. MODIFICAR NOMBRE");
                                            System.out.println("3. MODIFICAR PRECIO");
                                            System.out.print("INGRESE LA OPCION: ");
                                            int OP8 = sc.nextInt();
                                            switch (OP8) {
                                                case 1:
                                                    System.out.println("INGRESE NUEVA DESCRIPCION: ");
                                                    String DES = sc.nextLine();
                                                    PRODU.get(POSIS).setDescripcion(DES);
                                                    break;
                                                case 2:
                                                    System.out.println("INGRESE NUEVO NOMBRE: ");
                                                    String NUM = sc.nextLine();
                                                    PRODU.get(POSIS).setNombre(NUM);
                                                    break;
                                                case 3:
                                                    System.out.println("INGRESE NUEVO PRECIO: ");
                                                    double VALORR = sc.nextDouble();
                                                    PRODU.get(POSIS).setPrecio(VALORR);
                                                    break;
                                                default:
                                                    System.out.println("LA OPCION NO ES VALIDA,INTENTELO DE NUEVO");
                                            }break;
                                        case 3:
                                            System.out.println("LISTA DE PERSONAS: ");
                                            for (Object o : PERSONAS) {
                                                System.out.println(PERSONAS.indexOf(o) + " = " + o);
                                            }System.out.print("INGRESE INDICE DE LA PERSONA A MODIFICAR: ");
                                            int P = sc.nextInt();
                                            System.out.println("1. MODIFICAR IDENTIFICACION");
                                            System.out.println("2. MODIFICAR NOMBRE DE USUARIO");
                                            System.out.println("3. MODIFICAR CONTRASE?A");
                                            System.out.println("4. MODIFICAR E-MAIL");
                                            System.out.println("5. MODIFICAR NOMBRE");
                                            System.out.println("6. MODIFICAR FECHA DE NACIMIENTO");
                                            System.out.print("INGRES LA OPCION: ");
                                            int OP9 = sc.nextInt();
                                            switch (OP9) {
                                                case 1:
                                                    ID_TODOS.remove(P);
                                                    System.out.print("INGRESE NUEVO NUMERO DE IDENTIFICACION: ");
                                                    int IDENTIFICACION = sc.nextInt();
                                                    while (IDENTIFICA(IDENTIFICACION) == true) {
                                                        System.out.println("EL ID YA EXISTE");
                                                        System.out.print("INGRESE NUEVO NUMERO DE IDENTIFICACION: ");
                                                        IDENTIFICACION = sc.nextInt();
                                                    }((CLASE_EMPLEADO) PERSONAS.get(P)).setID(IDENTIFICACION);
                                                    ID_TODOS.add(IDENTIFICACION);
                                                    break;
                                                case 2:
                                                    USUARIOS .remove(P);
                                                    System.out.print("INGRESE NOMBRE DE USUARIO: ");
                                                    String USU = sc.next();
                                                    while (USUAR(USU) == true) {
                                                        System.out.println("ESTE USUARIO YA EXISTE");
                                                        System.out.print("INGRESE NOMBRE DE USUARIO: ");
                                                        USU = sc.next();
                                                    }((CLASE_EMPLEADO) PERSONAS.get(P)).setUsername(USU);
                                                    USUARIOS .add(USU);
                                                    break;
                                                case 3:
                                                    System.out.print("INGRESE CONTRASE?A NUEVA: ");
                                                    String PAASSWORDD = sc.next();
                                                    ((CLASE_EMPLEADO) PERSONAS.get(P)).setContraseña(PAASSWORDD);
                                                    break;
                                                case 4:
                                                    System.out.print("INGRESE SU NUEVO E-MAIL: ");
                                                    String EMA = sc.next();
                                                    ((CLASE_EMPLEADO) PERSONAS.get(P)).setContraseña(EMA);
                                                    break;
                                                case 5:
                                                    System.out.print("INGRESE NUEVO NOMBRE: ");
                                                    String NOMB = sc.next();
                                                    ((CLASE_EMPLEADO) PERSONAS.get(P)).setNombre(NOMB);
                                                    break;
                                                case 6:
                                                    SimpleDateFormat NWDATE = new SimpleDateFormat("dd/MM/yyyy");
                                                    System.out.println("INGRESE NUEVA FECHA DE NACIMIENTO");
                                                    String NATALICO = sc.next();
                                                    ((CLASE_EMPLEADO) PERSONAS.get(P)).setNacimiento(NWDATE .parse(NATALICO));
                                                    break;
                                                default:
                                                    System.out.println("LA OPCION NO ES VALIDA");
                                            } 
                                        case 4:
                                            
                                         break;
                                     default:   
                                    System.out.println("LA OPCION NO ES VALIDA");    
                                    }  break;
                                case 3:
                                    System.out.println("1. ELIMINAR LOCAL");
                                    System.out.println("2. ELIMINAR PRODUCTO");
                                    System.out.println("3. ELIMINAR PERSONA");
                                    System.out.print("INGRESE LA OPCION: ");
                                    int OP10= sc.nextInt();
                                    int DELETE;
                                    switch (OP10) {
                                        case 1:
                                            String STRING_LOCAL = "";
                                            for (int i = 0; i < LOCALES.size(); i++) {
                                                STRING_LOCAL += "[" + i + "]" + LOCALES.get(i);
                                            } System.out.println(STRING_LOCAL);
                                            System.out.println("INGRESE INDICE DEL LOCAL A ELIMINAR");
                                            DELETE = sc.nextInt();
                                            LOCALES.remove(DELETE);
                                            break;
                                        case 2:
                                            String STRING_PRODUCT = "";
                                            for (int i = 0; i < PRODU.size(); i++) {
                                                STRING_PRODUCT += "[" + i + "]" + PRODU.get(i);
                                            }System.out.println(STRING_PRODUCT);
                                            System.out.println("INGRESE INDICE DEL PRODUCTO A ELIMINAR");
                                            DELETE = sc.nextInt();
                                            PRODU.remove(DELETE);
                                            break;
                                        case 3:
                                            String STRING_EMPLE = "";
                                            CLASE_PERSONAS o = new CLASE_PERSONAS();
                                            for (int i = 0; i < PERSONAS.size(); i++) {
                                             STRING_EMPLE += "[" + i + "]" + PERSONAS.get(i);
                                             STRING_EMPLE += "\n";
                                            }System.out.println("INGRESE INDICE DE LA PERSONA A ELIMINAR");
                                            DELETE = sc.nextInt();
                                            PERSONAS.remove(DELETE);
                                            break;
                                        default:
                                            System.out.println("LA OPCION ES INVALIDA");
                                    }break;
                                case 4:
                                    System.out.println("INFORME DE GENERAL DE FACTURACION: ");
                                    System.out.println("LISTA DE PRODUCTOS VENDIDOS: ");
                                    System.out.println(PRO_VENDI);
                                    System.out.println("LISTA DE EMPLEADOS QUE VENDIERON: ");
                                    System.out.println(EMPLE_VENDI);
                                    System.out.println("LISTA DE CLIENTES COMPRADORES: ");
                                    System.out.println(VENTAS_DAYLE);
                                    System.out.println(" LISTA DE PRECIOS: ");
                                    System.out.println(PRECIOS);
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("LA OPCION NO ES VALIDA");
                            }} else{
                              System.out.println("El Usuario o contrasena es incorrecto");  
                             System.out.println("                                     "); 
                            }
                            
                            
                            
                            
                            
                            
                            
                            
                    
                    
                    
                            
                            break;
                        case 2:
                            System.out.print("INGRESE NOMBRE DE USUARIO: ");
                            String USUARIOSS = sc.next();
                            while (USUAR(USUARIOSS) == false) {
                                System.out.println("ESTE USUARIO NO ESTA REGISTRADO!! CREEMOS QUE INTENTA INFILTRAR NUESTAR SEGURIDAD");
                                System.out.println("TIENE UN INTENTO, DE LO CONTRARIO LA CIA IRRUMPIRA EN SU CASA EN ESTE MOMENTO");
                                System.out.print("INGRESE NOMBRE DE USUARIO: ");
                                USUARIOSS = sc.next();
                            } 
                            System.out.print("INGRESE PASSWORD: ");
                            String CONTRASE = sc.next();
                            while (LOGIN(USUARIOSS, CONTRASE) == false) {
                                System.out.println("CONTRASE?A INVALIDA... L@ TENEMOS VIGILAD@ ");
                                System.out.print("INGRESE PASSWORD: ");
                                CONTRASE = sc.next();
                            } 
                            System.out.println("BIENVENID@, PREGUNTE SIN COMPROMISO AMOR!!");
                            System.out.println("   ");
                            System.out.println("1. VER TIENDAS Y PRODUCTOS A DISPOSICION");
                            System.out.println("2. COMPRAR");
                            System.out.print("INGRESE LA OPCION QUE DESEA: ");
                            int OP11 = sc.nextInt();
                            int INDICE;
                            switch (OP11) {
                                case 1:
                                    System.out.println("ESTAS SON NUESTRAS TIENDAS DISPONIBLES:");
                                    for (Object o : LOCALES) {
                                        if (o instanceof LOCAL_TIENDA) {
                                            System.out.println(LOCALES.indexOf(o) + " = " + o);
                                        } 
                                    } 
                                    System.out.print("INGRESE LA TIENDA POR LA QUE SE QUIERE PASEAR : ");
                                    System.out.print("POR FAVOR COMPRE NO SOLO ME EMOCIONE!!! ");
                                    INDICE = sc.nextInt();
                                    System.out.println(LOCALES.get(INDICE).getProductos());
                                    break;
                                case 2:
                                    System.out.println("ESTAS SON NUESTRAS TIENDAS DISPONIBLES");
                                    for (Object o : LOCALES) {
                                        if (o instanceof LOCAL_TIENDA) {
                                            System.out.println(LOCALES.indexOf(o) + " = " + o);
                                        }
                                    }
                                    System.out.println("INGRESE LA TIENDA DONDE QUIERE COMPRAR");
                                    INDICE = sc.nextInt();
                                    while (INDICE - 1 > LOCALES.size()) {
                                        System.out.println("LA OPCION NO ES VALIDA, INGRESE DE NUEVO LA TIENDA");
                                        INDICE = sc.nextInt();
                                    }
                                    System.out.println(LOCALES.get(INDICE).getProductos());
                                    System.out.println("INGRESE EL INDICE DE PRODUCTO QUE DESEA COMPRAR");
                                    int SALE= sc.nextInt();
                                    System.out.println("INGRESE LA CANTIDAD DE ARITCULOS");
                                    int SALES = sc.nextInt();
                                    PRODUCTOS p = LOCALES.get(INDICE).getProductos().get(SALE); 
                                    PRECIOS.add(LOCALES.get(INDICE).getProductos().get(SALE));
                                    PRO_VENDI.add(p);
                                    while (p.getCantidad() < SALES) {
                                        System.out.println("INVENTARIO INSUFICIENTE, INGRESE UNA CANTIDAD MENOR, NO SEA MALIT@ Y COMPRA EL RESTO EN OTRO LADO!!");
                                        SALES = sc.nextInt();
                                    }
                                    CLASE_CLIENTES f = new CLASE_CLIENTES();
                                    String STRI= "";
                                    for (int i = 0; i < COMPRADORES.size(); i++) {

                                        STRI += "[" + i + "]" + COMPRADORES.get(i);

                                        STRI += "\n";
                                    }
                                    System.out.println(STRI);
                                    System.out.println("INGRESE INDICE DE LISTA DE CLIENTE");
                                    int atendido = sc.nextInt();
                                    double L;
                                    L = ((CLASE_CLIENTES) COMPRADORES.get(atendido)).getDINERO();
                                    VENTAS_DAYLE.add(((CLASE_CLIENTES) COMPRADORES.get(atendido)));
                                    double FINALGAS = p.getPrecio() * SALES;
                                    if (L < FINALGAS) {
                                        System.out.println("SU SALDO ES INSUFICIENTE PARA COMPRAR, NO SE PREOCUPE YO TAMBIEN SOY PODRE, FUERA JOH!!");
                                        break;
                                    } else {
                                        ((CLASE_CLIENTES) PERSONAS.get(atendido)).setDINERO(L - FINALGAS);
                                    }
                                    for (int I = 0; I < TRABAJADORES.size(); I++) {

                                        STRI += "[" + I + "]" + TRABAJADORES.get(I);

                                        STRI += "\n";
                                    }
                                    System.out.println(STRI);
                                    System.out.println("INGRESE INDICE DEL EMPLEADO QUE LO ATENDIO");
                                    int VENDEDOR = sc.nextInt(); 
                                    EMPLE_VENDI.add(((CLASE_EMPLEADO) TRABAJADORES.get(VENDEDOR)));
                                    PRO_VENDI.add(((CLASE_EMPLEADO) TRABAJADORES.get(VENDEDOR)).getProductoVendido());
                                    int VEN = ((CLASE_EMPLEADO) TRABAJADORES.get(VENDEDOR)).getProductoVendido() + 1;
                                    ((CLASE_EMPLEADO) TRABAJADORES.get(VENDEDOR)).setProductoVendido(VEN);
                                    break;
                            }
                            System.out.print("INGRESE LA OPCION: ");
                            int OP12 = sc.nextInt();
                            switch (OP12) {
                                default:
                                    System.out.println("OPCION NO VALIDA");
                            } 
                            break;
                         case 3:
                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");
                    } break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                case 2:
                    System.out.println("   ");
                    System.out.println("PARA REGISTRARSE INGRESE ESTA INFORMACION :");
                    int IDENTI = 10000 + R.nextInt(10000001);
                    while (IDENTIFICA(IDENTI) == true) {
                        IDENTI = 10000 + R.nextInt(100000);
                    } 
                    ID_TODOS.add(IDENTI);
                    System.out.print("NOMBRE DE USUARIO QUE LE GUSTARIA: ");
                    String US = sc.next();
                    if (!USUAR(US) == true) {
                        
                    USUARIOS .add(US);
                    System.out.print("INGRESE UNA BUENA CONTRASE?A: ");
                    String PASSW = sc.next();
                    PASSWORDS.add(PASSW);
                    System.out.print("INGRESE SU E-MAIL: ");
                    String EM = sc.next();
                    System.out.print("INGRESE NOMBRE COMPLETO: ");
                    String NOM = sc.nextLine();
                    NOM = sc.nextLine();
                    SimpleDateFormat DATES3 = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.print("INGRESE FECHA DE NACIMIENTO (dd/MM/yyyy): ");
                    String DATES = sc.next();
                    System.out.print("INGRESE SU SALDO DISPONIBLE, NO MIENTA PICARIT@!!: ");
                    double LPS = sc.nextDouble();
                    System.out.println("SU NUMERO DE IDENTIFICACION ES: " + IDENTI);
                    System.out.println("ESO ERA TODO!! USTED ES UN EXITO");
                    CLASE_CLIENTES CLI = new CLASE_CLIENTES(IDENTI, PASSW, EM, NOM, DATES3.parse(DATES), LPS, US);
                    PERSONAS.add(CLI);
                    
                    }else{
                      System.out.println("ESTE USUARIO YA EXISTE!");
                    } 
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                case 3:
                    r = 'n';
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                default:
                    System.out.println("LA OPCION NO ES VALIDA");
            } 
        } 
    }

    
    
        public static boolean USUAR(String USUARIO) {
        for (int i = 0; i < USUARIOS .size(); i++) {
            if (USUARIOS .get(i).equals(USUARIO)) {
                return true;
            } else {
                return false;
            }
        } 
        return false;
    } 
    
  

    public static boolean LOGIN(String NOM, String CONTRAS) {
        int POSICION;
        for (int i = 0; i <USUARIOS .size(); i++) {
            if (USUARIOS .get(i).equals(NOM)) {
                POSICION = i;
                if (PASSWORDS.get(POSICION).equals(CONTRAS)) {
                    return true;
                } else {
                    return false;
                }
            } 
        } 
        return false;
    }

    public static boolean IDENTIFICA(int IDENTIFICACION) {
        for (int i = 0; i < ID_TODOS.size(); i++) {
            if (ID_TODOS.get(i) == IDENTIFICACION) {
                return true;
            } else {
                return false;
            } 
        } 
        return false;
    }

} 

