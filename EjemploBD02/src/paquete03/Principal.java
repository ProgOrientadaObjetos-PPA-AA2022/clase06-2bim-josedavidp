/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        /*Enlace c = new Enlace();
        Auto a = new Auto();
        a.establecerPlaca("LBNS0001");
        a.establecerValorMatricula(200.2);
        
        c.insertarAuto(a);
        
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }*/
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean bandera = true;

        Enlace c = new Enlace();

        while (bandera) {
            System.out.println("Introduce la placa: ");
            String placa = sc.nextLine();
            System.out.println("Introduce el valor de la matricula: ");
            double matricula = sc.nextDouble();

            Auto auto = new Auto();
            auto.establecerPlaca(placa);
            auto.establecerValorMatricula(matricula);
            c.insertarAuto(auto);

            System.out.println("Ingrese 2 para salir");
            int salir = sc.nextInt();
            sc.nextLine();
            if (salir == 2) {
                bandera = false;
            }
        }

    }
}
