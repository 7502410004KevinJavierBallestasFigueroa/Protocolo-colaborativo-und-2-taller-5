package Ejercicio2Part1;

class Vehiculo {

    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}