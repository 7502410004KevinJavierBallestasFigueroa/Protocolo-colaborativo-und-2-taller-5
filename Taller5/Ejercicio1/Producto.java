package Ejercicio1;

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

        void mostrarInfo() {
            System.out.println("Producto: " + getNombre());
            System.out.println("Precio: " + getPrecio() + " pesos");
            System.out.println("Stock: " + getStock() + " unds");
        }
}
