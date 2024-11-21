package PruebaEjercicio3;
import Ejercicio3.Persona;
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);

        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Pedro");
        System.out.println("Nuevo nombre: " + persona.getNombre());

        System.out.println("Edad: " + persona.edad);
        persona.edad = 30;
        System.out.println("Nueva edad: " + persona.edad);
    }
}

