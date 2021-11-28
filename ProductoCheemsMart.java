import java.util.List;
import java.util.Random;

public class ProductoCheemsMart implements Producto {
    
    private String nombre;
    private double precio;
    private String departamento;
    private String codigoDeBarras;

    public ProductoCheemsMart(String nombre, double precio,
                              String departamento) {
        this.nombre = nombre;
        this.precio = precio;
        this.departamento = departamento;
        generadorCodigoDeBarras();
    }

    public void generadorCodigoDeBarras() {
        Random rand = new Random(1000);
        this.codigoDeBarras = departamento.charAt(0)
                + "-" + departamento.charAt(1) + "-" + departamento.charAt(2)
                + nombre.charAt(0) + "-" + nombre.charAt(1) + "-" + nombre.charAt(2)
                + rand.nextInt();
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

    public String getCodigo() {
        return this.codigoDeBarras;
    }

    public List<Producto> getListaProductos() {
        return null;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

}
