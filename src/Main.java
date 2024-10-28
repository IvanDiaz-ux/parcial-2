// IVAN CAMILO DIAZ RODRIGUEZ 935388
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(5, "LENOVO", "YOGA", 4000000, "8GB", "INTEL I5");
        Celular celular1 = new Celular(2, "SAMSUNG", "A32", 700000, 4000, 56);

        // Creación de clientes
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(

        // Proceso de compra
        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 7); // Aplica descuento

        cliente2.comprarProducto(celular1, 2);
        cliente2.comprarProducto(laptop1, 1);

        // Mostrar compras de cada cliente
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }




    }
}