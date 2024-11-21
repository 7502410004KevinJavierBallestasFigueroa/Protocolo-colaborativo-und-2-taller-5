package Ejercicio2Part1;

class Moto extends Vehiculo{
    public Moto(String tipo){
        super(tipo);
    }
    @Override
    public void mostrarTipo() {
        System.out.println("Tipo de moto: " + tipo);
    }
}
