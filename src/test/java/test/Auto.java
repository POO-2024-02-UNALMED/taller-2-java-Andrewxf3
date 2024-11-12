package test;

public class Auto {
    String modelo;
    int precio;
    Asiento asiento1;
    Asiento asiento2;
    Asiento asiento3;
    Asiento asiento4;
    Asiento asiento5;
    Asiento asiento6;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

    public Auto(String modelo, int precio, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int contador = 0;
        if (asiento1 != null) contador++;
        if (asiento2 != null) contador++;
        if (asiento3 != null) contador++;
        if (asiento4 != null) contador++;
        if (asiento5 != null) contador++;
        if (asiento6 != null) contador++;
        return contador;
    }

    public String verificarIntegridad() {
        if (this.registro != motor.registro) {
            return "Las piezas no son originales";
        }
        if ((asiento1 != null && asiento1.registro != this.registro) ||
            (asiento2 != null && asiento2.registro != this.registro) ||
            (asiento3 != null && asiento3.registro != this.registro) ||
            (asiento4 != null && asiento4.registro != this.registro) ||
            (asiento5 != null && asiento5.registro != this.registro) ||
            (asiento6 != null && asiento6.registro != this.registro)) {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}