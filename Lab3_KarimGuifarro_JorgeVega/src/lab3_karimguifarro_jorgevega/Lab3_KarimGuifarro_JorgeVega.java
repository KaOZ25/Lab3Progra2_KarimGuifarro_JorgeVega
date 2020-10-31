<<<<<<< HEAD

package lab3_karimguifarro_jorgevega;
=======
/*
 Laboratorio 3: Ya Casi es BlackFriday en Cuarentena
 */
package Lab3_KarimGuifarro_JorgeVega;

>>>>>>> 465830b3ea28f6da1d949090a0c3fa0958aae6d4
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_KarimGuifarro_JorgeVega {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    static boolean signedInAsAdministrator = false;
    static boolean signedInAsUser = false;
    
    static ArrayList<Registro> local = new ArrayList();
    static ArrayList<Integer> localesExistentes = new ArrayList();
    static ArrayList<Persona> empleadosenlocales = new ArrayList();
    
    static int contadorTotal = 0;
    static int contadorEmpleados = 0;
    static int contadorClientes = 0;
    
    static int contadorLocales = 0;

    public static void main(String[] args) {
  
        int opcion = 1;
        
        while (opcion!=0) {
            imprimirMenu();
            opcion = sc.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1:
                    
                    System.out.print("Ingrese el usuario: ");
                    String usuario = sc.next();
                    
                    System.out.print("Ingrese la conraseña: ");
                    String contraseña = sc.next();
                    System.out.println();
                    
                    if (usuario.equals("SUDO") && contraseña.equals("clau123")) {
                        signedInAsAdministrator = true;
                        System.out.println("Ingreso exitoso.");
                    } else {
                        System.out.println("El usuario y/o la contraseña ´son incorrectos.");
                    }
                    
                    while(signedInAsAdministrator){
                        menuAdministrador();
                    }
                    
                    break;
                case 2:
                System.out.print("Ingrese el número de id: ");
                int id = sc.nextInt();
                
                
                for (int i=0; i<local.size();i++){
                    Registro piso = local.get(i);

                    for(Persona p : piso.getHabitantes()){

                        if(p.getIdentificacion()==id){
                            signedInAsUser = true;
                            System.out.println("Ingreso exitoso.");
                        } else {
                        System.out.println("El usuario y/o la contraseña ´son incorrectos.");
                        }

                    }
                }

                while(signedInAsUser){
                    MenuUsuario();
                }
                    break;
                default:
                    System.out.println("Ha ingresado una opción inválida.");
                case 0:
            }
            
        }
        
        
        
    }
    
    public static void imprimirMenu(){
        System.out.println("1. Log-in as Administrator");
        System.out.println("2. Log-in as User");
        System.out.println("0. Salir");
        System.out.print("\n Ingrese la opción que desea: ");
    }

    public static void menuAdministrador(){
        
        System.out.println("\n*** ADMINISTRADOR ***");
        System.out.println("1.  Crear Persona"); //Terminado
        System.out.println("2.  Modificar Persona");
        System.out.println("3.  Elminar Persona");
        System.out.println("4.  Crear Producto"); //
        System.out.println("5.  Modificar Producto");
        System.out.println("6.  Eliminar Producto");
        System.out.println("7.  Crear Local");
        System.out.println("8.  Modificar Local");
        System.out.println("9.  Eliminar Local");
        System.out.println("10. Informe de Producto");
        System.out.println("11. Visualizar Locales y productos");
        System.out.println("12. Visualizar personas por tipo de Locales");
        System.out.println("13. Visualizar personas por Cargo");
        System.out.println("14. Log-out");
        System.out.print("\nIngrese la opción que desee: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        String nombre;

        switch (opcion) {
            case 1:
                crearPersona();
                break;
            case 2:
                modificarPersona();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                crearPiso();
                break;
            case 8:
                modificarPiso();
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                listarPorTipo(1);
                break;
            case 13:
                listarPorPosicion(1);
                break;
            case 14:
                signedInAsAdministrator = false;
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void crearPersona(){
        
        //Crear persona
        System.out.println("***CREAR PERSONA***\n");

        
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.next();
        
        System.out.println("\nPosiciones:");
        System.out.println("1-> Cliente");
        System.out.println("2-> Grenre de local");
        System.out.println("3-> Empleado");
        System.out.print("Ingrese la posición de la persona: ");
        int posi = sc.nextInt();
        System.out.println();
        
        while(posi<1 || posi>5){
            
            System.out.println("\tPosiciones:");
            System.out.println("\t1-> Cliente");
            System.out.println("\t2-> Gerente de local");
            System.out.println("\t3-> Empleado");
            System.out.print("\n\tIngrese la posición de la persona: ");
            posi = sc.nextInt();
            System.out.println();
        }
        
        String posicion="";
        switch(posi){
            case 1:
                posicion = "Cliente";
                break;
            case 2:
                posicion = "Gerente de local";
                break;
            case 3:
                posicion = "Empleado";
               
        }
        
        System.out.print("Ingrese el número de identificación de la persona: ");
        int id = sc.nextInt();
        
        for (int i=0; i<local.size(); i++) {
            
            for (Persona h : local.get(i).getHabitantes()) {
                //Conseguimos el id de cada persona de cada piso de la torre
                int identificacion = h.getIdentificacion();
                //Lo comparamos con el nuevo id
                if (identificacion==id) {
                    System.out.print("La identificación ingresada no stá disponible. Ingrese una diferente: ");
                    id = sc.nextInt();
                    i=-1;
                }
            }
        }
        
        System.out.println("\nTipos:");
        System.out.println("1-> Cliente");
        System.out.println("2-> Empleado");
        System.out.print("Ingrese el tipo de persona que es: ");
        int tipo = sc.nextInt();
        System.out.println();
        
        while(tipo<1 || tipo>2){
            
            System.out.println("\tTipos:");
            System.out.println("\t1-> Cliente");
            System.out.println("\t2-> Empleado");
            System.out.print("\n\tIngrese un tipo de persona válido: ");
            tipo = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("\nEstado de registro:");
        System.out.println("1-> Regular");
        System.out.println("2-> Irregular");
        System.out.print("Ingrese el estado de registro de la persona: ");
        int registro = sc.nextInt();
        System.out.println();
        
        while(registro<1 || registro>2){
            
            System.out.println("\tEstado de registro:");
            System.out.println("\t1-> Regular");
            System.out.println("\t2-> Irregular");
            System.out.print("\tIngrese un estado de registro válido: ");
            registro = sc.nextInt();
            System.out.println();
        }
        
       
    }
    
    public static void modificarPersona(){
        listarClientes();
        System.out.println();
        
        System.out.print("Ingrese el número de la persona a modificar: ");
        int nPersona = sc.nextInt();
        
        System.out.println("");
        
        
    }
    
    public static void listarregistrados(){
        int i=1;
        System.out.println("REGISTRO\n");
        for (Registro registro : local) {
            for (Persona habitante : registro.getHabitantes()) {
                System.out.println((i++) + ". " + habitante.toString());
            }
        }
    }
    
    public static void listarEmplados(int i){
        
        System.out.println("EMPLEADOS\n");
        for (int j = contadorClientes; j < contadorClientes; j++) {
            System.out.println((i) + ". " + empleadosenlocales.toString());
            i++;
        }
    }
    
    public static void listarClientes(){
        
        int i=1;
        System.out.println("CLIENTES\n");
        for (int j = 0; j < contadorClientes; j++) {
            System.out.println((i++) + ". " + empleadosenlocales.toString());
        }
<<<<<<< HEAD
    }
    
    public static Persona getPersonaEnLocal(int posicion){
        
        int i=1;
        for (Registro registro : local) {
            for (Persona habitante : registro.getHabitantes()) {
                if (i==posicion) {
                    return habitante;
                }
            }
        }
        
        return new Persona();
=======
    }
    
    public static Persona getPersonaEnLocal(int posicion){
        
        int i=1;
        for (Registro registro : local) {
            for (Persona habitante : registro.getHabitantes()) {
                if (i==posicion) {
                    return habitante;
                }
            }
        }
        
        return new Persona();
    }
    
    public static void crearPrueba(){
    
        System.out.print("Ingrese el nombre de la prueba: ");
        String nombre = sc.nextLine();
        
        listarEmpleados(1);
        System.out.print("Escoja al ranker evaluador de la prueba: ");
        int nRanker = sc.nextInt();
        sc.nextLine();
        
        while (nRanker<1 || nRanker>contadorEmpleados) {            
            listarEmpleados(1);
            System.out.print("Escoja un ranker válido: ");
            nRanker = sc.nextInt();
            sc.nextLine();
        }
        
  
        
        boolean agregarPersonas = true;
            
        while (agregarPersonas){
            listarClientes();
                
            System.out.print("Ingrese el indice de la persona a agregar a la tienda: ");
            int index = sc.nextInt();
                
            while(index < 1 || index > contadorClientes){
                System.out.print("El indice es incorrecto! Ingrese de nuevo: ");
                index = sc.nextInt();
            }
                
            System.out.print("Desea seguir agregando personas 1 = si Otro número = no: ");
            int decision = sc.nextInt();
                
            if(decision != 1){
                agregarPersonas = false;
            }    
        }
        
        
        
        boolean aprobada = respuesta==1;

        
>>>>>>> 465830b3ea28f6da1d949090a0c3fa0958aae6d4
    }

    public static void crearPiso(){

        System.out.println("Crear Local");
        System.out.println();
        
        System.out.print("Ingrese el nombre del gerente de local: ");
        String administrador = sc.next();
        System.out.println();
        
        
        System.out.print("Ingrese el tipo de local: ");
        int nivel = sc.nextInt();
        
        while(nivel < 0 || nivel > 134 || localesExistentes.contains(nivel)){
            System.out.print("El nivel ingresado es inválido! Ingrese de nuevo: ");
            nivel = sc.nextInt();
        }
        
        local.add(new Registro(administrador));
        contadorLocales++;
        
        boolean evaluadores = true;
        
        while(evaluadores){
            
            listarEmpleados(1);
            
            System.out.print("Ingrese el indice de la persona: ");
            int indice = sc.nextInt();
                
            while(indice < 1 || indice > contadorEmpleados){
                System.out.print("El indice ingresado es incorrecto! Ingrese de nuevo: ");
                indice = sc.nextInt();
            }
                
            Ranker n =(Ranker)empleadosenlocales.get(contadorClientes + indice - 1);
            local.get(contadorLocales).getEvaluadores().add(n);
            
            System.out.print("Desea seguir agregando gerentes 1= si Otro número= no: ");
            int c = sc.nextInt();
                
            if(c != 1){
                evaluadores = false;
            }
        }
            
        boolean hayDirector = false;
            
        while(hayDirector == false){
            int limit = empleadosenlocales.size()-1;
            int ale = 0+r.nextInt(limit);
                
            if(empleadosenlocales.get(ale) instanceof Empleado){
                local.get(contadorLocales).setDirector((Empleado)empleadosenlocales.get(ale));
                hayDirector = true;
            }
            
        }
            
        boolean agregarPersonas = true;
            
        while (agregarPersonas){
            listarClientes();
                
            System.out.print("Ingrese el indice de la persona a agregar al local: ");
            int index = sc.nextInt();
                
            while(index < 1 || index > contadorClientes){
                System.out.print("El indice es incorrecto! Ingrese de nuevo: ");
                index = sc.nextInt();
            }
                
            local.get(contadorLocales).getHabitantes().add(empleadosenlocales.get(index-1));
                
            System.out.print("Desea seguir agregando personas 1 = si Otro número = no: ");
            int decision = sc.nextInt();
                
            if(decision != 1){
                agregarPersonas = false;
            }    
        }
        System.out.println("El piso se ha agregado exitosamente al local!");
        System.out.println();
            
        contadorLocales++;
        
    }
    
    public static void listarPorTipo(int i){
        listarClientes();
        listarEmplados(i);
    }

    public static void listarPorPosicion(int i){
        System.out.println("Clientes");
        for(Persona p : empleadosenlocales){
            if (p.getPosicion().toString().equals("Pescador")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();

        System.out.println("Gerentes de local");
        for(Persona p : empleadosenlocales){
            if (p.getPosicion().toString().equals("Portador de lanzas")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();

        System.out.println("Empleados");
        for(Persona p : empleadosenlocales){
            if (p.getPosicion().toString().equals("Portador de luz")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        
    }

    public static void MenuUsuario(){
        System.out.println("\n*** USUARIO ***");
        
        System.out.println("1. Visualizar Locales");
        System.out.println("2. Visualizar personas por tipo");
        System.out.println("3. Visualizar personas por posición");
        System.out.println("4. Log-out");
        System.out.print("\nIngrese la opción que desee: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        String nombre;
     
        switch (opcion) {
            case 1:
                break;
            case 2:
                listarPorTipo(1);
                break;
            case 3:
                listarPorPosicion(1);
                break;
            case 4:
                signedInAsUser = false;
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

<<<<<<< HEAD
    public static void modificarLocal() {
=======
    public static void modificarPiso() {
>>>>>>> 465830b3ea28f6da1d949090a0c3fa0958aae6d4
        System.out.println("Modificar Local");
        System.out.println();

        System.out.println("Lista de Locales");
        for (Registro p : local) {
            System.out.println(local.indexOf(p) + ". " + p);
        }
        System.out.println();

        System.out.println("Elija el indice del Local a modificar: ");
        int indice = sc.nextInt();

        while (indice > local.size() || indice < 0) {
            System.out.println("El indice ingresado es incorrecto!");
            indice = sc.nextInt();
            System.out.println();
        }

        System.out.println("-> Elija el atributo a modificar: ");
        System.out.println("1) Modificar administrador");
        System.out.println("2) Modificar empleados");
        System.out.println("3) Asignar un nuevo gerente");
        System.out.println("4) Asignar nuevo nivel");
        System.out.println("5) Modificar lista de emplados");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Modificar administrador");
                System.out.println();

                System.out.println("Ingrese el nombre del nuevo administrador: ");
                String nombre = sc.next();
                System.out.println();

                local.get(indice).setAdministrador(nombre);

                System.out.println("Se cambio el administrador correctamente");
                System.out.println();

                break;

            case 2:
                System.out.println("Modificar Empleados");
                System.out.println();

                System.out.println("-> Ingrese la opcion a ejecutar: ");
                System.out.println("1) Agregar Empleados");
                System.out.println("2) Eliminar Emplados");
                int index = sc.nextInt();

                switch (index) {

                    case 1:

                        System.out.println("Elija el indice del Local a agregar");
                        int s = sc.nextInt();
                        System.out.println("Se agrego un nuevo empleado a la lista");
                        System.out.println();
                        break;

                    case 2:
                        for (Persona p : local.get(indice).getEvaluadores()) {
                            System.out.println(local.get(indice).getEvaluadores().indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice del empleado a eliminar");
                        int num = sc.nextInt();

                        while (num > local.get(indice).getEvaluadores().size() - 1 || num < 0) {
                            System.out.println("El indice ingresado es incorrecto!");
                            num = sc.nextInt();
                        }

                        local.get(indice).getEvaluadores().remove(num);

                        System.out.println("El evaluador ha sido eliminado de la lista");
                        System.out.println();
                        break;

                    default:
                        System.out.println("Se equivoco de opcion...");
                        System.out.println();
                }
                break;

            case 3:
                System.out.println("Asignar un nuevo gerente");
                System.out.println();

                boolean hayDirector = false;

                while (hayDirector == false) {
                    int limit = empleadosenlocales.size() - 1;
                    int ale = 0 + r.nextInt(limit);

                    if (empleadosenlocales.get(ale) instanceof Ranker) {
                        local.get(contadorLocales).setDirector((Ranker) empleadosenlocales.get(ale));
                        hayDirector = true;
                    }
                }
                System.out.println("Un nuevo gerente se agrego aleatoreamente");
                System.out.println();

                break;

            case 4:
                System.out.println("Modificar el tipo del local");
                System.out.println();

                System.out.println("Ingese el nuevo tipo de local");
                int nivel = sc.nextInt();

                boolean incorrecto = true;

                while (incorrecto) {
                    boolean ciclo;
                    ciclo = validarLocal(nivel);

                    if (ciclo) {
                        incorrecto = false;
                    }else{
                        System.out.println("Ingrese un tipo correcto");
                        nivel = sc.nextInt();
                        
                        while(nivel > 134 || nivel < 0){
                            System.out.println("Ingrese un tipo correcto!");
                            nivel = sc.nextInt();
                        }
                    }
                }

                local.get(indice).setNivel(nivel);

                System.out.println("El tipo del Local se modifico correctamente");
                System.out.println();
                break;

            case 5:
                System.out.println("Modificar Empleado");
                System.out.println();

                System.out.println("-> Ingrese su eleccion: ");
                System.out.println("1) Agregar personas");
                System.out.println("2) Eliminar una persona");
                int eleccion = sc.nextInt();

                switch (eleccion) {

                    case 1:
                        System.out.println("Agregar persona");
                        System.out.println();

                        for (Persona p : empleadosenlocales) {
                            System.out.println(empleadosenlocales.indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice de la empleado a agregar: ");
                        int e = sc.nextInt();

                        while (e > empleadosenlocales.size() - 1 || e < 0) {
                            System.out.println("El indice es incorrecto!");
                            e = sc.nextInt();
                        }

                        local.get(indice).getHabitantes().add(empleadosenlocales.get(e));

                        System.out.println("Se agrego un nuevo empleado a la lista");
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Eliminar empleado");
                        System.out.println();

                        for (Persona p : local.get(indice).getHabitantes()) {
                            System.out.println(local.get(indice).getHabitantes().indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice del empleado a eliminar: ");
                        int n = sc.nextInt();

                        while (n > local.get(indice).getHabitantes().size() - 1 || n < 0) {
                            System.out.println("El indice ingresado es incorrecto!");
                            n = sc.nextInt();
                        }

                        local.get(n).getHabitantes().remove(n);

                        System.out.println("El empleado se ha eliminado del local");
                        System.out.println();

                        break;
                }
                break;

            case 6:
                System.out.println("Ha decidido salir");
                break;

            default:
                System.out.println("La opcion es incorrecta!");
                System.out.println();
        }
    }

    public static boolean validarLocal(int nivel) {

        boolean correcto = false;
        int c = 0;

        for (int i = 0; i < local.size(); i++) {
            int numero = local.get(i).getTipo();

            if (nivel == numero) {
                c++;
            }
        }

        if (c == 0) {
            correcto = true;
        }

        return correcto;
    }

}

