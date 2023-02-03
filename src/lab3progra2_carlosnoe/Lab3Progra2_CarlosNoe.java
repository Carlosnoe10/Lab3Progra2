package lab3progra2_carlosnoe;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3Progra2_CarlosNoe {

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

                            break;
                        case 2:
    ;
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

    public static void CRUDClientes() {

    }

    public static void CRUDVehiculos() {

    }

    public static void Comprayventadevehiculos() {

    }

    public static int DecisionLLantas() {
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
        int Pressu=k1ng.nextInt();
        Concesionario Conse= new Concesionario(nombre, ID, Dirr, Pressu);
    }
    
}
