package test;

class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo.equals("electrico") || nuevoTipo.equals("gasolina")) {
            this.tipo = nuevoTipo;
        }
    }
}