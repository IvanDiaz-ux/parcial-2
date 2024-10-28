import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private  String correo;
    List<Producto> lstProductocomprado = new ArrayList<>();

    public Cliente(String correo, List<Producto> lstProductocomprado, String nombre) {
        this.correo = correo;
        this.lstProductocomprado = lstProductocomprado;
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getLstProductocomprado() {
        return lstProductocomprado;
    }

    public void setLstProductocomprado(List<Producto> lstProductocomprado) {
        this.lstProductocomprado = lstProductocomprado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", lstProductocomprado=" + lstProductocomprado +
                '}';
    }
    public void compararProducto(Producto producto, int cantidad){
        if(producto.catidadStock>=cantidad){
            productoComprados.add(producto);
            CantidadesCompradas.add(cantidad);
            producto.catidadStock-= cantidad;
        }else {
            System.out.println("NO HAY SUFICIENTE" + producto.nombre);
        }
    }
    public void mostrarCompra(){

        System.out.println("Cliente: " + nombre + " - " + correo);
        double totalCompra = 0;
        for (int i = 0; i < productosComprados.size(); i++) {
            Producto producto = productosComprados.get(i);
            int cantidad = cantidadesCompradas.get(i);
            double costo = 0;
            if (producto instanceof Vendible) {
                costo = ((Vendible) producto).calcularPrecioVenta(cantidad);
            }
            totalCompra += costo;
            System.out.println("Producto: " + producto.nombre + " - Cantidad: " + cantidad + " - Costo: $" + costo);
        }
        System.out.println("Total de la compra: $" + totalCompra);
    }


    }
}
