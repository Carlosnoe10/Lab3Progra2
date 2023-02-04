package lab3progra2_carlosnoe;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3Progra2_CarlosNoe {

    static ArrayList<Clientes> Personas = new ArrayList();
    static ArrayList<Concesionario> Listado = new ArrayList();

    public static void main(String[] args) {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. CRUD Concecionaria \n"
                + "2. CRUD Clientes \n"
                + "3. CRUD Vehiculos \n"
                + "4. Compra y venta de vehiculos \n"
                + "5. Salida");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 5) {
                if ((menu > 0) && (menu < 6)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CRUDConcecionaria();
                            break;
                        case 2:
                            CRUDClientes();
                            break;
                        case 3:
                            CRUDVehiculos();
                            break;
                        case 4:
                            Comprayventadevehiculos();
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. CRUD Concecionaria \n"
                            + "2. CRUD Clientes \n"
                            + "3. CRUD Vehiculos \n"
                            + "4. Compra y venta de vehiculos\n"
                            + "5. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CRUDConcecionaria() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 3) {
                if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearConsecionaria();
                            break;
                        case 2:
                            MODCliente();
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CRUDClientes() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 3) {
                if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearCliente();
                            break;
                        case 2:
                            MODCliente();
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CrearCliente() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Ingrese el ID del cliente ");
        String ID = k1ng.nextLine();
        k1ng = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del cliente: ");
        String nombre = k1ng.nextLine();
        k1ng = new Scanner(System.in);
        System.out.println("Ingrese el presupuesto del cliente: ");
        int Billetera = k1ng.nextInt();
        Clientes cliente = new Clientes(ID, nombre, Billetera);
        Personas.add(cliente);
    }

    public static void CRUDVehiculos() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Crear \n"
                + "2. Modificar");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 3) {
                if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            CrearVehiculos();
                            break;
                        case 2:
                            ModVehiculos();
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Crear \n"
                            + "2. Modificar");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void CrearVehiculos() {
        for (int j = 0; j < 1; j++) {
            boolean Teemo = false;
            Scanner k1ng = new Scanner(System.in);
            System.out.println("Ingrese le color ");
            String Color = k1ng.nextLine();
            k1ng = new Scanner(System.in);
            System.out.println("Ingrese le Modelo ");
            String Modelo = k1ng.nextLine();
            k1ng = new Scanner(System.in);
            System.out.println("Ingrese el anio de fabricacion");
            int Fabri = k1ng.nextInt();
            System.out.println("Ingrese el precio");
            int Precio = k1ng.nextInt();
            System.out.println("Ingrese la cantidad de llantas ");
            int llantas = k1ng.nextInt();
            if (Precio > 0 && llantas > 0) {
                j++;
                if (Listado.isEmpty()) {
                    System.out.println("No se puede crear un vehiculo");
                } else {
                    if (llantas == 2) {
                        for (int k = 0; k < 1; k++) {
                            System.out.println("Ingrese si desea (1)bicicleta o (2)motocicleta");
                            int des = k1ng.nextInt();
                            if (des == 1) {
                                k++;
                                k1ng = new Scanner(System.in);
                                System.out.println("Ingrese la descripcion de la Bici ");
                                String Descript = k1ng.nextLine();
                                k1ng = new Scanner(System.in);
                                System.out.println("Ingrese el radio de la rueda");
                                double ratio = k1ng.nextDouble();
                                k1ng = new Scanner(System.in);
                                System.out.println("Ingrese el tipo de rueda ");
                                String Type = k1ng.nextLine();
                                Bicicleta bici = new Bicicleta(Descript, ratio, Type, Color, Modelo, Fabri, Precio, llantas);
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
                                    int Cambiar = k1ng.nextInt();
                                    if (Cambiar >= Listado.size()) {
                                        i--;
                                        System.out.println("Mal Ingresado");
                                    } else {
                                        i++;
                                        Listado.get(Cambiar).VehiculosVenta.add(bici);
                                    }
                                }
                            } else if (des == 2) {
                                k++;
                                System.out.println("Ingrese el desplasamiento");
                                int Despla = k1ng.nextInt();
                                Motocicleta moto = new Motocicleta(Despla, Color, Modelo, Fabri, Precio, llantas);
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
                                    int Cambiar = k1ng.nextInt();
                                    if (Cambiar >= Listado.size()) {
                                        i--;
                                        System.out.println("Mal Ingresado");
                                    } else {
                                        i++;
                                        Listado.get(Cambiar).VehiculosVenta.add(moto);
                                    }
                                }
                            } else {
                                k--;
                            }
                        }
                    } else if (llantas == 4) {
                        System.out.println("Ingrese las puertas del vehiculo ");
                        int Puertas = k1ng.nextInt();
                        k1ng = new Scanner(System.in);
                        System.out.println("Ingrese una descripcion del motor");
                        String descript = k1ng.nextLine();
                        k1ng = new Scanner(System.in);
                        System.out.println("Ingrese la velocidad maxima");
                        int Vell = k1ng.nextInt();
                        Carro car = new Carro(Puertas, descript, Vell, Color, Modelo, Fabri, Precio, llantas);
                        for (int i = 0; i < 1; i++) {
                            System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
                            int Cambiar = k1ng.nextInt();
                            if (Cambiar >= Listado.size()) {
                                i--;
                                System.out.println("Mal Ingresado");
                            } else {
                                i++;
                                Listado.get(Cambiar).VehiculosVenta.add(car);
                            }
                        }

                    } else if (llantas > 4) {
                        for (int h = 0; h < 1; h++) {
                            System.out.println(" Desea un camion de carga (1) y (2) sino");
                            int Carga = k1ng.nextInt();
                            if (Carga == 1) {
                                h++;
                                System.out.println("Ingrese un maximo de carga");
                                int Carga1 = k1ng.nextInt();
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Desea una excavadora? 1=si 2=no");
                                    int Fiddle = k1ng.nextInt();

                                    if (Fiddle == 1) {
                                        i++;
                                        Teemo = true;
                                    } else if (Fiddle == 2) {
                                        Teemo = false;
                                        i++;
                                    } else {
                                        System.out.println("De nuevo");
                                        i--;
                                    }
                                }
                                CamionDCarga KXMI = new CamionDCarga(Carga1, Teemo, Color, Modelo, Fabri, Precio, llantas);
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
                                    int Cambiar = k1ng.nextInt();
                                    if (Cambiar >= Listado.size()) {
                                        i--;
                                        System.out.println("Mal Ingresado");
                                    } else {
                                        i++;
                                        Listado.get(Cambiar).VehiculosVenta.add(KXMI);
                                    }
                                }
                            } else if (Carga == 2) {
                                System.out.println("Ingrese la cantidad de pasajeros");
                                int Pass = k1ng.nextInt();
                                Bus KXMI = new Bus(Pass, Color, Modelo, Fabri, Precio, llantas);
                                h++;
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
                                    int Cambiar = k1ng.nextInt();
                                    if (Cambiar >= Listado.size()) {
                                        i--;
                                        System.out.println("Mal Ingresado");
                                    } else {
                                        i++;
                                        Listado.get(Cambiar).VehiculosVenta.add(KXMI);
                                    }
                                }
                            } else {
                                h--;
                            }
                        }
                    } else {
                        System.out.println("No existen los Vehiculos Monollanteros");
                    }
                }
            } else {
                j--;
            }
        }
    }

    public static void Comprayventadevehiculos() {
        Scanner k1ng = new Scanner(System.in);
        CrearConsecionaria();
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
            int Cambiar = k1ng.nextInt();
            if (Cambiar >= Listado.size()) {
                i--;
                System.out.println("Mal Ingresado");
            } else {
                i++;
                for (int j = 0; j < 1; j++) {
                    System.out.println(Listado.get(Cambiar).getVehiculosVenta().get(j));
                }
                int money =Listado.get(Cambiar).getPresupuesto();
                if (money >0 ) {
                    
                }else{
                    System.out.println("no se pudo");
                }
            }
        }
    }

    public static void CrearConsecionaria() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa: ");
        String nombre = k1ng.nextLine();
        k1ng = new Scanner(System.in);
        System.out.println("Ingrese el id de la empresa");
        String ID = k1ng.nextLine();
        k1ng = new Scanner(System.in);
        System.out.println("Ingrese la direccion de la empresa");
        String Dirr = k1ng.nextLine();
        System.out.println("Ingrese el presupuesto: ");
        int Pressu = k1ng.nextInt();
        Concesionario Conse = new Concesionario(nombre, ID, Dirr, Pressu);
        Listado.add(Conse);
    }

    public static void MODCliente() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar el nombre del cliente \n"
                + "2. Cambiar ID del nombre \n"
                + "3. Cambiar Dinero que posee \n"
                + "4. Cambiar el Carro que posee\n"
                + "5. Eliminar"
                + "6. CAmbiar Presupuesto\n"
                + "7. Eliminar");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 8) {
                if ((menu > 0) && (menu < 9)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            ListarClientes();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el Nombre: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Personas.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombre = k1ng.nextLine();
                                    Personas.get(Cambiar).setNombre(nombre);
                                }
                            }
                            break;
                        case 2:
                            ListarClientes();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el ID: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Personas.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo ID");
                                    String nombre = k1ng.nextLine();
                                    Personas.get(Cambiar).setIDunique(nombre);
                                }
                            }
                            break;
                        case 3:
                            ListarClientes();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el Dinero: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Personas.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo Dinero");
                                    int nombre = k1ng.nextInt();
                                    // Validacion**
                                    Personas.get(Cambiar).setBilletera(nombre);
                                }
                            }
                            break;
                        case 4:
                            ListarClientes();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero de la persona que desea cambiar el Dinero: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Personas.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo dinero");
                                    int nombre = k1ng.nextInt();
                                    Personas.get(Cambiar).setBilletera(nombre);
                                }
                            }
                            break;
                        case 5:
                            ListarClientes();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del concsionario que desea cambiar la direccion de las personas: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Personas.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    Personas.remove(Cambiar);
                                }
                            }

                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. CRUD Concecionaria \n"
                            + "2. CRUD Clientes \n"
                            + "3. CRUD Vehiculos \n"
                            + "4. Compra y venta de vehiculos\n"
                            + "5. Salida");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");

    }

    public static void MODConsecionaria() {
        Scanner k1ng = new Scanner(System.in);
        System.out.println("Bienvenid al menu \n"
                + "1. Cambiar el nombre de la empresa \n"
                + "2. Cambiar ID de la empresa \n"
                + "3. Cambiar Direccion \n"
                + "4. Ver listado\n"
                + "5. Mod Cliente\n"
                + "6. CAmbiar Presupuesto\n"
                + "7. Eliminar");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 7) {
                if ((menu > 0) && (menu < 8)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                            ListarConsecionarios();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del concsionario que desea cambiar el Nombre: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Listado.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nombre = k1ng.nextLine();
                                    Listado.get(Cambiar).setNombremp(nombre);
                                }
                            }
                            break;
                        case 2:
                            ListarConsecionarios();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del concsionario que desea cambiar el ID: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Listado.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo ID");
                                    String nombre = k1ng.nextLine();
                                    Listado.get(Cambiar).setIDEmpresa(nombre);
                                }
                            }
                            break;
                        case 3:
                            ListarConsecionarios();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del concsionario que desea cambiar la direccion del concecionario: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Listado.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese la nueva Direccion");
                                    String nombre = k1ng.nextLine();
                                    Listado.get(Cambiar).setDireccion(nombre);
                                }
                            }
                            break;
                        case 4:
                            ListarConsecionarios();
                            break;
                        case 6:
                            ListarConsecionarios();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del concsionario que desea cambiar la direccion del concecionario: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Listado.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    System.out.println("Ingrese el nuevo presupuesto");
                                    int nombre = k1ng.nextInt();
                                    Listado.get(Cambiar).setPresupuesto(nombre);
                                }
                            }
                            break;
                        case 7:
                            ListarConsecionarios();
                            for (int i = 0; i < 1; i++) {
                                System.out.println("Ingrese el numero del concsionario que desea cambiar la direccion del concecionario: ");
                                int Cambiar = k1ng.nextInt();
                                if (Cambiar >= Listado.size()) {
                                    i--;
                                    System.out.println("Mal Ingresado");
                                } else {
                                    i++;
                                    Listado.remove(Cambiar);
                                }
                            }
                            break;

                    }// switch menu p
                    System.out.println("Bienvenid al menu \n"
                            + "1. Cambiar el nombre de la empresa \n"
                            + "2. Cambiar ID de la empresa \n"
                            + "3. Cambiar Direccion \n"
                            + "4. Mod Vehiculo\n"
                            + "5. Mod Cliente\n"
                            + "6. CAmbiar Presupuesto\n"
                            + "7. Eliminar");
                    menu = k1ng.nextInt();

                } else {
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
                }//if
            }//while
        }//for

        System.out.println("Fin");
    }

    public static void ListarConsecionarios() {
        for (int a = 0; a < Listado.size(); a++) {
            System.out.println(Listado.get(a));
        }
    }

    public static void ListarClientes() {
        for (int a = 0; a < Personas.size(); a++) {
            System.out.println(Personas.get(a));
        }
    }

    public static void ModVehiculos() {
        Scanner k1ng = new Scanner(System.in);
        CrearConsecionaria();
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el numero del concsionario que desea Agregar el carro: ");
            int Cambiar = k1ng.nextInt();
            if (Cambiar >= Listado.size()) {
                i--;
                System.out.println("Mal Ingresado");
            } else {
                i++;
                for (int j = 0; j < 1; j++) {
                    System.out.println(Listado.get(Cambiar).getVehiculosVenta().get(j));
                }
                System.out.println("Ingrese el carro que desea cambiar ");
                int carro = k1ng.nextInt();
                if (Listado.get(Cambiar).getVehiculosVenta().get(carro) instanceof Carro) {
                    System.out.println("Bienvenid al menu \n"
                            + "1. cambiar cant puertas \n"
                            + "2. cambiar descript motor\n"
                            + "3. cambiar velocidad");
                    int menu = k1ng.nextInt();
                    for (int x = 0; x < 1; x++) {
                        while (menu != 4) {
                            if ((menu > 0) && (menu < 4)) { // 4 es igual al numero limite que deseo agregar
                                x++;
                                switch (menu) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad de puertas");
                                        int newcant = k1ng.nextInt();
                                        ((Carro) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setCantidadPuertas(newcant);
                                        break;
                                    case 2:
                                        k1ng = new Scanner(System.in);
                                        System.out.println("Ingrese la nueva descripcion");
                                        String newdesp = k1ng.nextLine();
                                        ((Carro) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setDescripMotor(newdesp);
                                        break;
                                    case 3:
                                        k1ng = new Scanner(System.in);
                                        System.out.println("Ingrese la cantidad de puertas");
                                        int newpas = k1ng.nextInt();
                                        ((Carro) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setCantidadPuertas(newpas);
                                        break;
                                }// switch menu p
                                System.out.println("Bienvenid al menu \n"
                                        + "1. cambiar cant puertas \n"
                                        + "2. cambiar descript motor\n"
                                        + "3. cambiar velocidad");
                                menu = k1ng.nextInt();

                            } else {
                                System.out.println("Ingrese adecuadamente el numero");
                                x--;
                            }//if
                        }//while
                    }//for

                    System.out.println("Fin");
                } else if ((Listado.get(Cambiar).getVehiculosVenta().get(carro) instanceof Motocicleta)) {
                    System.out.println("Bienvenid al menu \n"
                            + "1. cambiar el desplacamiento \n");
                    int menu = k1ng.nextInt();
                    for (int x = 0; x < 1; x++) {
                        while (menu != 2) {
                            if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                                x++;
                                switch (menu) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo  desplacamiento");
                                        int newcant = k1ng.nextInt();
                                        ((Motocicleta) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setDesplasamiento(newcant);
                                        break;
                                }// switch menu p
                                System.out.println("Bienvenid al menu \n"
                                        + "1. cambiar el desplacamiento \n");
                                menu = k1ng.nextInt();

                            } else {
                                System.out.println("Ingrese adecuadamente el numero");
                                x--;
                            }//if
                        }//while
                    }//for

                    System.out.println("Fin");

                } else if ((Listado.get(Cambiar).getVehiculosVenta().get(carro) instanceof Bus)) {
                    System.out.println("Bienvenid al menu \n"
                            + "1. cambiar el desplacamiento \n"
                            + "2. ");
                    int menu = k1ng.nextInt();
                    for (int x = 0; x < 1; x++) {
                        while (menu != 2) {
                            if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                                x++;
                                switch (menu) {
                                    case 1:
                                        System.out.println("Ingrese el cantidad de pasajeros");
                                        int newcant = k1ng.nextInt();
                                        ((Bus) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setCantidadPasajeros(newcant);
                                        break;
//                                    case 2:
//                                        k1ng = new Scanner(System.in);
//                                        System.out.println("Ingrese la cantidad de puertas");
//                                        int newpas = k1ng.nextInt();
//                                        ((Bus) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setCantidadPuertas(newpas);
//                                        break;
                                }// switch menu p
                                System.out.println("Bienvenid al menu \n"
                                        + "1. cambiar el desplacamiento \n");
                                menu = k1ng.nextInt();

                            } else {
                                System.out.println("Ingrese adecuadamente el numero");
                                x--;
                            }//if
                        }//while
                    }//for

                    System.out.println("Fin");
                } else if ((Listado.get(Cambiar).getVehiculosVenta().get(carro) instanceof Bicicleta)) {
                    System.out.println("Bienvenid al menu \n"
                            + "1. cambiar el desplacamiento \n"
                            + "2. ");
                    int menu = k1ng.nextInt();
                    for (int x = 0; x < 1; x++) {
                        while (menu != 5) {
                            if ((menu > 0) && (menu < 3)) { // 4 es igual al numero limite que deseo agregar
                                x++;
                                switch (menu) {
                                    case 1:
                                        System.out.println("Ingrese el radio de la puerta ");
                                        double newcant = k1ng.nextDouble();
                                        ((Bicicleta) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setRadioRueda(newcant);
                                        break;
                                    case 2:
                                        k1ng = new Scanner(System.in);
                                        System.out.println("Ingrese la nueva descripcion");
                                        String newdesp = k1ng.nextLine();
                                        ((Bicicleta) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setDescripcion(newdesp);
                                        break;
                                    case 3:
                                        k1ng = new Scanner(System.in);
                                        System.out.println("Ingrese la cantidad de puertas");
                                        String pascTipo = k1ng.nextLine();
                                        ((Bicicleta) Listado.get(Cambiar).getVehiculosVenta().get(carro)).setTipo(pascTipo);
                                        break;
                                }// switch menu p
                                System.out.println("Bienvenid al menu \n"
                                        + "1. cambiar el desplacamiento \n");
                                menu = k1ng.nextInt();

                            } else {
                                System.out.println("Ingrese adecuadamente el numero");
                                x--;
                            }//if
                        }//while
                    }//for

                    System.out.println("Fin");
                }
            }
        }

    }
}
