package poo_c_veterinaria;

public class Cliente {

    private int nroCliente;
    private String nombre;
    private int antiguedad;
    private Mascota mascotas;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota mascotas) {
        this.mascotas = mascotas;
    }
    
    public Cliente() {
        nroCliente = 0;
        nombre = "";
        antiguedad = 0;
        mascotas = new Mascota();
    }
    
    public Cliente(int nroCliente, String nombre, int antiguedad, Mascota mascotas) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Cliente Nro: " + nroCliente + " | "
                + "Nombre: " + nombre + " | "
                + "Antigüedad: " + antiguedad +  " | "
                + mascotas;
    }
}
