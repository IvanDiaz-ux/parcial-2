public class Laptop extends Producto implements Vendible{
 private String procesador;
 private String memoriaRAM;

    public Laptop(String memoriaRAM, String procesador) {
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    public Laptop(int catidadStock, String marca, String nombre, double precio, String memoriaRAM, String procesador) {
        super(catidadStock, marca, nombre, precio);
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "memoriaRAM='" + memoriaRAM + '\'' +
                ", procesador='" + procesador + '\'' +
                ", catidadStock=" + catidadStock +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int getCatidadStock() {
        return super.getCatidadStock();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public String mostraInformacion() {
        return super.mostraInformacion();
    }

    public Laptop() {
        super();
    }

    public Laptop(int catidadStock, String marca, String nombre, double precio) {
        super(catidadStock, marca, nombre, precio);
    }

    @Override
    public void setCatidadStock(int catidadStock) {
        super.setCatidadStock(catidadStock);
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }
     public void mostrarInformacion(){
         System.out.println("MARCA" + marca);
         System.out.println("PRECIO"+ precio);
         System.out.println("NOMMBRE"+ nombre);
         System.out.println("CANTIDAD EN STOCK"+ catidadStock);
         System.out.println("MEMORIA RAM"+ memoriaRAM);
         System.out.println("PROCESADOR"+ procesador);

     }
     public double calcularPrecioVenta(int cantidad){
         double total =precio* cantidad;
         if (cantidad<5){
             total*=0.9;
         }
         return total;
     }

}
