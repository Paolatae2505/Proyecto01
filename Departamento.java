import java.util.ArrayList;
import java.util.List;

public class Departamento implements Producto {

    private String nombre;
    private List<Producto> productos = new ArrayList<>();
    private String codigo;


    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public double getPrecio() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto getProducto(String nombreDelProducto) {
        Producto productoFInal = null;
        for (Producto producto : productos) {
            String nombre = producto.getNombre();
            if (nombre.equals(nombreDelProducto) == true)
                productoFInal = producto;
        }
        return productoFInal;

    }

    public String getCodigo() {
        codigo = nombre.charAt(0)
                + "-" + nombre.charAt(1) + "-" + nombre.charAt(2);
        return codigo;
    }

    public List<Producto> getListaProductos() {
        return this.productos;
    }

    public void mostrarInformacion() {
        int i = 1;
        for (Producto producto : productos) {
            System.out.print(i +") ");
            producto.mostrarInformacion();
            i++;
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

}
