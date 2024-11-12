package test;
import java.util.ArrayList;

public class Auto {
    String modelo;
    int precio;
    ArrayList<Asiento> asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

    public Auto(String modelo, int precio, ArrayList<Asiento> asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad() {
        if (this.registro != motor.registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}