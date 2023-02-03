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
                + "4. Compra y venta de vehiculos");
        int menu = k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu != 4) {
                if ((menu > 0) && (menu < 4)) { // 4 es igual al numero limite que deseo agregar
                    x++;
                    switch (menu) {
                        case 1:
                                break;

                    }// switch menu p
                System.out.println("Bienvenid al menu \n"
                + "1. CRUD Concecionaria \n"
                + "2. CRUD Clientes \n"
                + "3. CRUD Vehiculos \n"
                + "4. Compra y venta de vehiculos");
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