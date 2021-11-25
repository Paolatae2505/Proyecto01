public class ProductoCheemsMart implements Producto {


    private String nombre;
    private double precio;
    private String departamento;
    private String codigoDeBarras;

    public ProductoCheemsMart(String nombre, double precio,
                              String departamento, String codigoDeBarras) {
        this.nombre = nombre;
        this.precio = precio;
        this.departamento = departamento;
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Precio : " + precio);
        System.out.println("Departamento :" + departamento);
        System.out.println("Codigo De Barras :" + codigoDeBarras);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
