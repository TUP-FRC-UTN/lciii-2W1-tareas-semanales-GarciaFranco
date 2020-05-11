package poo_c_veterinaria;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes;
        int sumEdad = 0, contAnt5 = 0;

        System.out.print("Ingrese la cantidad de clientes a cargar: ");
        clientes = new Cliente[sc.nextInt()];

        for (int i = 0; i < clientes.length; i++) {
            Cliente cli = new Cliente();
            System.out.print("Codigo: ");
            cli.setNroCliente(sc.nextInt());
            cli.setNombre(sc.nextLine());
            System.out.print("Nombre: ");
            cli.setNombre(sc.nextLine());
            System.out.print("Antigüedad [en años]: ");
            cli.setAntiguedad(sc.nextInt());
            if(cli.getAntiguedad()>5)
            {
                contAnt5++;
            }

            Mascota m = new Mascota();
            System.out.print("Nombre de la mascota: ");
            sc.nextLine();
            m.setNombre(sc.nextLine());
            System.out.print("Edad de la mascota: ");
            m.setEdad(sc.nextInt());

            cli.setMascotas(m);
            clientes[i] = cli;
            System.out.println("Cliente registrado con exito.");
        }
        System.out.println("Cantidad de clientes cargados: " + clientes.length);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
        
        for (int i = 0; i < clientes.length; i++) {
            sumEdad += clientes[i].getMascotas().getEdad();
        }
        double promEdad = (double) sumEdad / clientes.length;
        System.out.println("El promedio de edad de las mascotas es: " + promEdad);
        
        System.out.println("Clientes con +5 años de antigüedad: " + contAnt5);
    }
}
