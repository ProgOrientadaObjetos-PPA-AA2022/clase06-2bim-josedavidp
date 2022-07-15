/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;

import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        //pedir al usuario una ciudad y una poblacion en un ciclo repetitivo
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int salir = 0;

        Enlace c = new Enlace();
        /*Ciudad ciudad = new Ciudad("Machala", 400121);
        c.insertarCiudad(ciudad);*/

        while (bandera) {
            System.out.println("Introduce una ciudad: ");
            String ciudadIntroducida = sc.nextLine();
            System.out.println("Introduce una poblacion: ");
            int poblacionIntroducida = sc.nextInt();
            Ciudad ciudad = new Ciudad(ciudadIntroducida, poblacionIntroducida);
            c.insertarCiudad(ciudad);

            sc.nextLine();
            System.out.println("Ingrese 2 para salir");
            salir = sc.nextInt();
            
            if (salir == 2) {
                bandera = false;
            }
        }

    }
}

/*for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }*/
