/*
 Laboratorio 3: Ya Casi es BlackFriday en Cuarentena
 */
package Lab3_KarimGuifarro_JorgeVega;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_KarimGuifarro_JorgeVega {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    static boolean signedInAsAdministrator = false;
    static boolean signedInAsUser = false;
    
    static ArrayList<Piso> torre = new ArrayList();
    static ArrayList<Integer> pisosExistentes = new ArrayList();
    static ArrayList<Persona> personasEnTorre = new ArrayList();
    static ArrayList<Prueba> pruebas = new ArrayList();
    
    static int contadorPersonas = 0;
    static int contadorRankers = 0;
    static int contadorNormales = 0;
    
    static int contadorPisos = 0;
    static int contadorPruebas = 0;

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
                    
                    if (usuario.equals("SUDO") && contraseña.equals("111new")) {
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
                
                
                for (int i=0; i<torre.size();i++){
                    Piso piso = torre.get(i);

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
        System.out.println("\nTOWER OF GOD\n");
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
        System.out.println("4.  Crear Prueba"); //
        System.out.println("5.  Modificar Prueba");
        System.out.println("6.  Eliminar Prueba");
        System.out.println("7.  Crear Piso");
        System.out.println("8.  Modificar Piso");
        System.out.println("9.  Eliminar Piso");
        System.out.println("10. Informe de pruebas");
        System.out.println("11. Visualizar pisos y pruebas");
        System.out.println("12. Visualizar personas por tipo");
        System.out.println("13. Visualizar personas por posición");
        System.out.println("14. Log-out");
        System.out.print("\nIngrese la opción que desee: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        String nombre;
        /*
        contadorPisos++;
        torre.add(new Piso());
        pisosExistentes.add(1);
        */
        switch (opcion) {
            case 1:
                //Crear persona
                crearPersona();
                break;
            case 2:
                //Modificar persona
                modificarPersona();
                break;
            case 3:
                //Eliminar persona
                break;
            case 4:
                //Crear prueba
                crearPrueba();
                break;
            case 5:
                //modificar prueba
                break;
            case 6:
                //eliminar prueba
                break;
            case 7:
                //crear piso
                crearPiso();
                break;
            case 8:
                //modificar piso
                modificarPiso();
                break;
            case 9:
                //eliminar piso
                break;
            case 10:
                //Infrome de pruebas
                break;
            case 11:
                //Listado pisos y pruebas
                break;
            case 12:
                //Listado tipo
                listarPorTipo(1);
                break;
            case 13:
                //Listado posición
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
        System.out.println("1-> Pescador");
        System.out.println("2-> Portador de lanzas");
        System.out.println("3-> Portador de luz");
        System.out.println("4-> Explorador");
        System.out.println("5-> Manipulador de ondas");
        System.out.print("Ingrese la posición de la persona: ");
        int posi = sc.nextInt();
        System.out.println();
        
        //Validación de que sea una posición válida
        while(posi<1 || posi>5){
            
            System.out.println("\tPosiciones:");
            System.out.println("\t1-> Pescador");
            System.out.println("\t2-> Portador de lanzas");
            System.out.println("\t3-> Portador de luz");
            System.out.println("\t4-> Explorador");
            System.out.println("\t5-> Manipulador de ondas");
            System.out.print("\n\tIngrese la posición de la persona: ");
            posi = sc.nextInt();
            System.out.println();
        }
        
        String posicion="";
        switch(posi){
            case 1:
                posicion = "Pescador";
                break;
            case 2:
                posicion = "Portador de lanzas";
                break;
            case 3:
                posicion = "Portador de luz";
                break;
            case 4:
                posicion = "Explorador";
                break;
            case 5:
                posicion = "Manipulador de ondas";
        }
        
        System.out.print("Ingrese el número de identificación de la persona: ");
        int id = sc.nextInt();
        
        for (int i=0; i<torre.size(); i++) {
            
            for (Persona h : torre.get(i).getHabitantes()) {
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
        System.out.println("1-> Normal");
        System.out.println("2-> Ranker");
        System.out.print("Ingrese el tipo de persona que es: ");
        int tipo = sc.nextInt();
        System.out.println();
        
        //Validación de que sea una posición válida
        while(tipo<1 || tipo>2){
            
            System.out.println("\tTipos:");
            System.out.println("\t1-> Normal");
            System.out.println("\t2-> Ranker");
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
        
        //Validación de que sea una posición válida
        while(registro<1 || registro>2){
            
            System.out.println("\tEstado de registro:");
            System.out.println("\t1-> Regular");
            System.out.println("\t2-> Irregular");
            System.out.print("\tIngrese un estado de registro válido: ");
            registro = sc.nextInt();
            System.out.println();
        }
        
        /*
        int pisoEnLista=0;
        for (int i = 0; i < torre.size(); i++) {
            if (cualPiso==torre.get(i).getNivel()) {
                pisoEnLista = i;
            }
        }
        */
        
        //Creamos el estado de registro
        EstadoRegistro estado;
                
        //En caso de ser regular
        if (registro==1) {
            System.out.print("Cree un usuario: ");
            String usuario = sc.next();
            System.out.print("Cree una contraseña: ");
            String contraseña = sc.next();
            estado = new Regular(usuario, posicion);
        } else {
            estado = new Irregular();
        }
        
        //En caso de ser normal...
        if(tipo==1){
            System.out.print("Escriba el obetivo de la persona: ");
            sc.nextLine();
            String objetivo = sc.nextLine();
                
            //Creamos la persona
            personasEnTorre.add(contadorNormales,new Normal(objetivo, nombre, id, new Posicion(posicion), estado));
            contadorNormales++;
        } else {
            personasEnTorre.add(new Ranker(nombre, id, new Posicion(posicion), estado));
            contadorRankers++;
        }
        
        contadorPersonas++;
        
    }//Fin de crearPersona
    
    public static void modificarPersona(){
        listarPersonas();
        System.out.println();
        
        System.out.print("Ingrese el número de la persona a modificar: ");
        int nPersona = sc.nextInt();
        
        System.out.println("");
        
        
    }
    
    public static void listarPersonas(){
        int i=1;
        System.out.println("PERSONAS\n");
        for (Piso piso : torre) {
            for (Persona habitante : piso.getHabitantes()) {
                System.out.println((i++) + ". " + habitante.toString());
            }
        }
    }
    
    public static void listarRankers(int i){
        
        System.out.println("RANKERS\n");
        for (int j = contadorNormales; j < contadorPersonas; j++) {
            System.out.println((i) + ". " + personasEnTorre.toString());
            i++;
        }
    }
    
    public static void listarNormales(){
        
        int i=1;
        System.out.println("NORMALES\n");
        for (int j = 0; j < contadorNormales; j++) {
            System.out.println((i++) + ". " + personasEnTorre.toString());
        }
    }
    
    public static Persona getPersonaEnTorre(int posicion){
        
        int i=1;
        for (Piso piso : torre) {
            for (Persona habitante : piso.getHabitantes()) {
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
        
        listarRankers(1);
        System.out.print("Escoja al ranker evaluador de la prueba: ");
        int nRanker = sc.nextInt();
        sc.nextLine();
        
        while (nRanker<1 || nRanker>contadorRankers) {            
            listarRankers(1);
            System.out.print("Escoja un ranker válido: ");
            nRanker = sc.nextInt();
            sc.nextLine();
        }
        
        Prueba test = new Prueba(nombre, (Ranker) personasEnTorre.get(contadorNormales + nRanker-1));
        pruebas.add(test);
        
        boolean agregarPersonas = true;
            
        while (agregarPersonas){
            listarNormales();
                
            System.out.print("Ingrese el indice de la persona a agregar al equipo: ");
            int index = sc.nextInt();
                
            while(index < 1 || index > contadorNormales){
                System.out.print("El indice es incorrecto! Ingrese de nuevo: ");
                index = sc.nextInt();
            }
                
            pruebas.get(contadorPruebas).getParticipantes().add((Normal)personasEnTorre.get(index-1));
                
            System.out.print("Desea seguir agregando personas 1 = si Otro número = no: ");
            int decision = sc.nextInt();
                
            if(decision != 1){
                agregarPersonas = false;
            }    
        }
        
        System.out.print("¿Fue la prueba aprobada?\n1.Sí\n2.No\nRespuesta: ");
        int respuesta = sc.nextInt();
        
        while (respuesta<1 || respuesta>2) {
            System.out.print("\t¿Fue la prueba aprobada?\n\t1.Sí\n\t2.No\n\tRespuesta: ");
            respuesta = sc.nextInt();
        }
        
        boolean aprobada = respuesta==1;

        pruebas.get(contadorPruebas).setAprobada(aprobada);

        contadorPruebas++;
        
    }

    public static void crearPiso(){

        System.out.println("Crear Piso");
        System.out.println();
        
        System.out.print("Ingrese el nombre del administrador del piso: ");
        String administrador = sc.next();
        System.out.println();
        
        
        System.out.print("Ingrese el nivel del piso: ");
        int nivel = sc.nextInt();
        
        while(nivel < 0 || nivel > 134 || pisosExistentes.contains(nivel)){
            System.out.print("El nivel ingresado es inválido! Ingrese de nuevo: ");
            nivel = sc.nextInt();
        }
        
        torre.add(new Piso(administrador));
        contadorPisos++;
        
        boolean evaluadores = true;
        
        while(evaluadores){
            
            listarRankers(1);
            
            System.out.print("Ingrese el indice de la persona: ");
            int indice = sc.nextInt();
                
            while(indice < 1 || indice > contadorRankers){
                System.out.print("El indice ingresado es incorrecto! Ingrese de nuevo: ");
                indice = sc.nextInt();
            }
                
            Ranker n =(Ranker)personasEnTorre.get(contadorNormales + indice - 1);
            torre.get(contadorPisos).getEvaluadores().add(n);
            
            System.out.print("Desea seguir agregando evaluadores 1= si Otro número= no: ");
            int c = sc.nextInt();
                
            if(c != 1){
                evaluadores = false;
            }
        }
            
        boolean hayDirector = false;
            
        while(hayDirector == false){
            int limit = personasEnTorre.size()-1;
            int ale = 0+r.nextInt(limit);
                
            if(personasEnTorre.get(ale) instanceof Ranker){
                torre.get(contadorPisos).setDirector((Ranker)personasEnTorre.get(ale));
                hayDirector = true;
            }
            
        }
            
        boolean agregarPersonas = true;
            
        while (agregarPersonas){
            listarPersonas();
                
            System.out.print("Ingrese el indice de la persona a agregar al piso: ");
            int index = sc.nextInt();
                
            while(index < 1 || index > contadorPersonas){
                System.out.print("El indice es incorrecto! Ingrese de nuevo: ");
                index = sc.nextInt();
            }
                
            torre.get(contadorPisos).getHabitantes().add(personasEnTorre.get(index-1));
                
            System.out.print("Desea seguir agregando personas 1 = si Otro número = no: ");
            int decision = sc.nextInt();
                
            if(decision != 1){
                agregarPersonas = false;
            }    
        }
        System.out.println("El piso se ha agregado exitosamente a la torre!");
        System.out.println();
            
        contadorPisos++;
        
    }
    
    public static void listarPorTipo(int i){
        listarNormales();
        listarRankers(i);
    }

    public static void listarPorPosicion(int i){
        System.out.println("Pescadores");
        for(Persona p : personasEnTorre){
            if (p.getPosicion().toString().equals("Pescador")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();

        System.out.println("Portadores de lanzas");
        for(Persona p : personasEnTorre){
            if (p.getPosicion().toString().equals("Portador de lanzas")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();

        System.out.println("Portadores de luz");
        for(Persona p : personasEnTorre){
            if (p.getPosicion().toString().equals("Portador de luz")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();

        System.out.println("Exploradores");
        for(Persona p : personasEnTorre){
            if (p.getPosicion().toString().equals("Explorador")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();

        System.out.println("Manipuladores de ondas");
        for(Persona p : personasEnTorre){
            if (p.getPosicion().toString().equals("Manipulador de ondas")){
                System.out.println((i++)+". "+p.toString());
            }
        }
        System.out.println();
    }

    public static void MenuUsuario(){
        System.out.println("\n*** USUARIO ***");
        
        System.out.println("1. Visualizar pisos y pruebas");
        System.out.println("2. Visualizar personas por tipo");
        System.out.println("3. Visualizar personas por posición");
        System.out.println("4. Log-out");
        System.out.print("\nIngrese la opción que desee: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        String nombre;
        /*
        contadorPisos++;
        torre.add(new Piso());
        pisosExistentes.add(1);
        */
        switch (opcion) {
            case 1:
                //Listado pisos y pruebas
                break;
            case 2:
                //Listado tipo
                listarPorTipo(1);
                break;
            case 3:
                //Listado posición
                listarPorPosicion(1);
                break;
            case 4:
                signedInAsUser = false;
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void modificarPiso() {
        System.out.println("Modificar piso");
        System.out.println();

        System.out.println("Lista de pisos");
        for (Piso p : torre) {
            System.out.println(torre.indexOf(p) + ". " + p);
        }
        System.out.println();

        System.out.println("Elija el indice del piso a modificar: ");
        int indice = sc.nextInt();

        while (indice > torre.size() || indice < 0) {
            System.out.println("El indice ingresado es incorrecto!");
            indice = sc.nextInt();
            System.out.println();
        }

        System.out.println("-> Elija el atributo a modificar: ");
        System.out.println("1) Modificar administrador");
        System.out.println("2) Modificar evaluadores");
        System.out.println("3) Asignar un nuevo director");
        System.out.println("4) Asignar nuevo nivel");
        System.out.println("5) Modificar lista de habitantes");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Modificar administrador");
                System.out.println();

                System.out.println("Ingrese el nombre del nuevo administrador: ");
                String nombre = sc.next();
                System.out.println();

                torre.get(indice).setAdministrador(nombre);

                System.out.println("Se cambio el administrador correctamente");
                System.out.println();

                break;

            case 2:
                System.out.println("Modificar evaluadores");
                System.out.println();

                System.out.println("-> Ingrese la opcion a ejecutar: ");
                System.out.println("1) Agregar evaluadores");
                System.out.println("2) Eliminar evaluadores");
                int index = sc.nextInt();

                switch (index) {

                    case 1:
                        // desplegar lista de rankers

                        System.out.println("Elija el indice del ranker a agregar");
                        int s = sc.nextInt();
                        //agregar validacion while de indice lista de rankers

                        //ranker r = personas.get(indice);
                        //torre.get(indice).getEvaluadores().add(r);
                        System.out.println("Se agrego un nuevo evaluador a la lista");
                        System.out.println();
                        break;

                    case 2:
                        for (Persona p : torre.get(indice).getEvaluadores()) {
                            System.out.println(torre.get(indice).getEvaluadores().indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice del evaluador a eliminar");
                        int num = sc.nextInt();

                        while (num > torre.get(indice).getEvaluadores().size() - 1 || num < 0) {
                            System.out.println("El indice ingresado es incorrecto!");
                            num = sc.nextInt();
                        }

                        torre.get(indice).getEvaluadores().remove(num);

                        System.out.println("El evaluador ha sido eliminado de la lista");
                        System.out.println();
                        break;

                    default:
                        System.out.println("Se equivoco de opcion...");
                        System.out.println();
                }
                break;

            case 3:
                System.out.println("Asignar un nuevo director");
                System.out.println();

                boolean hayDirector = false;

                while (hayDirector == false) {
                    int limit = personasEnTorre.size() - 1;
                    int ale = 0 + r.nextInt(limit);

                    if (personasEnTorre.get(ale) instanceof Ranker) {
                        torre.get(contadorPisos).setDirector((Ranker) personasEnTorre.get(ale));
                        hayDirector = true;
                    }
                }
                System.out.println("Un nuevo director se agrego aleatoreamente");
                System.out.println();

                break;

            case 4:
                System.out.println("Modificar el nivel del piso");
                System.out.println();

                System.out.println("Ingese el nuevo nivel del piso");
                int nivel = sc.nextInt();

                boolean incorrecto = true;

                while (incorrecto) {
                    boolean ciclo;
                    ciclo = validarPiso(nivel);

                    if (ciclo) {
                        incorrecto = false;
                    }else{
                        System.out.println("Ingrese un nivel correcto");
                        nivel = sc.nextInt();
                        
                        while(nivel > 134 || nivel < 0){
                            System.out.println("Ingrese un nivel correcto!");
                            nivel = sc.nextInt();
                        }
                    }
                }

                torre.get(indice).setNivel(nivel);

                System.out.println("El nivel del piso se modifico correctamente");
                System.out.println();
                break;

            case 5:
                System.out.println("Modificar habitantes");
                System.out.println();

                System.out.println("-> Ingrese su eleccion: ");
                System.out.println("1) Agregar personas");
                System.out.println("2) Eliminar una persona");
                int eleccion = sc.nextInt();

                switch (eleccion) {

                    case 1:
                        System.out.println("Agregar persona");
                        System.out.println();

                        for (Persona p : personasEnTorre) {
                            System.out.println(personasEnTorre.indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice de la persona a agregar: ");
                        int e = sc.nextInt();

                        while (e > personasEnTorre.size() - 1 || e < 0) {
                            System.out.println("El indice es incorrecto!");
                            e = sc.nextInt();
                        }

                        torre.get(indice).getHabitantes().add(personasEnTorre.get(e));

                        System.out.println("Se agrego un nuevo habitante a la lista");
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Eliminar persona");
                        System.out.println();

                        for (Persona p : torre.get(indice).getHabitantes()) {
                            System.out.println(torre.get(indice).getHabitantes().indexOf(p) + ". " + p);
                        }
                        System.out.println();

                        System.out.println("Ingrese el indice de la persona a eliminar: ");
                        int n = sc.nextInt();

                        while (n > torre.get(indice).getHabitantes().size() - 1 || n < 0) {
                            System.out.println("El indice ingresado es incorrecto!");
                            n = sc.nextInt();
                        }

                        torre.get(n).getHabitantes().remove(n);

                        System.out.println("El habitante se ha eliminado del piso");
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

    public static boolean validarPiso(int nivel) {

        boolean correcto = false;
        int c = 0;

        for (int i = 0; i < torre.size(); i++) {
            int numero = torre.get(i).getNivel();

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