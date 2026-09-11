package ar.edu.unahur.obj2.excepcions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        try {
            System.out.print("Ingrese la patente: " );
            String patente = sc.nextLine();
            if(!patente.isEmpty()) {
                System.out.print("Ingrese la cantidad de horas: ");
                Integer horas = Integer.valueOf(sc.nextLine());
                Vehiculo vehiculo = new Vehiculo(patente);
                vehiculo.setHorasEstacionadas(horas);
                vehiculos.add(vehiculo);
            }
            System.out.print("Ingrese otra patente: ");
            patente = sc.nextLine();
            if(!patente.isEmpty()) {
                System.out.print("Ingrese la cantidad de horas: ");
                Integer horas = Integer.valueOf(sc.nextLine());
                Vehiculo vehiculo = new Vehiculo(patente);
                vehiculo.setHorasEstacionadas(horas);
                vehiculos.add(vehiculo);
            }
            System.out.print("Ingrese la ultima patente: ");
            patente = sc.nextLine();
            if(!patente.isEmpty()) {
                System.out.print("Ingrese la cantidad de horas: ");
                Integer horas = Integer.valueOf(sc.nextLine());
                Vehiculo vehiculo = new Vehiculo(patente);
                vehiculo.setHorasEstacionadas(horas);
                vehiculos.add(vehiculo);
            }
        } catch (HorasInvalidasException e) {
            System.out.println("ERROR, " + e.getMessage());
        } finally {
            sc.close();
        }

        System.out.println("Vehiculos ingresados correctamente");
        for (Vehiculo vehciulo : vehiculos) {
            System.out.println(vehciulo);
        }
    }
}