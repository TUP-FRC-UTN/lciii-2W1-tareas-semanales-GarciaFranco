package poo_equipo;

import java.util.Scanner;

public class POO_Equipo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equipo e = new Equipo();

        System.out.print("Nombre del equipo: ");
        e.setNombre(sc.nextLine());
        System.out.print("Partidos Ganados: ");
        e.setpG(sc.nextInt());
        System.out.print("Partidos Empatados: ");
        e.setpE(sc.nextInt());
        System.out.print("Partidos Perdidos: ");
        e.setpP(sc.nextInt());
        System.out.print("Goles a Favor: ");
        e.setgF(sc.nextInt());
        System.out.print("Goles en Contra: ");
        e.setgC(sc.nextInt());
        e.calcularDifGoles();

        System.out.println(e.toString());
    }
}
