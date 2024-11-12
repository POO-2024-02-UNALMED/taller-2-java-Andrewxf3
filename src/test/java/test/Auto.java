package test;

class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        if (motor != null && motor.registro != registro) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }
}
