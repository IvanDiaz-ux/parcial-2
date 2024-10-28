public class Celular extends Producto implements Vendible{
    private int capacidadBateria;
    private int resolucionCamara;

    public Celular(int capacidadBateria, int resolucionCamara) {
        this.capacidadBateria = capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }

    public Celular(int catidadStock, String marca, String nombre, double precio, int capacidadBateria, int resolucionCamara) {
        super(catidadStock, marca, nombre, precio);
        this.capacidadBateria = capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(int resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capacidadBateria=" + capacidadBateria +
                ", resolucionCamara=" + resolucionCamara +
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

    public Celular() {
        super();
    }

    public Celular(int catidadStock, String marca, String nombre, double precio) {
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
        System.out.println("CAPACIDAD BATERIA"+capacidadBateria);
        System.out.println("RESOLUCION DE LA CAMARA"+resolucionCamara);

    }
    public double calcularPrecioVenta(int cantidad){
         double total =precio* cantidad;
         if (cantidad<5){
             total*=0.9;
         }
        return total;
    }
}
