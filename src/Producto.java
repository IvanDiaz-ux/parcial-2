abstract  class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected  int catidadStock;

    public Producto() {

    }

    public Producto(int catidadStock, String marca, String nombre, double precio) {
        this.catidadStock = catidadStock;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCatidadStock() {
        return catidadStock;
    }

    public void setCatidadStock(int catidadStock) {
        this.catidadStock = catidadStock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    @Override
    public String toString() {
        return "Producto{" +
                "catidadStock=" + catidadStock +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
    public String mostraInformacion() {
        System.out.println("MARCA" + marca);
        System.out.println("PRECIO"+ precio);
        System.out.println("NOMMBRE"+ nombre);
        System.out.println("CANTIDAD EN STOCK"+ catidadStock);
        return "";
    }
}
