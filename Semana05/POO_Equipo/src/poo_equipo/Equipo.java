package poo_equipo;

public class Equipo {

    private String nombre;
    private int pJ, pG, pP, pE;
    private int gF, gC;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpJ() {
        return pJ;
    }

    public void setpJ(int pJ) {
        this.pJ = pJ;
    }

    public int getpG() {
        return pG;
    }

    public void setpG(int pG) {
        this.pG = pG;
    }

    public int getpP() {
        return pP;
    }

    public void setpP(int pP) {
        this.pP = pP;
    }

    public int getpE() {
        return pE;
    }

    public void setpE(int pE) {
        this.pE = pE;
    }

    public int getgF() {
        return gF;
    }

    public void setgF(int gF) {
        this.gF = gF;
    }

    public int getgC() {
        return gC;
    }

    public void setgC(int gC) {
        this.gC = gC;
    }

    public Equipo(String nombre, int pJ, int pG, int pE, int pP, int gF, int gC) {
        this.nombre = nombre;

        this.pJ = pJ;
        this.pG = pG;
        this.pE = pE;
        this.pP = pP;
        this.gF = gF;
        this.gC = gC;
    }

    public Equipo() {
        nombre = "";
        pJ = 0;
        pG = 0;
        pE = 0;
        pP = 0;
        gF = 0;
        gC = 0;
    }
    public int calcularDifGoles() {
        return gF - gC;
    }

    public int calcularPuntos() {
        return (pG * 3) + (pE * 1) + (pP * 0);
    }
    public int calcularPartJugados()
    {
        return pG+pE+pP;
    }
    public String toString() {
        return nombre + " | "
                + "Pts: " + calcularPuntos() + " | "
                + "PJ: " + calcularPartJugados() + " | "
                + "PG: " + pG + " | "
                + "PE: " + pE + " | "
                + "PP: " + pP + " | "
                + "GF: " + gF + " | "
                + "GC: " + gC + " | "
                + "DifG: " + calcularDifGoles();
    }
}
